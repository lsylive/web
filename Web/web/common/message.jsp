<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<script type="text/javascript">
	function load(){
		var msg='<%=request.getAttribute("msg")%>';
		var returnStatus='<%=request.getAttribute("returnStatus")%>';
		var returnurl='<%=request.getAttribute("returnUrl")%>';
		if(returnurl!='null'){
			alert(msg);
			window.location.href=returnurl;
			return ;
		}
		if(returnStatus=='0')	{	
			parent.closedialog('true');
		}
		else {
			alert(msg);
			parent.closedialog('false');
		}
	}
	</script>
  </head>
  
  <body onload="load()">
    
  </body>
</html>
