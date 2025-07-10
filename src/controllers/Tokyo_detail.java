package controllers;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Tokyo;
import utils.DBUtil;

// 詳細画面（東京駅）
/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/tokyo_detail")
public class Tokyo_detail extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tokyo_detail() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntityManager em = DBUtil.createEntityManager();

        // 該当のIDの発車時刻1件のみをデータベースから取得
        Tokyo m = em.find(Tokyo.class, Integer.parseInt(request.getParameter("id")));

        em.close();

        // メッセージデータをリクエストスコープにセットしてtokyo_detail.jspを呼び出す
        request.setAttribute("tokyo", m);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/timetable/tokyo_detail.jsp");
        rd.forward(request, response);
    }
}