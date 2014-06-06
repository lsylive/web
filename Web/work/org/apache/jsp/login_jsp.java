package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      out.write("<meta http-equiv=\"Page-Enter\" content=\"blendTrans(Duration=1.0)\" />\r\n");
      out.write("<meta http-equiv=\"Page-Exit\" content=\"blendTrans(Duration=0.5)\" />\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body, div, ul, li, h1, h2, h3, pre, form, fieldset, input, textarea, p, blockquote, th, td {\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\tfont-size:14px;\r\n");
      out.write("}\r\n");
      out.write("table {\r\n");
      out.write("\tborder-collapse:collapse;\r\n");
      out.write("\tborder-spacing:0;\r\n");
      out.write("}\r\n");
      out.write("fieldset, img {\r\n");
      out.write("\tborder:0;\r\n");
      out.write("}\r\n");
      out.write("address, caption, cite, code, dfn, em, strong, th, var {\r\n");
      out.write("\tfont-style:normal;\r\n");
      out.write("\tfont-weight:normal;\r\n");
      out.write("}\r\n");
      out.write("h1 {\r\n");
      out.write("\tfont-size:22px;\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("}\r\n");
      out.write("/* ---------------------------------UP Reset------------------------------------------- */\r\n");
      out.write("body {\r\n");
      out.write("\tfont:100% Arial, sans-serif;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tbackground:#06416b url(");
      out.print(CONTEXT_PATH);
      out.write("images/main_bg.jpg) repeat-x center top;\r\n");
      out.write("\toverflow-x:hidden;\r\n");
      out.write("}\r\n");
      out.write("div#loginWrap {\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("\twidth:1001px;\r\n");
      out.write("}\r\n");
      out.write("div#loginWrap h1.top-1 {\r\n");
      out.write("\tbackground: url(");
      out.print(CONTEXT_PATH);
      out.write("images/top_11.jpg) no-repeat center top;\r\n");
      out.write("\theight:33px;\r\n");
      out.write("\ttext-indent:-9999px;\r\n");
      out.write("}\r\n");
      out.write("div#loginWrap div.top-2 {\r\n");
      out.write("\tbackground: url(");
      out.print(CONTEXT_PATH);
      out.write("images/top_21.jpg) no-repeat center top;\r\n");
      out.write("\theight:204px;\r\n");
      out.write("}\r\n");
      out.write("div#loginWrap div.top-3 {\r\n");
      out.write("\tbackground: url(");
      out.print(CONTEXT_PATH);
      out.write("images/top-11.png) no-repeat center top;\r\n");
      out.write("\theight:100px;\r\n");
      out.write("   font-size:40px;\r\n");
      out.write("   color:white;\r\n");
      out.write("   font-weight:bold;\r\n");
      out.write("   text-align:center;\r\n");
      out.write("}\r\n");
      out.write("div#loginWrap div.top-4 {\r\n");
      out.write("\tbackground: url(");
      out.print(CONTEXT_PATH);
      out.write("images/top_11.jpg) no-repeat center top;\r\n");
      out.write("\theight:63px;\r\n");
      out.write("}\r\n");
      out.write("div#login {\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\theight:105px;\r\n");
      out.write("\tbackground: url(");
      out.print(CONTEXT_PATH);
      out.write("images/form_left_bg1.jpg) no-repeat left top;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tz-index:3;\r\n");
      out.write("}\r\n");
      out.write("div#footer{\r\n");
      out.write("\tbackground: url(");
      out.print(CONTEXT_PATH);
      out.write("images/footer_bg.jpg) no-repeat center top;\r\n");
      out.write("\theight:114px;\r\n");
      out.write("}\r\n");
      out.write("div#footer p{\r\n");
      out.write("\tcolor:#FFF;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\tmargin:3px auto;\r\n");
      out.write("\tpadding-top:10px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write("div#login div.wrap {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\ttop:0px;\r\n");
      out.write("\tleft:360px;\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\twidth:324px;\r\n");
      out.write("\theight:105px;\r\n");
      out.write("\tbackground: url(");
      out.print(CONTEXT_PATH);
      out.write("images/form_bg.jpg) repeat-x center top;\r\n");
      out.write("}\r\n");
      out.write("div#login div.wrap div.wrap-text{\r\n");
      out.write("\twidth:320px;\r\n");
      out.write("\theight:105px;\r\n");
      out.write("\tmargin:0 2px;\r\n");
      out.write("\tbackground: url(");
      out.print(CONTEXT_PATH);
      out.write("images/form_text_bg.jpg) repeat-x center top;\r\n");
      out.write("}\r\n");
      out.write("div#login div.wrap div.wrap-text .user-text{\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("\theight:35px;\r\n");
      out.write("\tmargin-top:10px;\r\n");
      out.write("\twidth:95%;\r\n");
      out.write("}\r\n");
      out.write("span.inputContent {\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\twidth:75px;\r\n");
      out.write("\theight:24px;\r\n");
      out.write("\ttext-align:right;\r\n");
      out.write("\tcolor:#07678f;\r\n");
      out.write("\tfont-size:16px;\r\n");
      out.write("\tfont-family:\"黑体\";\r\n");
      out.write("\tmargin-top:5px;\r\n");
      out.write("}\r\n");
      out.write(".inputA,.inputA-hover,.inputB,.inputB-hover{/* --输入框样式-- */\r\n");
      out.write("\twidth:212px;\r\n");
      out.write("\theight:28px;\r\n");
      out.write("\tbackground:url(");
      out.print(CONTEXT_PATH);
      out.write("images/text_bg.gif) left top;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tborder:1px solid #b0b4b7;\r\n");
      out.write("\tline-height:28px;\r\n");
      out.write("\ttext-indent:25px;\r\n");
      out.write("}\r\n");
      out.write(".inputB{/* --输入框样式-- */\r\n");
      out.write("\tbackground-position: left -56px;\r\n");
      out.write("}\r\n");
      out.write(".inputA-hover{/* --输入框样式-- */\r\n");
      out.write("\tbackground:#93f1fb url(");
      out.print(CONTEXT_PATH);
      out.write("images/text_bg.gif) left -28px;\r\n");
      out.write("}\r\n");
      out.write(".inputB-hover{/* --输入框样式-- */\r\n");
      out.write("\tbackground:#93f1fb url(");
      out.print(CONTEXT_PATH);
      out.write("images/text_bg.gif) left -84px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#login div.btn-area {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\ttop:0px;\r\n");
      out.write("\tleft:705px;\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\twidth:344px;\r\n");
      out.write("\theight:105px;\r\n");
      out.write("}\r\n");
      out.write(".butStyle,.butStyle-hover,.resStyle,.resStyle-hover,.cvStyle,.cvStyle-hover {/* --按钮-- */\r\n");
      out.write("\twidth:81px;\r\n");
      out.write("\theight:79px;\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tz-index:5;\r\n");
      out.write("\tborder:none;\r\n");
      out.write("\ttext-indent:-9999px;\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("\tmargin-top:12px;\r\n");
      out.write("\tmargin-right:16px;\r\n");
      out.write("\tbackground:url(");
      out.print(CONTEXT_PATH);
      out.write("images/btn.jpg) left top;\r\n");
      out.write("}\r\n");
      out.write(".butStyle-hover {\r\n");
      out.write("\tbackground-position: -81px top;\r\n");
      out.write("}\r\n");
      out.write(".resStyle {\r\n");
      out.write("\tbackground-position: -162px top;\r\n");
      out.write("}\r\n");
      out.write(".resStyle-hover {\r\n");
      out.write("\tbackground-position: -243px top;\r\n");
      out.write("}\r\n");
      out.write(".cvStyle {\r\n");
      out.write("\tbackground-position: -324px top;\r\n");
      out.write("}\r\n");
      out.write(".cvStyle-hover {\r\n");
      out.write("\tbackground-position: -405px top;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("   \r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">  \r\n");
      out.write("var msg=\"\";\r\n");
      out.write("\r\n");
      out.write("function checkLength(o,n,min,max) {\r\n");
      out.write("   if(o.value.length > max || o.value.length < min) {\r\n");
      out.write("\t    msg=msg+n+(\"长度必须介于\"+min+\"和\"+max+\"之间。\\r\\n\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t } \r\n");
      out.write("\t else {\r\n");
      out.write("      return true;\r\n");
      out.write("   }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkRegexp(o,regexp,n) {\r\n");
      out.write("   if(regexp.test(o.value)) {\r\n");
      out.write("      return true;\r\n");
      out.write("   } \r\n");
      out.write("   else {\r\n");
      out.write("\t    msg=msg+n+\"\\r\\n\";\r\n");
      out.write("      return false;\r\n");
      out.write("\t }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkInput(userName,password){\r\n");
      out.write("   var bValid = true;\r\n");
      out.write("\r\n");
      out.write("   bValid = bValid & checkLength(userName,\"用户名\",4,30);\r\n");
      out.write("   //bValid = bValid & checkRegexp(userName,/^[a-z]([0-9a-z_])+$/i,\"用户名必须是字母或数字。\");\r\n");
      out.write("   bValid = bValid & checkLength(password,\"密码\",8,30);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("   return bValid;\r\n");
      out.write("}\r\n");
      out.write("           \r\n");
      out.write("function goValidate(){\r\n");
      out.write("   var uName = document.getElementById(\"userName\");\r\n");
      out.write("   var password =document.getElementById(\"password\");\r\n");
      out.write("\r\n");
      out.write("   if(checkInput(uName,password)){\r\n");
      out.write("\t   document.forms[0].submit();\r\n");
      out.write("   }\r\n");
      out.write("   else {\r\n");
      out.write("      alert(msg);\r\n");
      out.write("      msg=\"\";\r\n");
      out.write("   }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function login(){\r\n");
      out.write("\tvar n=document.getElementById('userName'); n.value='test';\r\n");
      out.write("\tvar p=document.getElementById('password'); p.value='12345678';\r\n");
      out.write("   document.forms[0].submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function showmsg(){\r\n");
      out.write("\tvar msg='");
      out.print(request.getAttribute("errMsg") );
      out.write("';\r\n");
      out.write("\tif(msg!='null')\r\n");
      out.write("\t\talert(msg);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>  \r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"login()\">\r\n");
      out.write("<!--<body>-->\r\n");
      out.write("\t<div id=\"loginWrap\">\r\n");
      out.write("\t\r\n");
      out.write("\t<h1 class=\"top-1\"></h1>\r\n");
      out.write("         <div class=\"top-2\"></div>\r\n");
      out.write("      <div class=\"top-3\">政法网工程档案管理系统</div>\r\n");
      out.write("    <div id=\"login\">\r\n");
      out.write("        <form id=\"loginForm\" action=\"");
      out.print(CONTEXT_PATH);
      out.write("login.do?action=login\" method=\"post\">\r\n");
      out.write("           \t<div class=\"wrap\">\r\n");
      out.write("            \t<div class=\"wrap-text\">       \r\n");
      out.write("\t\t\t\t\t <div class=\"user-text\"><span class=\"inputContent\" id=\"nm\">用户名：</span>\r\n");
      out.write("                \t\t <input type=\"text\" name=\"userName\" id=\"userName\" class=\"inputA\" maxlength=\"23\" value=\"\" onmouseover=\"this.className='inputA-hover'\"  onmouseout=\"this.className='inputA'\"/>\r\n");
      out.write("\t\t\t\t\t </div>                        \r\n");
      out.write("                     <div class=\"user-text\"><span class=\"inputContent\" id=\"pw\">密  &nbsp;码：</span>\r\n");
      out.write("                \t\t<input type=\"password\" name=\"password\" id=\"password\" class=\"inputB\" value=\"\"  maxlength=\"23\" onmouseover=\"this.className='inputB-hover'\"  onmouseout=\"this.className='inputB'\" />\r\n");
      out.write("                     </div>\r\n");
      out.write("                </div>\r\n");
      out.write("        \t</div>\r\n");
      out.write("            <div class=\"btn-area\">\r\n");
      out.write("            <input  type=\"button\" onclick=\"goValidate()\" value=\"登录\" name=\"login\" class=\"butStyle\"   onmouseover=\"this.className='butStyle'\"  onmouseout=\"this.className='butStyle-hover'\"  />\r\n");
      out.write("       \t\t </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("   \r\n");
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
