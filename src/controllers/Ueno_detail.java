package controllers;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Osaka;
import utils.DBUtil;


// 詳細画面（上野駅）
/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/ueno_detail")
public class Ueno_detail extends HttpServlet {
        private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ueno_detail() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManager em = DBUtil.createEntityManager();

        // 該当のIDの発車時刻1件のみをデータベースから取得
        Osaka m = em.find(Osaka.class, Integer.parseInt(request.getParameter("id")));

        em.close();

        // メッセージデータをリクエストスコープにセットしてosaka_detail.jspを呼び出す
        request.setAttribute("osaka", m);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/timetable/osaka_detail.jsp");
        rd.forward(request, response);
    }
}