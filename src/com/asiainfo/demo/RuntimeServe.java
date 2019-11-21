package com.asiainfo.demo;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hyperic.sigar.Sigar;

import com.sun.net.httpserver.HttpServer;

public class RuntimeServe extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		handleReq(req,resp);
	}
	
	void handleReq(HttpServletRequest req,HttpServletResponse resp){
		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
//		resp.setCharacterEncoding("UTF-8");
		HttpSession httpSession=req.getSession();
		Runtime r = Runtime.getRuntime();
		Properties props = System.getProperties();
		InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String ip = addr.getHostAddress();
		Map<String, String> map = System.getenv();
		String userName = map.get("s");// 获取用户名
		String computerName = map.get("COMPUTERNAME");// 获取计算机名
		String userDomain = map.get("USERDOMAIN");// 获取计算机域名
		long totalMemory =r.totalMemory();
	    long freeMemory = r.freeMemory();
		
		Computer computer=new Computer();
		Sigar sigar=new Sigar();
		req.setAttribute("userName", userName);
		req.setAttribute("computerName", computerName);
		req.setAttribute("userDomain", userDomain);
		req.setAttribute("totalMemory", totalMemory);
		req.setAttribute("freeMemory", freeMemory);
		
		try {
               req.getRequestDispatcher("hardwareInfo.jsp").forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
