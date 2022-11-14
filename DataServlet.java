/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

import java.util.*;

import java.sql.*;

import javax.servlet.*;

import javax.servlet.http.*;
/**
 *
 * @author Dell
 */
@WebServlet(name = "DataServlet", urlPatterns = {"/DataServlet"})
public class DataServlet extends HttpServlet {
 private ServletConfig config;

  //Setting JSP page

  String page="adminhome.jsp";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  public void init(ServletConfig config)
	  throws ServletException{
		 this.config=config;
	   }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          String connectionURL = "jdbc:mysql://localhost:3306/employee";
		Connection connection=null;
		ResultSet rs;
		response.setContentType("text/html");
		List dataList=new ArrayList(); 
			try {
			 // Load the database driver
			Class.forName("com.mysql.jdbc.Driver");
			// Get a Connection to the database
			connection = DriverManager.getConnection(connectionURL, "root", ""); 
			//Select the data from the database
			String sql = "select * from employee where status='PENDING'";
			Statement s = connection.createStatement();
			s.executeQuery (sql);
			rs = s.getResultSet();
			while (rs.next ()){
				//Add records into data list
                                dataList.add(rs.getString("id"));
				dataList.add(rs.getString("first_name"));
				dataList.add(rs.getString("last_name"));
                                dataList.add(rs.getString("address"));
				dataList.add(rs.getString("contact"));
                                dataList.add(rs.getString("qualification"));
				dataList.add(rs.getString("design"));
                                dataList.add(rs.getString(10));
			}
			rs.close ();
			s.close ();
			}catch(Exception e){
			System.out.println("Exception is ;"+e);
			}
			request.setAttribute("data",dataList);
			//Disptching request
			RequestDispatcher dispatcher = request.getRequestDispatcher(page);
			if (dispatcher != null){
				dispatcher.forward(request, response);
			} 
  /* TODO output your page here. You may use following sample code. */
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
