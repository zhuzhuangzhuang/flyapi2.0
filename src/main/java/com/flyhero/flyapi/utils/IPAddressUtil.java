package com.flyhero.flyapi.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class IPAddressUtil {

	private static Logger log = Logger.getLogger(IPAddressUtil.class);

	public static String getRemortIP(HttpServletRequest request) {
		if (request.getHeader("x-forwarded-for") == null) {
			return request.getRemoteAddr();
		}
		return request.getHeader("x-forwarded-for");
	}

	public static String getIPAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unkonwn".equalsIgnoreCase(ip)) {
			ip = request.getHeader("PRoxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unkonwn".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unkonwn".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		if (ip == null || ip.length() == 0 || "unkonwn".equalsIgnoreCase(ip)) {
			ip = request.getHeader("http_client_ip");
		}
		if (ip == null || ip.length() == 0 || "unkonwn".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDEC_FOR");
		}
		if (ip != null && ip.indexOf(",") != -1) {
			ip = ip.substring(ip.lastIndexOf(",") + 1, ip.length()).trim();
		}
		return ip;
	}
	/**
	 * 
	 * @param content
	 *            请求的参数 格式为：name=xxx&pwd=xxx
	 * @param encoding
	 *            服务器端请求编码。如GBK,UTF-8等
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String getPosition(String content, String encodingString) {
		try {
			// 这里调用pconline的接口
			String urlStr = "http://ip.taobao.com/service/getIpInfo.php";
			// 从http://whois.pconline.com.cn取得IP所在的省市区信息
			String returnStr = getResult(urlStr, content, encodingString);
			if (returnStr != null) {
				// 处理返回的省市区信息
				log.info("result:" + returnStr);
				String[] temp = returnStr.split(",");
				if (temp.length < 3) {
					return "0";// 无效IP，局域网测试
				}

				String country = "";
				String area = "";
				String region = "";
				String city = "";
				String county = "";
				String isp = "";
				for (int i = 0; i < temp.length; i++) {
					switch (i) {
					case 1:
						country = (temp[i].split(":"))[2].replaceAll("\"", "");
						country = decodeUnicode(country);// 国家
						break;
					case 3:
						area = (temp[i].split(":"))[1].replaceAll("\"", "");
						area = decodeUnicode(area);// 地区
						break;
					case 5:
						region = (temp[i].split(":"))[1].replaceAll("\"", "");
						region = decodeUnicode(region);// 省份
						break;
					case 7:
						city = (temp[i].split(":"))[1].replaceAll("\"", "");
						city = decodeUnicode(city);// 市区
						break;
					case 9:
						county = (temp[i].split(":"))[1].replaceAll("\"", "");
						county = decodeUnicode(county);// 地区
						break;
					case 11:
						isp = (temp[i].split(":"))[1].replaceAll("\"", "");
						isp = decodeUnicode(isp); // ISP公司
						break;
					}
				}
				return country + "," + area + "," + region + "," + city + "," + county + "," + isp;
			}
			return null;
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return null;
	}

	/**
	 * @param urlStr
	 *            请求的地址
	 * @param content
	 *            请求的参数 格式为：name=xxx&pwd=xxx
	 * @param encoding
	 *            服务器端请求编码。如GBK,UTF-8等
	 * @return
	 */
	private static String getResult(String urlStr, String content, String encoding) {
		URL url = null;
		HttpURLConnection connection = null;
		try {

			url = new URL(urlStr);
			connection = (HttpURLConnection) url.openConnection();// 新建连接实例
			connection.setConnectTimeout(2000);// 设置连接超时时间，单位毫秒
			connection.setReadTimeout(2000);// 设置读取数据超时时间，单位毫秒
			connection.setDoOutput(true);// 是否打开输出流 true|false
			connection.setDoInput(true);// 是否打开输入流true|false
			connection.setRequestMethod("POST");// 提交方法POST|GET
			connection.setUseCaches(false);// 是否缓存true|false
			connection.connect();// 打开连接端口
			DataOutputStream out = new DataOutputStream(connection.getOutputStream());// 打开输出流往对端服务器写数据
			out.writeBytes("ip=" + content);// 写数据,也就是提交你的表单 name=xxx&pwd=xxx
			out.flush();// 刷新
			out.close();// 关闭输出流
			// 往对端写完数据对端服务器返回数据,以BufferedReader流来读取
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding));
			StringBuffer buffer = new StringBuffer();
			String line = "";
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			reader.close();
			return buffer.toString();
		} catch (IOException e) {
			log.error(e.getMessage());
		} finally {
			if (connection != null) {
				connection.disconnect();// �ر�����
			}
		}
		return null;
	}

	/**
	 * unicode 转换成 中文
	 * 
	 * @param theString
	 * @return
	 */
	public static String decodeUnicode(String theString) {
		char aChar;
		int len = theString.length();
		StringBuffer outBuffer = new StringBuffer(len);
		for (int x = 0; x < len;) {
			aChar = theString.charAt(x++);
			if (aChar == '\\') {
				aChar = theString.charAt(x++);
				if (aChar == 'u') {
					int value = 0;
					for (int i = 0; i < 4; i++) {
						aChar = theString.charAt(x++);
						switch (aChar) {
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
							value = (value << 4) + aChar - '0';
							break;
						case 'a':
						case 'b':
						case 'c':
						case 'd':
						case 'e':
						case 'f':
							value = (value << 4) + 10 + aChar - 'a';
							break;
						case 'A':
						case 'B':
						case 'C':
						case 'D':
						case 'E':
						case 'F':
							value = (value << 4) + 10 + aChar - 'A';
							break;
						default:
							throw new IllegalArgumentException("Malformed      encoding.");
						}
					}
					outBuffer.append((char) value);
				} else {
					if (aChar == 't') {
						aChar = '\t';
					} else if (aChar == 'r') {
						aChar = '\r';
					} else if (aChar == 'n') {
						aChar = '\n';
					} else if (aChar == 'f') {
						aChar = '\f';
					}
					outBuffer.append(aChar);
				}
			} else {
				outBuffer.append(aChar);
			}
		}
		return outBuffer.toString();
	}

}
