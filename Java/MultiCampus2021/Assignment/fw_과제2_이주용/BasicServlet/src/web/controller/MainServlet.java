package web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


@WebServlet("/main")
public class MainServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONObject resJson = new JSONObject();
		
		request.setCharacterEncoding("utf-8");
		BufferedReader br = request.getReader();
		JSONObject reqJson = (JSONObject) JSONValue.parse(br);
		String sign = (String) reqJson.get("sign");
		
		if(sign == null) {
			return;
			
		} else if(sign.equals("login")) {
			String id = (String) reqJson.get("id");
			
			// dao.login(id)
			// login ok
			
			resJson.put("id", id);
		}
		out.append(resJson.toJSONString());
	}


}
