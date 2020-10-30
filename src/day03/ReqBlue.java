package day03;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/day03/reqblue.cls")
public class ReqBlue extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/jspcls/day03/reqRed.cls";
		
		// redirect 방식
		try {
			resp.sendRedirect(view);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
