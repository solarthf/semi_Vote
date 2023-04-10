package vote.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.dao.MemberDao;
import member.model.service.MemberService;
import member.model.service.RankService;
import member.model.service.VotetestService;
import member.model.vo.MemberVo;
import member.model.vo.VotetestVo;

/**
 * Servlet implementation class VoteController
 */
@WebServlet("/vote")
public class VoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("memberlist", new MemberService().getMemberList());
		request.getRequestDispatcher("/WEB-INF/view/vote.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		VotetestVo vo = new VotetestVo();
		vo.setvJumin(request.getParameter("vJumin"));
		vo.setvName(request.getParameter("vName"));
		vo.setMemberNo(request.getParameter("memberNo"));
		vo.setvTime(request.getParameter("vTime"));
		vo.setvArea(request.getParameter("vArea"));
		vo.setvConfirm(request.getParameter("vConfirm"));
		
		int result = -1;
		if(vo != null) {
			result = new VotetestService().vote(vo);
		} 
		if(result < 1) {
			request.setAttribute("msg", "정보를 다시 확인해주세요.");			 
		} else {
			request.setAttribute("msg", "투표하기 정보가 정상적으로 등록되었습니다.");		
		}
		request.getRequestDispatcher("/WEB-INF/msgAlert.jsp").forward(request, response);
 
		

	}

}
