<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/WEB-INF/tag/gl-tag.tld" prefix="gl" %>
<%
	String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="x-ua-compatible" content="ie=7" />
	
	<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>css/main.css" />

  <script language="javascript" src="<%= CONTEXT_PATH %>js/date_validate.js"></script>	
  <script language="javascript" src="<%= CONTEXT_PATH %>js/ctrl_util.js"></script>	

	<script type="text/javascript">
      var contextpath = "<%=CONTEXT_PATH%>";	
      var fulllink = contextpath + "system/sysOrg.do";		
	
	function goCancel(){
		parent.closedialog(false);
	}
	
	function goSubmit(){
		
		  if(!checkString(getElement('form.record.name'),"单位名称",60,true)) return;
		  if(!checkString(getElement('form.record.orgCode'),"单位编号",20,true)) return;
		  if(!checkString(getElement('form.record.orgAbbr'),"单位简称",60,false)) return;
		  if(!checkNumeric(getElement('form.record.orderNo'),"顺序号",6,true,true)) return;
		  if(!checkString(getElement('form.record.remark'),"备注",200,false)) return;
		
		  document.forms[0].action=fulllink+"?action=SAVE";
    	document.forms[0].submit();
	}
  
  function init(){
	  showMessage('<s:property value="errorMessage" escape="false" />');
  }
	
	</script>
<style type="text/css">
   html, body {width:100%; height:100%; margin:0px; padding:0px; overflow:hidden;}
</style>
</head>

<body onload="init()">
<div id="formDiv" class="formDiv">	
  <s:form action="sysOrg" id="orgForm" method="post" namespace="/system">
  	<s:hidden name="form.record.upOrgId" />

		<table id="tblForm" cellpadding="0" cellspacing="0" width="98%" class="formTable">
			 <tr >
				  <td width="20%"><font color="red">*</font>单位名称：</td>
				  <td width="30%">
					   <s:textfield name="form.record.name" />
				  </td>
				  <td width="20%"><font color="red">*</font>单位编号：</td>
					<td width="30%">
					   <s:textfield name="form.record.orgCode" />
					</td>
			 </tr>
			 <tr>
				  <td >单位简称：</td>
				  <td >
					   <s:textfield name="form.record.orgAbbr" />
				  </td>
				  <td ><font color="red">*</font>顺序号：</td>
				  <td>
					   <s:textfield name="form.record.orderNo" />
				  </td>
			 </tr>
			<tr>
			   <td valign="top">备注：</td>
				 <td colspan="3">
					  <s:textarea rows="5" name="form.record.remark" ></s:textarea>
				 </td>
			</tr>
	 </table>
 </s:form>	
</div>
<div id="btnDiv" class="btnDiv">
			      <gl:button name="btnAdd" onClick="goSubmit()">保存</gl:button>
				    &nbsp;
				  <gl:button name="btnCancel" onClick="goCancel()">取消</gl:button>
				    &nbsp;
				  <gl:button name="btnReset" onClick="goReset()">重置</gl:button>
</div>	
<%@include file="/common/resize.jsp" %>
</body>
</html>
