package day02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/day02/Test01.cls")
public class Test01 extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view ="/WEB-INF/views/day02/Test01.jsp";
		String url = req.getRequestURI();
		url = url.substring(7);
		// /jspcls/css/w3.css    /jspcls/js/jquery-3.5
		RequestDispatcher rd = req.getRequestDispatcher(view);
		
		try {
			rd.forward(req, resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
