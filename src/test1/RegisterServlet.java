package test1;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register/Register")
public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		//设置接受请求信息的编码格式
		request.setCharacterEncoding("utf-8");
		//接受register.html的注册信息
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String sage = request.getParameter("age");
		//在控制台打印输出注册信息
		System.out.println("name="+name+"; password="+password+"; age="+sage);
		System.out.println("对RegisterServlet.java进行了修改");
	}

}
