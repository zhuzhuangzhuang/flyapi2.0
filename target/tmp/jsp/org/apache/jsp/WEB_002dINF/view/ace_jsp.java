package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ace_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/static/table/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write(" <link href=\"");
      out.print(request.getContextPath());
      out.write("/static/ace/vendors/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom styling plus plugins -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/static/ace/production/css/custom.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>接口</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"nav-md\">\r\n");
      out.write("\t<div class=\"container body\">\r\n");
      out.write("\t\t<div class=\"main_container\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3 left_col\">\r\n");
      out.write("\t\t\t\t<div class=\"left_col scroll-view\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar nav_title\" style=\"border: 0;\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\" class=\"site_title\"><i class=\"fa fa-paw\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span>flyapi接口管理</span></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t<!-- menu profile quick info -->\r\n");
      out.write("\t\t            <div class=\"profile\">\r\n");
      out.write("\t\t              <div class=\"profile_pic\">\r\n");
      out.write("\t\t                <img src=\"");
      out.print(request.getContextPath());
      out.write("/static/ace/production/images/img.jpg\" alt=\"...\" class=\"img-circle profile_img\">\r\n");
      out.write("\t\t              </div>\r\n");
      out.write("\t\t              <div class=\"profile_info\">\r\n");
      out.write("\t\t                <span>Welcome,</span>\r\n");
      out.write("\t\t                <h2>flyhero</h2>\r\n");
      out.write("\t\t              </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t\t\t\t<!-- /menu profile quick info -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t<!-- sidebar menu -->\r\n");
      out.write("\t\t\t\t\t<div id=\"sidebar-menu\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"main_menu_side hidden-print main_menu\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu_section\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>………………………………</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav side-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a><i class=\"fa fa-home\"></i> 首页 <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"index.html\">Dashboard</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a><i class=\"fa fa-edit\"></i> 我的项目 <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" id=\"my_project\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"form.html\">General Form</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a><i class=\"fa fa-desktop\"></i> 日志监控 <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"general_elements.html\">General Elements</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"widgets.html\">Widgets</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"invoice.html\">Invoice</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"inbox.html\">Inbox</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a><i class=\"fa fa-table\"></i> 数据库字典 <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"tables.html\">Tables</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"tables_dynamic.html\">Table Dynamic</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a><i class=\"fa fa-bar-chart-o\"></i> 数据分析 <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"chartjs.html\">Chart JS</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"chartjs2.html\">Chart JS2</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu_section\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Live On</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav side-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a><i class=\"fa fa-bug\"></i> 添加页 <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"e_commerce.html\">E-commerce</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"projects.html\">Projects</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"project_detail.html\">Project Detail</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"contacts.html\">Contacts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"profile.html\">Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a><i class=\"fa fa-windows\"></i> Extras <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"page_404.html\">404 Error</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"page_500.html\">500 Error</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"plain_page.html\">Plain Page</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"login.html\">Login Page</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"pricing_tables.html\">Pricing Tables</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /sidebar menu -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- /menu footer buttons -->\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-footer hidden-small\">\r\n");
      out.write("\t\t\t\t\t\t<a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Settings\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a> <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"FullScreen\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-fullscreen\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a> <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Lock\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-eye-close\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a> <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Logout\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /menu footer buttons -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- top navigation -->\r\n");
      out.write("\t\t\t<div class=\"top_nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"nav_menu\">\r\n");
      out.write("\t\t\t\t\t<nav class=\"\" role=\"navigation\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nav toggle\">\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i></a> <label>收缩扩展</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nav toggle\">\r\n");
      out.write("\t\t\t\t\t\t\t<a data-toggle=\"modal\" data-target=\"#myModal\" id=\"menu_toggle\"><i class=\"fa fa-plus\"></i> </a> <label>新建项目</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nav toggle\">\r\n");
      out.write("\t\t\t\t\t\t\t<a data-toggle=\"modal\" data-target=\"#myModal3\" id=\"menu_toggle\"><i class=\"fa fa-plus\"></i> </a> <label>新建模块</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"user-profile dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-expanded=\"false\"> <img src=\"");
      out.print(request.getContextPath());
      out.write("/static/ace/production/images/img.jpg\" alt=\"\">flyhero\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\" fa fa-angle-down\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-usermenu pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:;\"> Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:;\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"badge bg-red pull-right\">50%</span> <span>Settings</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:;\">Help</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"login.html\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-sign-out pull-right\"></i> Log Out</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li role=\"presentation\" class=\"dropdown\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:;\" class=\"dropdown-toggle info-number\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\" aria-expanded=\"false\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-envelope-o\"></i> <span class=\"badge bg-green\">6</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul id=\"menu1\" class=\"dropdown-menu list-unstyled msg_list\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trole=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a> <span class=\"image\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/static/ace/production/images/img.jpg\" alt=\"Profile Image\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <span> <span>John Smith</span> <span class=\"time\">3\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmins ago</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <span class=\"message\"> Film festivals used to be\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdo-or-die moments for movie makers. They were where... </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a> <strong>See All Alerts</strong> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /top navigation -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- page content -->\r\n");
      out.write("        <div class=\"right_col\" role=\"main\">\r\n");
      out.write("\r\n");
      out.write("          <div class=\"\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-12\">\r\n");
      out.write(" \t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"panel-title\">版本日志</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-group\" id=\"accordion\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" data-parent=\"#accordion\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"#collapseThree\"> V1.2 </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"collapseThree\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">1.登录、注册功能 2.我的项目->新建项目</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" data-parent=\"#accordion\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"#collapseTwo\"> V1.1 </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"collapseTwo\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">多数据源，日志监控</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"badge pull-right\">2016.10.20</span> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdata-toggle=\"collapse\" data-parent=\"#accordion\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"#collapseOne\"> V1.0 </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"collapseOne\" class=\"panel-collapse collapse in\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">1.登录、注册功能 2.我的项目->新建项目</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t\t<!-- /page content -->\r\n");
      out.write("\t\t<!-- 模态框（Modal） -->\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\taria-hidden=\"true\">×</button>\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">新建项目</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"projectName\">名称</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"projectName\" placeholder=\"请输入名称\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"description\">描述</label>\r\n");
      out.write("\t\t\t\t\t\t<textarea id=\"description\" class=\"form-control\" rows=\"3\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder='描述'></textarea>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"projectVersion\">版本</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"projectVersion\" placeholder=\"版本\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" id=\"createProject\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-primary\">提交</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.modal-content -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.modal-dialog -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal fade\" id=\"myModal3\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\taria-labelledby=\"myModalLabel3\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\taria-hidden=\"true\">×</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel3\">新建模块</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<label for=\"moduleName\">模块名称</label> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"moduleName\"> \r\n");
      out.write("\t\t\t\t\t<label for=\"moduleName\">属于项目</label> \r\n");
      out.write("\t\t\t\t\t<select id=\"moduleProject\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">请选择</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t<label for=\"moduleDes\">描述</label>\r\n");
      out.write("\t\t\t\t\t<textarea id=\"moduleDes\" class=\"form-control\" rows=\"3\"></textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"addModule\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-primary\">提交</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<!-- footer content -->\r\n");
      out.write("\t\t\t<footer>\r\n");
      out.write("\t\t\t\t<div class=\"pull-right\">\r\n");
      out.write("\t\t\t\t\tflyapi接口管理系统V1.0 &nbsp;Copyright &copy;2016. 作者：王清飞 博客：<a\r\n");
      out.write("\t\t\t\t\t\ttarget=\"_blank\" href=\"http://flyhero.top\">flyhero.top</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</footer>\r\n");
      out.write("\t\t\t<!-- /footer content -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/static/table/jquery.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\tvar id = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t\t\talert(\"++\"+id);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\t\t\t\turl : \"getMyProject.do\",\r\n");
      out.write("\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\tuserId : id\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t$.each(data,function(projectIndex, project) {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar timestamp = project[\"project\"].createTime;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#my_project\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'<li><a href=\"goToModule.do?projectId='\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ project[\"project\"].projectId\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ project[\"project\"].projectName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</a></li>');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#moduleProject\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t'<option value=\"'+project[\"project\"].projectId+'\">'+project[\"project\"].projectName+'</option>');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t$(\"#createProject\").click(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\tvar projectName = $(\"#projectName\").val();\r\n");
      out.write("\t\t\t\t\t\tvar projectVersion = $(\"#projectVersion\").val();\r\n");
      out.write("\t\t\t\t\t\tvar description = $(\"#description\").val();\r\n");
      out.write("\t\t\t\t\t\tif (projectName != '' && description != ''\r\n");
      out.write("\t\t\t\t\t\t\t\t&& description != '') {\r\n");
      out.write("\t\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\t\t\t\t\t\turl : \"../project/addProject.do\",\r\n");
      out.write("\t\t\t\t\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tprojectName : projectName,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tprojectVersion : projectVersion,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdescription : description\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\talert(data.msg);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif (data.msg == 'success') {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talert(\"创建成功！\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\talert(\"信息不能为空！\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- Bootstrap -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/static/table/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- FastClick -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/static/ace/vendors/fastclick/lib/fastclick.js\"></script>\r\n");
      out.write("\t<!-- NProgress -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/static/ace/vendors/nprogress/nprogress.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Custom Theme Scripts -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/static/ace/production/js/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
