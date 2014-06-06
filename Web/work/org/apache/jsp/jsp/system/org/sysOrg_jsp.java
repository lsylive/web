package org.apache.jsp.jsp.system.org;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysOrg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/common/dialog.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String CONTEXT_PATH = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"x-ua-compatible\" content=\"ie=7\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/dhtmlx.css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("   html, body {width:100%; height:100%;overflow:hidden;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"init()\">\r\n");
      out.write("<div class=\"special-padding\">   \r\n");
      out.write("  <div id=\"left_div\"  style=\"float:left;background:white;width:100%;height:100%\" >\r\n");
      out.write("  </div>\r\n");
      out.write("    </div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t  function init(){\r\n");
      out.write("\t\t  var mainbody=window.document.body;\r\n");
      out.write("\t\t  left_div.style.width=mainbody.offsetWidth+\"px\";\r\n");
      out.write("\t\t  left_div.style.height=mainbody.offsetHeight+\"px\";\r\n");
      out.write("\t  }\r\n");
      out.write("\r\n");
      out.write("    function closedialog(ret){\r\n");
      out.write("\t     dhxWins.window(winName).close();\r\n");
      out.write("\t     if(ret=='true') {\r\n");
      out.write("\t       var nodeId = tree.getSelectedItemId();\r\n");
      out.write("\t     \t if(editMode==\"ADD\") {\r\n");
      out.write("\t          tree.refreshItem(nodeId);\r\n");
      out.write("\t       }\r\n");
      out.write("\t       else if(editMode==\"EDIT\"){\r\n");
      out.write("\t          tree.closeItem(nodeId);\r\n");
      out.write("             var parentId = tree.getParentId(nodeId);\r\n");
      out.write("             tree.selectItem(parentId);\r\n");
      out.write("\t          tree.refreshItem(parentId);\r\n");
      out.write("\t       }\r\n");
      out.write("\t     }\r\n");
      out.write("\t     editMode=\"\";\t\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("    function addOrg(id){\r\n");
      out.write("    \teditMode=\"ADD\";\r\n");
      out.write("    \tvar url_link=\"");
      out.print(CONTEXT_PATH);
      out.write("system/sysOrg.do?action=\"+editMode+\"&pid=\"+id.substring(3);\r\n");
      out.write("    \topenWindow(\"增加单位\",url_link,600,250);\r\n");
      out.write("    }\t\r\n");
      out.write("\r\n");
      out.write("    function modifyOrg(id){\r\n");
      out.write("    \teditMode=\"EDIT\";\r\n");
      out.write("    \tvar url_link=\"");
      out.print(CONTEXT_PATH);
      out.write("system/sysOrg.do?action=\"+editMode+\"&id=\"+id.substring(3);\r\n");
      out.write("    \topenWindow(\"修改单位\",url_link,600,250);\r\n");
      out.write("    }\t\r\n");
      out.write("\r\n");
      out.write("    function deleteOrg(id){\r\n");
      out.write("    \tvar res=confirm(\"将要删除该单位下属的所有单位和部门\\r\\n        是否真的要删除该单位？\");\r\n");
      out.write("    \tif(res==false) return;\r\n");
      out.write("    \teditMode=\"DELETE\";\r\n");
      out.write("    \tvar url_link=\"");
      out.print(CONTEXT_PATH);
      out.write("system/sysOrg.do?action=\"+editMode+\"&id=\"+id.substring(3);\r\n");
      out.write("\t\t\tvar loader = dhtmlxAjax.postSync(url_link,\"\");\r\n");
      out.write("\t\t\teval(\"var ret=\"+loader.xmlDoc.responseText);\r\n");
      out.write("\t\t\tif(ret.exit==\"0\") tree.deleteItem(id); else alert(ret.message);\r\n");
      out.write("    \teditMode=\"\";\r\n");
      out.write("    }\t\r\n");
      out.write("\r\n");
      out.write("    function addDept(id){\r\n");
      out.write("    \teditMode=\"ADD\";\r\n");
      out.write("    \tvar url_link;\r\n");
      out.write("    \tif(id.indexOf(\"org\")>-1){\r\n");
      out.write("    \t   url_link=\"");
      out.print(CONTEXT_PATH);
      out.write("system/sysDept.do?action=\"+editMode+\"&orgId=\"+id.substring(3);\r\n");
      out.write("      }\r\n");
      out.write("      else {\r\n");
      out.write("      \t var orgId=tree.getUserData(id,\"orgId\");\r\n");
      out.write("    \t   url_link=\"");
      out.print(CONTEXT_PATH);
      out.write("system/sysDept.do?action=\"+editMode+\"&pid=\"+id.substring(4)+\"&orgId=\"+orgId.substring(3);\r\n");
      out.write("      }\r\n");
      out.write("    \topenWindow(\"增加部门\",url_link,600,250);\r\n");
      out.write("    }\t\r\n");
      out.write("\r\n");
      out.write("    function modifyDept(id){\r\n");
      out.write("    \teditMode=\"EDIT\";\r\n");
      out.write("    \tvar url_link=\"");
      out.print(CONTEXT_PATH);
      out.write("system/sysDept.do?action=\"+editMode+\"&id=\"+id.substring(4);\r\n");
      out.write("    \topenWindow(\"修改部门\",url_link,600,250);\r\n");
      out.write("    }\t\r\n");
      out.write("\r\n");
      out.write("    function deleteDept(id){\r\n");
      out.write("    \tvar res=confirm(\"将要删除该部门下属的所有部门\\r\\n        是否真的要删除该部门？\");\r\n");
      out.write("    \tif(res==false) return;\r\n");
      out.write("    \teditMode=\"DELETE\";\r\n");
      out.write("    \tvar url_link=\"");
      out.print(CONTEXT_PATH);
      out.write("system/sysDept.do?action=\"+editMode+\"&id=\"+id.substring(4);\r\n");
      out.write("\t\t\tvar loader = dhtmlxAjax.postSync(url_link,\"\");\r\n");
      out.write("\t\t\teval(\"var ret=\"+loader.xmlDoc.responseText);\r\n");
      out.write("\t\t\tif(ret.exit==\"0\") tree.deleteItem(id,true); else alert(ret.message);\r\n");
      out.write("    \teditMode=\"\";\r\n");
      out.write("    }\t\r\n");
      out.write("\r\n");
      out.write("\t\tfunction showMenuItems(id){\r\n");
      out.write("         toolbar.disableItem(\"new_org\");\r\n");
      out.write("         toolbar.disableItem(\"new_dept\");\r\n");
      out.write("         toolbar.hideItem(\"modify_org\");\r\n");
      out.write("         toolbar.hideItem(\"modify_dept\");\r\n");
      out.write("         toolbar.hideItem(\"del_org\");\r\n");
      out.write("         toolbar.hideItem(\"del_dept\");\r\n");
      out.write("         toolbar.hideItem(\"sep2\");\r\n");
      out.write("         toolbar.hideItem(\"sep3\");\r\n");
      out.write("    \tif(id.indexOf(\"org\")>-1){\r\n");
      out.write("         toolbar.enableItem(\"new_org\");\r\n");
      out.write("         toolbar.enableItem(\"new_dept\");\r\n");
      out.write("         toolbar.showItem(\"modify_org\");\r\n");
      out.write("         toolbar.showItem(\"del_org\");\r\n");
      out.write("         toolbar.showItem(\"sep1\");\r\n");
      out.write("         toolbar.showItem(\"sep2\");\r\n");
      out.write("         toolbar.showItem(\"sep3\");\r\n");
      out.write("    \t}\r\n");
      out.write("    \telse if(id.indexOf(\"dept\")>-1){\r\n");
      out.write("         toolbar.disableItem(\"new_org\");\r\n");
      out.write("         toolbar.enableItem(\"new_dept\");\r\n");
      out.write("         toolbar.showItem(\"modify_dept\");\r\n");
      out.write("         toolbar.showItem(\"del_dept\");\r\n");
      out.write("         toolbar.showItem(\"sep2\");\r\n");
      out.write("         toolbar.showItem(\"sep3\");\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//页面初始化代码\r\n");
      out.write("\t  var dhxLayout = new dhtmlXLayoutObject(document.body, \"1C\");\r\n");
      out.write("\t  dhxLayout.setSkin(\"dhx_skyblue\");\r\n");
      out.write("\r\n");
      out.write("\t  var leftPanel=dhxLayout.cells(\"a\");\r\n");
      out.write("\t  leftPanel.hideHeader();\r\n");
      out.write("\t  leftPanel.attachObject(\"left_div\");\r\n");
      out.write("\r\n");
      out.write("    var toolbar = dhxLayout.attachToolbar();\r\n");
      out.write("    toolbar.setIconsPath(\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/imgs/icon/\");\r\n");
      out.write("    toolbar.setSkin(\"dhx_skyblue\");\r\n");
      out.write("    toolbar.addButton(\"new_org\", 0, \"添加子单位\", \"house_big_1.gif\", \"house_big_1.gif\");\r\n");
      out.write("    toolbar.addSeparator(\"sep1\", 1);\r\n");
      out.write("    toolbar.addButton(\"new_dept\", 2, \"添加子部门\", \"people_1.gif\", \"people_1.gif\");\r\n");
      out.write("    toolbar.addSeparator(\"sep2\", 3);\r\n");
      out.write("    toolbar.addButton(\"modify_org\", 4, \"修改\", \"house_big_2.gif\", \"house_big_2.gif\");\r\n");
      out.write("    toolbar.addButton(\"modify_dept\", 5, \"修改\", \"people_2.gif\", \"people_2.gif\");\r\n");
      out.write("    toolbar.addSeparator(\"sep3\", 6);\r\n");
      out.write("    toolbar.addButton(\"del_org\", 7, \"删除\", \"house_big_3.gif\", \"house_big_3.gif\");\r\n");
      out.write("    toolbar.addButton(\"del_dept\", 8, \"删除\", \"people_3.gif\", \"people_3.gif\");\r\n");
      out.write("    toolbar.attachEvent(\"onClick\", function(id){\r\n");
      out.write("    \tvar nodeId=tree.getSelectedItemId();\r\n");
      out.write("    \tif(id==\"new_org\") addOrg(nodeId);\r\n");
      out.write("    \telse if(id==\"modify_org\") modifyOrg(nodeId);\r\n");
      out.write("    \telse if(id==\"new_dept\") addDept(nodeId);\r\n");
      out.write("    \telse if(id==\"modify_dept\") modifyDept(nodeId);\r\n");
      out.write("    \telse if(id==\"del_org\") deleteOrg(nodeId);\r\n");
      out.write("    \telse if(id==\"del_dept\") deleteDept(nodeId);\r\n");
      out.write("    });\r\n");
      out.write("\t \r\n");
      out.write("    var tree = new dhtmlXTreeObject(\"left_div\",\"100%\",\"100%\",0);\r\n");
      out.write("    tree.setImagePath(\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/imgs/\");\r\n");
      out.write("    tree.setSkin('dhx_blue');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    tree.attachEvent(\"onSelect\", function(id){\r\n");
      out.write("    \t showMenuItems(id);\r\n");
      out.write("    });\r\n");
      out.write("    tree.attachEvent(\"onDblClick\", function(id){\r\n");
      out.write("       if(id.indexOf(\"org\")>-1) modifyOrg(id);\r\n");
      out.write("       if(id.indexOf(\"dept\")>-1) modifyDept(id);\r\n");
      out.write("    });\r\n");
      out.write("    tree.attachEvent(\"onMouseIn\", function(id){\r\n");
      out.write("    \t var str=tree.getUserData(id,\"name\");\r\n");
      out.write("    \t tree.setItemText(id,\"<font color='#FF4422'>\"+str+\"</font>\");\r\n");
      out.write("    });\r\n");
      out.write("    tree.attachEvent(\"onMouseOut\", function(id){\r\n");
      out.write("    \t var str=tree.getUserData(id,\"name\");\r\n");
      out.write("    \t tree.setItemText(id,str);\r\n");
      out.write("    });\r\n");
      out.write("    tree.enableCheckBoxes(0);\r\n");
      out.write("\r\n");
      out.write("    tree.setXMLAutoLoading(\"");
      out.print(CONTEXT_PATH);
      out.write("system/sysOrg.do?action=getTree\");\r\n");
      out.write("\t tree.loadXML(\"");
      out.print(CONTEXT_PATH);
      out.write("system/sysOrg.do?action=getTree&id=0\");\r\n");
      out.write("    showMenuItems(\"0\");\r\n");
      out.write("    \r\n");
      out.write("    function refreshItem(id){\r\n");
      out.write("\t     tree.refreshItem(0);\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t var dhxWins = new dhtmlXWindows();\r\n");
      out.write("    dhxWins.enableAutoViewport(true);\r\n");
      out.write("    dhxWins.setImagePath(\"");
      out.print(CONTEXT_PATH);
      out.write("dhtmlx/imgs/\");\r\n");
      out.write("    \r\n");
      out.write("    var winName=\"win\";  \r\n");
      out.write("    var editMode;       \r\n");
      out.write("    \r\n");
      out.write("    function openWindow(title,urlink,width,height){\r\n");
      out.write("    \t var w = dhxWins.createWindow(winName, 0, 0, width,height);\r\n");
      out.write("       w.setText(title);\r\n");
      out.write("       w.keepInViewport(true);\r\n");
      out.write("       w.setModal(true);\r\n");
      out.write("       w.centerOnScreen();\r\n");
      out.write("       w.button(\"park\").hide();\r\n");
      out.write("       w.attachURL(urlink);\r\n");
      out.write("       return w;    \r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function openSingleWindow(title,divhtml,width,height){\r\n");
      out.write("       if(height==null || height=='') height=250;\r\n");
      out.write("       if(width==null || width=='') width=350;\r\n");
      out.write("   \t \r\n");
      out.write("       var win2 = dhxWins.createWindow(winName, 0, 0, width, height);\r\n");
      out.write("       win2.setText(title);\r\n");
      out.write("       win2.keepInViewport(true);\r\n");
      out.write("       win2.setModal(true);\r\n");
      out.write("       win2.centerOnScreen();\r\n");
      out.write("       win2.button(\"park\").hide();\r\n");
      out.write("       win2.attachHTMLString(divhtml);\r\n");
      out.write("       return win2;    \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function openWindowById(title,objId,width,height){\r\n");
      out.write("\t       if(height==null || height=='') height=250;\r\n");
      out.write("\t       if(width==null || width=='') width=350;\r\n");
      out.write("\t   \t \r\n");
      out.write("\t       var win2 = dhxWins.createWindow(winName, 0, 0, width, height);\r\n");
      out.write("\t   \t win2.button(\"close\").attachEvent(\"onClick\", function(){\r\n");
      out.write("\t   \t\tdhxWins.window(winName).close();\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t   \t win2.maximize();\r\n");
      out.write("\t       win2.setText(title);\r\n");
      out.write("\t       win2.keepInViewport(true);\r\n");
      out.write("\t       win2.setModal(true);\r\n");
      out.write("\t       win2.centerOnScreen();\r\n");
      out.write("\t       win2.button(\"minmax1\").hide();\r\n");
      out.write("\t       win2.button(\"minmax2\").hide();\r\n");
      out.write("\t       win2.button(\"park\").hide();\r\n");
      out.write("\t       win2.attachObject(objId);;\r\n");
      out.write("\t       return win2;    \r\n");
      out.write("\t    }\r\n");
      out.write("   \r\n");
      out.write("</script> \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
