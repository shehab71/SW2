package controllor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.classes.employee;

/**
 * Servlet implementation class editEmployee
 */
@WebServlet("/editEmployee")
public class editEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editEmployee() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		doGet(request, response);
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		int phone=Integer.parseInt(request.getParameter("phone"));
		int personal_id=Integer.parseInt(request.getParameter("Personal_ID"));
		int salary=Integer.parseInt(request.getParameter("salary"));
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		controllor.ifexistEmployee.e1.setfname(fname);
		controllor.ifexistEmployee.e1.setlname(lname);
		controllor.ifexistEmployee.e1.setgender("men");
		controllor.ifexistEmployee.e1.setsalary(salary);
		controllor.ifexistEmployee.e1.setEmail(email);
		controllor.ifexistEmployee.e1.setPass(pass);
		response.sendRedirect("adminUI.jsp");
		
	}

}
