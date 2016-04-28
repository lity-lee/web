package com.lity.org.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Index() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		request.get
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		getServletContext().getRequestDispatcher(".jsp").forward(request, response);
//		response.sendRedirect("index.jsp");
//		response.getOutputStream().write("<p>hello, world</p>".getBytes());
//		response.
		response.getWriter().append("username:" + request.getParameter("username"));
		response.getWriter().append("password:" + request.getParameter("password"));

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
