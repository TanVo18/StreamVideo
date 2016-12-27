package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Data;

@WebServlet("/GetLinkServlet")
public class GetLinkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	  
    public GetLinkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathLink = request.getParameter("link");
		String nameOfSub = request.getParameter("fileName");
		Data data = new Data(pathLink,nameOfSub);
		request.getSession().setAttribute("data", data);
		request.getRequestDispatcher("Video.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
