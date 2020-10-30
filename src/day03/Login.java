package day03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/day03/login.cls")
public class Login extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/WEB-INF/views/day03/Login.jsp";
		String sid = "";
		try {
			// 세션에 기록된 데이터를 꺼내는 방법
			HttpSession session = req.getSession();
			sid = (String)req.getSession().getAttribute("SID");
			if(sid != null) {
				view = "/jspcls/main.cls";
				resp.sendRedirect(view);
				return;
			}
		} catch(Exception e){
			view = "/jspcls/main.cls";
		}
		RequestDispatcher rd = req.getRequestDispatcher(view);
		try {
			rd.forward(req, resp);
			return;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
