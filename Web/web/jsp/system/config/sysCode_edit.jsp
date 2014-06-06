<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/WEB-INF/tag/gl-tag.tld" prefix="gl"%>
<%
	String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="x-ua-compatible" content="ie=7" />
<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.css"/>
<script src="<%=CONTEXT_PATH%>dhtmlx/dhtmlx.js"></script>
	<title></title>
	<link rel="stylesheet" type="text/css" href="<%=CONTEXT_PATH%>css/main.css" />

  <script language="javascript" src="<%= CONTEXT_PATH %>/js/date_validate.js"></script>	
  <script language="javascript" src="<%= CONTEXT_PATH %>/js/ctrl_util.js"></script>	

	<script type="text/javascript">
      var contextpath = "<%=CONTEXT_PATH%>";	
      var fulllink = contextpath + "system/sysCode.do";		


	function goCancel(){
		parent.closedialog(false);
	}
	
	function goSubmit(){
		  if(!checkString(getElement('record.name'),"代码名称",60,true)) return;
		  if(!checkString(getElement('record.value'),"代码值",20,true)) return;
		  //if(!checkNumeric(getElement('record.status'),"状态",6,true,true)) return;
		  if(!checkString(getElement('record.remark'),"备注",200,false)) return;
		
		  document.forms[0].action=fulllink+"?action=UPDATE";
    	document.forms[0].submit();
	}

  function closedialog(ret,str,str1){
     dhxWins.window(winName).close();
     if(ret==true) {
        $$('roleIds').value=str;
        $$('roleNames').value=str1;
     }	
  }	
  
  function init(){
	  showMessage('<s:property value="errorMessage" escape="false"/>')
  }
	
	</script>
<style type="text/css">
   html, body {width:100%; height:100%; margin:0px; padding:0px; overflow:hidden;}
</style>
</head>

<body onload="init()">
<div id="formDiv" class="formDiv">
  <s:form action="sysCode" id="codeForm" method="post" namespace="/system">
   <s:hidden name="record.id" />

			<table id="tblForm" cellpadding="0" cellspacing="0" width="100%" class="formTable">
			 <tr>
				<td width="15%" class="textR">系统代码：</td>
				<td width="35%">
				<s:textfield name="record.codesetName" disabled="true"/>
					
				</td>
				<td width="15%" class="textR"><font color="red">*</font>代码名称：</td>
				<td width="35%">
					<s:textfield name="record.name" />
				</td>
			</tr>
			<tr>
				<td class="textR"><font color="red">*</font>代码值：</td>
				  <td>
					   <s:textfield name="record.value" />
				  </td>
				<td class="textR"><font color="red">*</font>状态：</td>
				<td>
					<%-- <s:select list="codeSets.CODE_STATUS" listKey="value" listValue="codeName"></s:select> --%>
				</td>
			</tr>
			<tr>
				<td class="textR" valign="top">备注：</td>
				<td colspan="3">
					<s:textarea rows="5" name="record.remark" />
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
<script type="text/javascript">
</script>
</body>
</html>
