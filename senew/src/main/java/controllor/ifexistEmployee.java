package controllor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ifexistEmployee
 */
@WebServlet("/ifexistEmployee")
public class ifexistEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static com.classes.employee e1; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ifexistEmployee() {
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
		for(int i=0;i<com.classes.employee.em.size();i++)
		{
			if(String.valueOf(request.getParameter("firstname")).equals(com.classes.employee.em.get(i).getFname()))
			{
				e1=com.classes.employee.em.get(i);
				RequestDispatcher dis=request.getRequestDispatcher("editEmployee.jsp");
				dis.forward(request, response);
			}
		}
	}

}
