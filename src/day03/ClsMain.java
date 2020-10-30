package day03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet({"/main.cls"})
public class ClsMain extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		// 할일
		// 전달되어야 할 데이터가 없으므로 view를 부르기로 한다
		String view = "/WEB-INF/views/main.jsp";
		
		// 리다이렉트
		
		RequestDispatcher rd = request.getRequestDispatcher(view);
		try {
			// 뷰를 포워딩 시킨다.
			rd.forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
