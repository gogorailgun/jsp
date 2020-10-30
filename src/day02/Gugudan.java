package day02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/day02/Gugudan.cls")
public class Gugudan extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view ="/WEB-INF/views/day02/gugudan.jsp";
		
		
		RequestDispatcher rd = req.getRequestDispatcher(view);
		
		try {
			rd.forward(req, resp);
			/* System.out.println("### : " + view); */
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}