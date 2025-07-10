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

import models.Tokyo;
import utils.DBUtil;

// 一覧画面（東京駅）

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/tokyo")
public class IndexServlet_Tokyo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet_Tokyo() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntityManager em = DBUtil.createEntityManager();

        List<Tokyo> tokyo = em.createNamedQuery("getTokyo", Tokyo.class).getResultList();
        response.getWriter().append(Integer.valueOf(tokyo.size()).toString());


        em.close();

        request.setAttribute("tokyo", tokyo);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/timetable/tokyo.jsp");
        rd.forward(request, response);
    }

}
