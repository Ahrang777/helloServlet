package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")	// 이 클래스의 URL을 여기서 매핑 시켜주고 있다
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Process: access to database, perform business logic
		
		// Build HTML code
		PrintWriter out = response.getWriter();
		// ctrl + shift + o	>> 자동으로 import
		
		String htmlResponse="<html>";
		htmlResponse += "<h2> Your username is "+username+"</h2>"; 
		htmlResponse += "<h2> Your password is "+password+"</h2>";
		htmlResponse += "</html>";
		out.println(htmlResponse);
	}

}
