/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-25 00:33:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.productpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ballcap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/productpage/footer.jsp", Long.valueOf(1711326769192L));
    _jspx_dependants.put("/productpage/header.jsp", Long.valueOf(1710720627200L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>product_Ballcap</title>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>I.C.T</title>\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/80123590ac.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/header.css\">\r\n");
      out.write("<script src=\"../js/header.js\" defer></script>\r\n");
      out.write("<!-- <script defer src=\"js 파일 위치\"></script> -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header id=\"header\">\r\n");
      out.write("		<div class=\"wrapper\">\r\n");
      out.write("			<p class=\"title\">\r\n");
      out.write("				<a href=\"\">I.C.T</a>\r\n");
      out.write("			</p>\r\n");
      out.write("			<ul class=\"category\">\r\n");
      out.write("				<li><a href=\"\">Ballcap</a></li>\r\n");
      out.write("				<li><a href=\"\">Buckethat</a></li>\r\n");
      out.write("				<li><a href=\"\">Beanie</a></li>\r\n");
      out.write("				<li><a href=\"\">Suncap</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<a href=\"#\" class=\"hamburger\">\r\n");
      out.write("				<i class=\"fa-solid fa-bars\"></i>\r\n");
      out.write("			</a>\r\n");
      out.write("			<form class=\"item2\" onsubmit=\"return false\">\r\n");
      out.write("				<input type=\"text\" class=\"searchbar2\" type=\"text\" placeholder=\"&nbsp;&nbsp;검 색\">\r\n");
      out.write("				<button class=\"res2\">&nbsp;검색</button>\r\n");
      out.write("			</form>\r\n");
      out.write("			<form class=\"item\" onsubmit=\"return false\">\r\n");
      out.write("				<input type=\"text\" class=\"searchbar1\" type=\"text\" placeholder=\"&nbsp;&nbsp;검 색\">\r\n");
      out.write("				<button class=\"res1\">&nbsp;검색</button>\r\n");
      out.write("				<a href=\"\" class=\"b1 a1\"><i class=\"fa-solid fa-magnifying-glass\"></i></a>\r\n");
      out.write("				<a href=\"\" class=\"b2 a1\"><i class=\"fa-brands fa-opencart\"></i></a>\r\n");
      out.write("<!-- 				<i class=\"fa-solid fa-cart-shopping\"></i> -->\r\n");
      out.write("				<a href=\"\" class=\"b3 a1\"><i class=\"fa-regular fa-user\"></i></a>\r\n");
      out.write("			</form>	\r\n");
      out.write("		</div>	\r\n");
      out.write("	</header>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/80123590ac.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/header.css\">\r\n");
      out.write("<script src=\"../js/header.js\" defer></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/ballcap.css\">\r\n");
      out.write("<script src=\"../js/product.js\" defer></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/footer.css\">\r\n");
      out.write("<!-- <script defer src=\"js 파일 위치\"></script> -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<section class=\"ccontainer\">\r\n");
      out.write("		<div class=\"cwrapper\">\r\n");
      out.write("			<div class=\"newsslider\">\r\n");
      out.write("			    <div class=\"newsslide\"><i>회원 가입시 1000000만 포인트 증정!!!!!</i></div>\r\n");
      out.write("			    <div class=\"newsslide\"><i>오후 3시 이전 주문시 당일 배송 출발</i></div>\r\n");
      out.write("			    <div class=\"newsslide\"><i>매달 백만원 이상 구매시 상품 지급</i></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<form action=\"#\" class=\"sortform\">\r\n");
      out.write("				<select name=\"sort\" class=\"sort\">\r\n");
      out.write("					<option value=\"최신순\">최신순</option>\r\n");
      out.write("					<option value=\"가격낮은순\">가격낮은순</option>\r\n");
      out.write("					<option value=\"가격높은순\">가격높은순</option>\r\n");
      out.write("					<option value=\"판매순\">판매순</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			</form>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap1-1.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">ICT logo cap gray</span>\r\n");
      out.write("					<span class=\"cprice\">159000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap2-1.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">ICT logo cap pink</span>\r\n");
      out.write("					<span class=\"cprice\">159000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap3-2.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">star damage cap</span>\r\n");
      out.write("					<span class=\"cprice\">119000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap4-1.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">YY cap pink</span>\r\n");
      out.write("					<span class=\"cprice\">89000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap5-2.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">YY cap stone</span>\r\n");
      out.write("					<span class=\"cprice\">89000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap6-2.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">YY cap Charcoal</span>\r\n");
      out.write("					<span class=\"cprice\">89000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap7-2.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">PABLO cap black</span>\r\n");
      out.write("					<span class=\"cprice\">99000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap8-2.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">start cap green</span>\r\n");
      out.write("					<span class=\"cprice\">89000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap9-2.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">Ad logo cap</span>\r\n");
      out.write("					<span class=\"cprice\">69000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap10-2.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">B cap green</span>\r\n");
      out.write("					<span class=\"cprice\">79000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap11-2.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">B cap navy</span>\r\n");
      out.write("					<span class=\"cprice\">79000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap12-2.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">B cap brown</span>\r\n");
      out.write("					<span class=\"cprice\">79000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap13-2.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">Check pattern cap blue</span>\r\n");
      out.write("					<span class=\"cprice\">89000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap14-2.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">Check pattern cap brown</span>\r\n");
      out.write("					<span class=\"cprice\">89000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"citem\">\r\n");
      out.write("				<i class=\"fa-regular fa-heart heart\"></i>\r\n");
      out.write("				<i class=\"fa-solid fa-heart heart2\"></i>\r\n");
      out.write("				<img src=\"../img/ballcap/cap15-1.jpg\" class=\"cimg\">\r\n");
      out.write("				<div class=\"ctext\">\r\n");
      out.write("					<span class=\"cname\">O logo cap</span>\r\n");
      out.write("					<span class=\"cprice\">69000</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>	\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/footer.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<footer id=\"text_list\">\r\n");
      out.write("		<div class=\"text_box\" >\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li>TEL. 010-1234-5678</li>\r\n");
      out.write("				<li>ICT14_3@naver.com ADDRESS.</li>\r\n");
      out.write("				<li>서울특별시 마포구 백범로 23, 3층</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"text_box\">\r\n");
      out.write("			<ul >\r\n");
      out.write("				<li>COMPANY. I’amCapTop </li>\r\n");
      out.write("				<li>OWNER. BLCK</li> \r\n");
      out.write("				<li>Business registration number. 121-19-46932</li>\r\n");
      out.write("				<li> MAIL-ORDER LICENSE. 2024-서울시 신촌-0143</li>\r\n");
      out.write("				<li>Copyright ©I’amCapTop All rights reserved.</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"text_box\">\r\n");
      out.write("			<ul >\r\n");
      out.write("				<li><a href=\"#\" class=\"a_qa\">Q&A</a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"a_qa\">FAQ</a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"a_bp\">불편사항</a></li> \r\n");
      out.write("				<li>AGREEMENT</li> \r\n");
      out.write("				<li>PRIVACY POLICY</li> \r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"btn_images\">\r\n");
      out.write("			<a href=\"#\"><img class=\"btn_1\" src=\"../image/bt_insta.png\"></a>\r\n");
      out.write("			<a href=\"#\"><img class=\"btn_1\" src=\"../image/bt_kakao.png\"></a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
