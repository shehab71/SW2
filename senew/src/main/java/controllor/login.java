package controllor;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		
		String user_Type=request.getParameter("User");
//		System.out.println(user_Type);
		if (String.valueOf(user_Type).equals("admin"))
		{
			
			if (String.valueOf(request.getParameter("uname")).equals("ahmed@") && String.valueOf(request.getParameter("psw")).equals("asd@"))
			{
				System.out.println(user_Type);
				RequestDispatcher dis=request.getRequestDispatcher("adminUI.jsp");
				dis.forward(request, response);
			}
		}//else if (user_Type=="emoployee")
//		{
//			
//		}else if (user_Type=="customer")
//		{
//			
//		}else {
//			
//		}
		
	}

}
