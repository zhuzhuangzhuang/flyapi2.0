<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<jsp:include page="static.jsp"></jsp:include>
<title>新建项目</title>
    <!-- Custom styling plus plugins -->
    <link href="<%=request.getContextPath()%>/static/ace/production/css/custom.css" rel="stylesheet">
</head>
 <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>flyapi接口管理</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile">
              <div class="profile_pic">
                <img src="<%=request.getContextPath()%>${sessionScope.user.avatarUrl}" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2>flyhero</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />
            <hr>


			<jsp:include page="base/sidebar.jsp"></jsp:include>

          </div>
        </div>

     	<jsp:include page="base/top.jsp"></jsp:include>
        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>新建数据库字典 </h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">

                   <form id="defaultForm"  class="form-horizontal">
                        <fieldset id="fieldset">
                            <div class="form-group">
                                <label class="col-lg-3 control-label">数据库名称</label>
                                <div class="col-lg-5">
                                    <input type="text" class="form-control" name="dbName" id="dbName" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-lg-3 control-label">数据库Url</label>
                                <div class="col-lg-5">
                                    <input type="text" class="form-control" name="dbUrl" id="dbUrl" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-lg-3 control-label">用户名</label>
                                <div class="col-lg-5">
                                    <input type="text" class="form-control" name="dbRoot" id="dbRoot" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-lg-3 control-label">密码</label>
                                <div class="col-lg-5">
                                    <input type="password" class="form-control" name="dbPassword" id="dbPassword" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-lg-3 control-label">驱动包名</label>
                                <div class="col-lg-5">
                                    <select name="dbDriver" id="dbDriver" class="form-control">
													<option value="oracle.jdbc.driver.OracleDriver">oracle.jdbc.driver.OracleDriver</option>
													<option value="com.mysql.jdbc.Driver">com.mysql.jdbc.Driver</option>
													<option value="com.sybase.jdbc2.jdbc.SybDriver">com.sybase.jdbc2.jdbc.SybDriver</option>
													<option value="com.ibm.db2.jcc.DB2Driver">com.ibm.db2.jcc.DB2Driver</option>
													<option value="net.sourceforge.jtds.jdbc.Driver">net.sourceforge.jtds.jdbc.Driver</option>
													<option value="com.microsoft.sqlserver.jdbc.SQLServerDriver">com.microsoft.sqlserver.jdbc.SQLServerDriver</option>
													<option value="com.microsoft.jdbc.sqlserver.SQLServerDriver">com.microsoft.jdbc.sqlserver.SQLServerDriver</option>
									</select>
                                </div>
                            </div>
                            
                                <div class="form-group">
							        <label class="col-lg-3 control-label">更新策略</label>
							        <div class="col-lg-9">
							            <div class="btn-group" data-toggle="buttons">
							                <label class="btn btn-default">
							                    <input type="radio" name="cycle" value="everyDay" /> 每天
							                </label>
							                <label class="btn btn-default">
							                    <input type="radio" name="cycle" value="everyWeek" /> 每周
							                </label>
							                <label class="btn btn-default">
							                    <input type="radio" name="cycle" value="everyMouth" /> 每月
							                </label>
							                <label class="btn btn-default">
							                    <input type="radio" name="cycle" value="never" /> 不更新
							                </label>
							                <label class="btn btn-default">
							                    <input type="radio" name="cycle" value="no" disabled="disabled"/> ___
							                </label>
							            </div>
							        </div>
							    </div>
							    
							 <div class="form-group" id="whichWeek">
                                <label class="col-lg-3 control-label">周几</label>
                                <div class="col-lg-5">
                                	<select id="week" class="form-control">
													<option value="one">周一</option>
													<option value="two">周二</option>
													<option value="three">周三</option>
													<option value="four">周四</option>
													<option value="five">周五</option>
													<option value="six">周六</option>
													<option value="seven">周日</option>
									</select>
                                </div>
                            </div>   
							 <div class="form-group" id="whichDay">
                                <label class="col-lg-3 control-label">哪天</label>
                                <div class="col-lg-5">
                                	<input type="number" value="1" min="1" max="28" class="form-control" name="day" id="day" />
                                </div>
                            </div>
                            <div class="form-group" id="whichTime">
                                <label class="col-lg-3 control-label">几点</label>
                                <div class="col-lg-5">
                                	<input type="time" class="form-control" name="whichtime" id="whichtime" />
                                </div>
                            </div>
                            
                            
                        </fieldset>
                         <div class="ln_solid"></div>
                        <div class="form-group">
                            <div class="col-lg-9 col-lg-offset-3">
                                <button type="button" class="btn btn-primary" id="validateBtn" onclick = "add();">提交</button>
                                <button type="button" class="btn btn-info" id="resetBtn">重置</button>
                            </div>
                        </div>
                    </form>

                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
		<jsp:include page="base/footer.jsp"></jsp:include>
        <!-- /footer content -->
      </div>
    </div>
<!-- validator -->
<script>
function add(){
    var proVersion= $("#proVersion").val();
    var proName=$("#proName").val();
    var proDes=$("#proDes").val();
    var targetCount=$("#targetCount").val();
	$.ajax({
		type : 'POST',
		url : "../project/1.do",
		dataType : "json",
		data : {
			"proVersion" : proVersion,
			"proName" : proName,
			"proDes" : proDes,
			"targetCount" : targetCount
		},
		success : function(data) {
			if (data.msg == 'ok') {
				alert("创建成功！");
				window.location.href='main.html';
			}else{
				alert("创建失败！");
			}

		}

	});
}
$(document).ready(function() {

    $('#resetBtn').click(function() {
        $('#defaultForm').data('bootstrapValidator').resetForm(true);
    });
    $('#defaultForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	dbName: {
                message: 'The dbName is not valid',
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    },
                    stringLength: {
                        min: 2,
                        max: 30,
                        message: '项目名必须大于2个字符并且小于30个字符'
                    }
                }
            },
            dbUrl: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
            dbRoot: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
            dbPassword: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
            dbDriver: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
            cycle: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            }
            
        }
    });
    // Validate the form manually
    $('#validateBtn').click(function() {
        $('#defaultForm').bootstrapValidator('validate');
    });

    $('#resetBtn').click(function() {
        $('#defaultForm').data('bootstrapValidator').resetForm(true);
    });
    $('input[name=cycle]').change(function(){
    	 switch($(this).val()){
    	  case "everyDay":
    	   $("#whichWeek").hide();
    	   $("#whichDay").hide();
    	   $("#whichTime").show();
    	   break;
    	  case "everyWeek":
    		  $("#whichWeek").show();
    		  $("#whichDay").hide();
    		  $("#whichTime").show();
    	   break;
    	  case "everyMouth":
    		  $("#whichWeek").hide();
    		  $("#whichDay").show();
    		  $("#whichTime").show();
       	   break;
    	  case "never":
       	   $("#whichWeek").hide();
    	   $("#whichDay").hide();
    	   $("#whichTime").hide();
       	   break;
    	  default:
    	   break;
    	 }
    });
});
</script>
<!-- /validator -->

	<!-- Custom Theme Scripts -->
	<script src="<%=request.getContextPath()%>/static/ace/production/js/custom.js"></script>
	
  </body>
</html>