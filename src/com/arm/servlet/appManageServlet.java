package com.arm.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.arm.dao.appRivewDAO;
import com.arm.dto.appRivewDTO;


/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/manageServlet")
public class appManageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public appManageServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		init(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		init(request,response);
	}

	/**
	 * 초기 함수
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void init(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String appname=request.getParameter("appname");	
		//HttpSession session=request.getSession();
		if(appname.equals("starbanking")){	// 특정학생 성적관리
			
			appRivewDAO dao= new appRivewDAO();
			ArrayList<appRivewDTO> list=dao.getAppRivewList("0001");
			
			request.setAttribute("list",list);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

		}
		else if(appname.equals("bankingmini")){	// 특정학생의 특정날짜시험 점수
			appRivewDAO dao= new appRivewDAO();
			ArrayList<appRivewDTO> list=dao.getAppRivewList("0002");

			request.setAttribute("list",list);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}

		else if(appname.equals("smartotp")){	// 요일별 점수
			appRivewDAO dao= new appRivewDAO();
			ArrayList<appRivewDTO> list=dao.getAppRivewList("0003");
			request.setAttribute("list",list);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}
}
