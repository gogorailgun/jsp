package day03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/day03/reqRed.cls")
public class ReqRed extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		// 할일 
		// 1. 넘겨주는 데이터를 받는다.(생략)
		// 2. 데이터가공(생략)
		// 3. 데이터를 페이지 심는다.(생략)
		// 4. 뷰를 부른다.
		String view = "/WEB-INF/views/day03/parang.jsp";
		
		// forward 방식
		RequestDispatcher rd = req.getRequestDispatcher(view);
		try {
			rd.forward(req, resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
