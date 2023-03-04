package org.apache.jsp.Teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Teacher/SessionValidator.jsp");
    _jspx_dependants.add("/Teacher/Header.jsp");
    _jspx_dependants.add("/Teacher/Footer.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edit Profile</title>\n");
      out.write("        ");

        response.setHeader("Cache-Control", "no-cache, no-store");
        if(session.getAttribute("tid") == null)
        {
            response.sendRedirect("../");
        }
    
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("\n");
      out.write("        <title> Timeline</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../Assets/friendskit/assets/img/favicon.png\" />\n");
      out.write("        <!-- Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:400,500\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/fontisto@v3.0.4/css/fontisto/fontisto-brands.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Core CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Assets/friendskit/assets/css/app.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Assets/friendskit/assets/css/core.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Assets/form.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Pageloader -->\n");
      out.write("        <div class=\"pageloader\"></div>\n");
      out.write("        <div class=\"infraloader is-active\"></div>\n");
      out.write("        <div class=\"app-overlay is-sidebar-v1\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"sidebar-v1 is-fold\">\n");
      out.write("            <div class=\"top-section\">\n");
      out.write("                <button id=\"sidebar-v1-close\" class=\"close-button\">\n");
      out.write("                    <i data-feather=\"arrow-left\"></i>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"user-block\">\n");
      out.write("                    <img class=\"avatar\" src=\"");
      out.print(session.getAttribute("tphoto"));
      out.write("\" alt=\"\">\n");
      out.write("                    <div class=\"meta\">\n");
      out.write("                        <span style=\"margin-left: 7px\">");
      out.print(session.getAttribute("tname"));
      out.write("</span>\n");
      out.write("                        <span style=\"margin-left: 10px\">Teacher</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bottom-section\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"HomePage.jsp\" class=\"is-active\">\n");
      out.write("                            <i data-feather=\"clock\"></i>\n");
      out.write("                            <span>Timeline</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                     <li>\n");
      out.write("                        <a href=\"Lecture.jsp\" >\n");
      out.write("                            <i data-feather=\"book\"></i>\n");
      out.write("                            <span>Lectures</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                      <li>\n");
      out.write("                        <a href=\"Complaint.jsp\" >\n");
      out.write("                            <i data-feather=\"alert-circle\"></i>\n");
      out.write("                            <span>Complaint</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Feedback.jsp\" >\n");
      out.write("                            <i data-feather=\"alert-triangle\"></i>\n");
      out.write("                            <span>Feedback</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../logout.jsp\" >\n");
      out.write("                            <i data-feather=\"log-out\"></i>\n");
      out.write("                            <span>Logout</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"view-wrapper is-sidebar-v1 is-fold\">\n");
      out.write("\n");
      out.write("            <div class=\"toolbar-v1-fixed-wrap\">\n");
      out.write("                <div class=\"toolbar-v1 is-narrow\">\n");
      out.write("                    <!-- Sidebar Trigger -->\n");
      out.write("                    <div class=\"friendkit-hamburger sidebar-v1-trigger\">\n");
      out.write("                        <span class=\"menu-toggle has-chevron\">\n");
      out.write("                            <span class=\"icon-box-toggle\">\n");
      out.write("                                <span class=\"rotate\">\n");
      out.write("                                    <i class=\"icon-line-top\"></i>\n");
      out.write("                                    <i class=\"icon-line-center\"></i>\n");
      out.write("                                    <i class=\"icon-line-bottom\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </span>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <div class=\"navbar-item is-icon drop-trigger\">\n");
      out.write("                            <a class=\"icon-link\" href=\"javascript:void(0);\">\n");
      out.write("                                <i data-feather=\"mail\"></i>\n");
      out.write("                                <span class=\"indicator\"></span>\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                            <div class=\"nav-drop is-right\" style=\"width: 250px\">\n");
      out.write("                                <div class=\"inner\">\n");
      out.write("                                    <div class=\"nav-drop-header\">\n");
      out.write("                                        <span>Messages</span>\n");
      out.write("                                        <a href=\"#\">Inbox</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"nav-drop-body is-friend-requests\">\n");
      out.write("                                        <!-- Message -->\n");
      out.write("                                        <div class=\"media\">\n");
      out.write("                                            <div class=\"media-content\">\n");
      out.write("                                                <a href=\"DepartmentChat/Chat.jsp\">Department Group</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"media-right is-centered\">\n");
      out.write("                                                <div class=\"added-icon\">\n");
      out.write("                                                    <a href=\"DepartmentChat/Chat.jsp\" > <i data-feather=\"message-square\"></i></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"account-dropdown\" class=\"navbar-item is-account drop-trigger has-caret\">\n");
      out.write("                            <div class=\"user-image\">\n");
      out.write("                                <img src=\"");
      out.print(session.getAttribute("tphoto"));
      out.write("\" alt=\"\">\n");
      out.write("                                <span class=\"indicator\"></span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"nav-drop is-account-dropdown\">\n");
      out.write("                                <div class=\"inner\">\n");
      out.write("                                    <div class=\"nav-drop-header\">\n");
      out.write("                                        <span class=\"username\">");
      out.print(session.getAttribute("tname"));
      out.write("</span>\n");
      out.write("                                        <label class=\"theme-toggle\">\n");
      out.write("                                            <input type=\"checkbox\">\n");
      out.write("                                            <span class=\"toggler\">\n");
      out.write("                                                <span class=\"dark\">\n");
      out.write("                                                    <i data-feather=\"moon\"></i>\n");
      out.write("                                                </span>\n");
      out.write("                                                <span class=\"light\">\n");
      out.write("                                                    <i data-feather=\"sun\"></i>\n");
      out.write("                                                </span>\n");
      out.write("                                            </span>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"nav-drop-body account-items\">\n");
      out.write("                                        <a id=\"profile-link\" href=\"ViewProfile.jsp\" class=\"account-item\">\n");
      out.write("                                            <div class=\"media\">\n");
      out.write("                                                <div class=\"media-left\">\n");
      out.write("                                                    <div class=\"image\">\n");
      out.write("                                                        <img src=\"");
      out.print(session.getAttribute("tphoto"));
      out.write("\" alt=\"\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"media-content\">\n");
      out.write("                                                    <h3>");
      out.print(session.getAttribute("tname"));
      out.write("</h3>\n");
      out.write("                                                    <small>View Profile</small>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"media-right\">\n");
      out.write("                                                    <i data-feather=\"check\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <hr class=\"account-divider\">\n");
      out.write("                                        <a class=\"account-item\" href=\"../logout.jsp\">\n");
      out.write("                                            <div class=\"media\">\n");
      out.write("                                                <div class=\"icon-wrap\">\n");
      out.write("                                                    <i data-feather=\"power\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"media-content\">\n");
      out.write("                                                    <h3>Log out</h3>\n");
      out.write("                                                    <small>Log out from your account.</small>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Container -->\n");
      out.write("            <div id=\"main-feed\" class=\"container sidebar-boxed\" data-open-sidebar data-page-title=\"Timeline\">\n");
      out.write("\n");
      out.write("                <div class=\"toolbar-v1 is-narrow\">\n");
      out.write("                    <!-- Sidebar Trigger -->\n");
      out.write("                    <div class=\"friendkit-hamburger sidebar-v1-trigger\">\n");
      out.write("                        <span class=\"menu-toggle has-chevron\">\n");
      out.write("                            <span class=\"icon-box-toggle\">\n");
      out.write("                                <span class=\"rotate\">\n");
      out.write("                                    <i class=\"icon-line-top\"></i>\n");
      out.write("                                    <i class=\"icon-line-center\"></i>\n");
      out.write("                                    <i class=\"icon-line-bottom\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </span>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <div class=\"navbar-item is-icon drop-trigger\">\n");
      out.write("                            <a class=\"icon-link\" href=\"javascript:void(0);\">\n");
      out.write("                                <i data-feather=\"mail\"></i>\n");
      out.write("                                <span class=\"indicator\"></span>\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                             <div class=\"nav-drop is-right\" style=\"width: 250px\">\n");
      out.write("                                <div class=\"inner\">\n");
      out.write("                                    <div class=\"nav-drop-header\">\n");
      out.write("                                        <span>Messages</span>\n");
      out.write("                                        <a href=\"#\">Inbox</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"nav-drop-body is-friend-requests\">\n");
      out.write("                                        <!-- Message -->\n");
      out.write("                                        <div class=\"media\">\n");
      out.write("                                            <div class=\"media-content\">\n");
      out.write("                                                <a href=\"DepartmentChat/Chat.jsp\">Department Group</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"media-right is-centered\">\n");
      out.write("                                                <div class=\"added-icon\">\n");
      out.write("                                                    <a href=\"DepartmentChat/Chat.jsp\" > <i data-feather=\"message-square\"></i></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"account-dropdown\" class=\"navbar-item is-account drop-trigger has-caret\">\n");
      out.write("                            <div class=\"user-image\">\n");
      out.write("                                <img src=\"");
      out.print(session.getAttribute("tphoto"));
      out.write("\" alt=\"\">\n");
      out.write("                                <span class=\"indicator\"></span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"nav-drop is-account-dropdown\">\n");
      out.write("                                <div class=\"inner\">\n");
      out.write("                                    <div class=\"nav-drop-header\">\n");
      out.write("                                        <span class=\"username\">");
      out.print(session.getAttribute("tname"));
      out.write("</span>\n");
      out.write("                                        <label class=\"theme-toggle\">\n");
      out.write("                                            <input type=\"checkbox\">\n");
      out.write("                                            <span class=\"toggler\">\n");
      out.write("                                                <span class=\"dark\">\n");
      out.write("                                                    <i data-feather=\"moon\"></i>\n");
      out.write("                                                </span>\n");
      out.write("                                                <span class=\"light\">\n");
      out.write("                                                    <i data-feather=\"sun\"></i>\n");
      out.write("                                                </span>\n");
      out.write("                                            </span>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"nav-drop-body account-items\">\n");
      out.write("                                        <a id=\"profile-link\" href=\"ViewProfile.jsp\" class=\"account-item\">\n");
      out.write("                                            <div class=\"media\">\n");
      out.write("                                                <div class=\"media-left\">\n");
      out.write("                                                    <div class=\"image\">\n");
      out.write("                                                        <img src=\"");
      out.print(session.getAttribute("tphoto"));
      out.write("\" alt=\"\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"media-content\">\n");
      out.write("                                                    <h3>");
      out.print(session.getAttribute("tname"));
      out.write("</h3>\n");
      out.write("                                                    <small>View Profile</small>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"media-right\">\n");
      out.write("                                                    <i data-feather=\"check\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <hr class=\"account-divider\">\n");
      out.write("                                        <a class=\"account-item\" href=\"../logout.jsp\">\n");
      out.write("                                            <div class=\"media\">\n");
      out.write("                                                <div class=\"icon-wrap\">\n");
      out.write("                                                    <i data-feather=\"power\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"media-content\">\n");
      out.write("                                                    <h3>Log out</h3>\n");
      out.write("                                                    <small>Log out from your account.</small>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    ");

        if(request.getParameter("btn_update")!=null)
        {
            
            String upQry = "update tbl_teacher set "
                    + "teacher_name='"+request.getParameter("txt_name")+"', "
                    + "teacher_contact='"+request.getParameter("txt_number")+"',"
                    + "teacher_email='"+request.getParameter("txt_email")+"',"
                    + "teacher_photo='"+request.getParameter("txt_pic")+"',"
                    + "teacher_address='"+request.getParameter("txt_address")+"'"
                    + "where teacher_id='"+session.getAttribute("tid")+"'";
            con.executeCommand(upQry);
            response.sendRedirect("ViewProfile.jsp");
            
        }
    
    
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"tab\" align=\"center\">\n");
      out.write("        <h1>Edit Profile</h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("        <table border=\"1\">\n");
      out.write("            ");

                String selQry = "select * from tbl_teacher where teacher_id='"+session.getAttribute("tid")+"'";
                ResultSet rs = con.selectCommand(selQry);
                if(rs.next())
                {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                        <td colspan=\"2\" align=\"center\"><img id=\"img_pic\" src=\"");
      out.print(rs.getString("teacher_photo"));
      out.write("\" style=\"border-radius: 50%\" width=\"120\" height=\"120\">\n");
      out.write("                            <input type=\"file\" id=\"file_pic\" style=\"display: none\">\n");
      out.write("                            <input type=\"hidden\" id=\"txt_pic\" name=\"txt_pic\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Name</td>\n");
      out.write("                <td><input type=\"text\" name=\"txt_name\" value=\"");
      out.print(rs.getString("teacher_name"));
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Contact</td>\n");
      out.write("                <td><input type=\"text\" name=\"txt_number\" value=\"");
      out.print(rs.getString("teacher_contact"));
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Email</td>\n");
      out.write("                <td><input type=\"email\" name=\"txt_email\" value=\"");
      out.print(rs.getString("teacher_email"));
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Address</td>\n");
      out.write("                <td><textarea name=\"txt_address\">");
      out.print(rs.getString("teacher_address"));
      out.write("</textarea></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Update\" name=\"btn_update\"></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("            ");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Concatenated js plugins and jQuery -->\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/app.js\"></script>\n");
      out.write("        <script src=\"https://js.stripe.com/v3/\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/data/tipuedrop_content.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core js -->\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/global.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Navigation options js -->\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/navbar-v1.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/navbar-v2.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/navbar-mobile.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/navbar-options.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/sidebar-v1.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core instance js -->\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/main.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/chat.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/touch.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/tour.js\"></script>\n");
      out.write("        <!-- Components js -->\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/explorer.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/widgets.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/modal-uploader.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/popovers-users.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/popovers-pages.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/lightbox.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/feed.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/webcam.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/compose.js\"></script>\n");
      out.write("        <script src=\"../Assets/friendskit/assets/js/autocompletes.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            <script src=\"../Assets/JQuery/jQuery.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $('#img_pic').click(function() {\n");
      out.write("                $('#file_pic').trigger('click');\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            // Check for the File API support.\n");
      out.write("            if (window.File && window.FileReader && window.FileList && window.Blob) {\n");
      out.write("                document.getElementById('file_pic').addEventListener('change', handleFileSelect, false);\n");
      out.write("            } else {\n");
      out.write("                alert('The File APIs are not fully supported in this browser.');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function handleFileSelect(evt) {\n");
      out.write("                var f = evt.target.files[0]; // FileList object\n");
      out.write("                var reader = new FileReader();\n");
      out.write("                // Closure to capture the file information.\n");
      out.write("                reader.onload = (function(theFile) {\n");
      out.write("                    return function(e) {\n");
      out.write("                        var binaryData = e.target.result;\n");
      out.write("                        //Converting Binary Data to base 64\n");
      out.write("                        var base64String = window.btoa(binaryData);\n");
      out.write("                        //showing file converted to base64\n");
      out.write("                        document.getElementById('txt_pic').value = 'data:image/jpeg;base64,' + base64String;\n");
      out.write("\n");
      out.write("                        //url to image\n");
      out.write("                        var url = 'data:image/jpeg;base64,' + base64String;\n");
      out.write("                        document.getElementById(\"img_pic\").src=url;\n");
      out.write("\n");
      out.write("                    };\n");
      out.write("                })(f);\n");
      out.write("                // Read in the image file as a data URL.\n");
      out.write("                reader.readAsBinaryString(f);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
