package day03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/dataJo.cls")
public class AjaxSvlt01 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String sid = req.getParameter("id");
		String spw = req.getParameter("pw");
		
		PrintWriter pw = null;
		try {
			pw = resp.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.println("{");
		pw.println("	\"id\": \"" + sid + "\"");
		pw.println("	\"pw\": \"" + spw + "\"");
		pw.println("}");
	}
}
