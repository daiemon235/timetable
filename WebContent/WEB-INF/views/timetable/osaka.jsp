<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:import url="../layout/app.jsp">
    <c:param name="content">
        <h2>大阪駅　時刻表</h2>
                <h3>JR西日本　大阪環状線内回り　西九条・新今宮方面　(平日版)</h3>

        <table class="osaka">

            <tr>
                <th class="detail">詳細</th>
                <th class="type">種別</th>
                <th class="time">時刻</th>
                <th class="destination">行先</th>
                <th class="track">のりば</th>
            </tr>
            <c:forEach var="osaka" items="${osaka}">

                <tr>
                    <td><a
                        href="${pageContext.request.contextPath}/osaka_detail?id=${osaka.id}">詳細</a></td>
                        <td><c:out value="${osaka.type}" /></td>
                    <td><fmt:formatDate value="${osaka.time}" pattern="HH:mm" /></td>
                    <td><c:out value="${osaka.destination}" /></td>
                    <!-- "○番のりば"と表示 -->
                    <td><c:out value="${osaka.track}"/>番のりば</td>
                </tr>

            </c:forEach>

        </table>



    </c:param>
</c:import>