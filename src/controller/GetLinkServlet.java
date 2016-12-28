package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Data;
import modelBO.addDataBO;

@WebServlet("/GetLinkServlet")
public class GetLinkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	  
    public GetLinkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathLink = request.getParameter("link");
		String fileName = request.getParameter("fileName");
	
		//add vao db
		addDataBO bo = new addDataBO();
		bo.addData(pathLink, fileName);
		//request cho trang video
		Data data = new Data(pathLink,fileName);
		request.getSession().setAttribute("data", data);
		request.getRequestDispatcher("Video.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
