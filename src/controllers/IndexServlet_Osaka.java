package controllers;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Osaka;
import utils.DBUtil;

// 一覧画面（大阪駅）

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/osaka")
public class IndexServlet_Osaka extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet_Osaka() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManager em = DBUtil.createEntityManager();

        List<Osaka> osaka = em.createNamedQuery("getOsaka", Osaka.class).getResultList();
        response.getWriter().append(Integer.valueOf(osaka.size()).toString());

        em.close();

        request.setAttribute("osaka", osaka);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/timetable/osaka.jsp");
        rd.forward(request, response);
    }

}
