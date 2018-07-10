package com.vispute;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Operation extends HttpServlet
{
	//Addition for doGet
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		res.getWriter().println("Num1 Before swapping:"+num1);
		res.getWriter().println("Num2 Before swapping:"+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		res.getWriter().println("Num1 after swapping:"+num1);
		res.getWriter().println("Num2 after swapping:"+num2);
		
	}
	
	//Swapping for DoPost
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		int sum=num1+num2;
		res.getWriter().println("Sum of two numbers is: "+sum);
	}
}
