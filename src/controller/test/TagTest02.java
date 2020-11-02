package controller.test;

import javax.servlet.http.*;
import java.util.*;

import controller.*;

public class TagTest02 implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("isRedirect", false);
		
		// 데이터 만들고
		ArrayList list = new ArrayList();
		list.add("이지우");
		list.add("장성환");
		list.add("오혜찬");
		list.add("유병욱");
		list.add("윤요셉");
		list.add("박진우");
		list.add("김영선");
		list.add("권영선");
		list.add("김주영");
		list.add("장수진");
		
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
		req.setAttribute("LIST", list);
		req.setAttribute("COLOR", color);
		
		return "test/foreach02";
	}

}
