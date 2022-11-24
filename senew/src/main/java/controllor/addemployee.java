package controllor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.classes.*;
/**
 * Servlet implementation class addemployee
 */
@WebServlet("/addemployee")
public class addemployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addemployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//int personal_id, int phone, String fname, String lname, String gender,int salary,String email,String password
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		int phone=Integer.parseInt(request.getParameter("phone"));
		int personal_id=Integer.parseInt(request.getParameter("Personal_ID"));
		int salary=Integer.parseInt(request.getParameter("salary"));
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		employee e1=new employee(personal_id,phone,fname,lname,"men",salary,email,pass);
		response.sendRedirect("adminUI.jsp");
		
	}

}
