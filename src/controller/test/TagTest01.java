package controller.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ClsMain;

public class TagTest01 implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// 할일
		// 데이터 받을 일 없고 그냥 뷰만 부른다.
		req.setAttribute("isRedirect", false);
		String view = "test/foreach01";
		return view;
	}

}
