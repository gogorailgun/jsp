package controller.test;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ClsMain;

public class Gugudan extends HttpServlet implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("isRedirect", false);
		
		// 데이터 만들고
		ArrayList color = new ArrayList();
		color.add("w3-red");
		color.add("w3-orange");
		color.add("w3-deep-orange");
		color.add("w3-yellow");
		color.add("w3-lime");
		color.add("w3-blue");
		color.add("w3-aqua");
		color.add("w3-cyan");
		color.add("w3-indigo");
		color.add("w3-purple");
		
		// 데이터 넘겨주고
		req.setAttribute("COLOR", color);
		
		return "test/gugudan";
	}

}
