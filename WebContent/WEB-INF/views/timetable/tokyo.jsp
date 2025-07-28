<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:import url="../layout/app.jsp">
    <c:param name="content">
        <h2>東京駅 時刻表</h2>
        <h3>JR東日本 山手線外回り 品川・渋谷方面 (平日版)</h3>

        <table class="tokyo">

            <tr>
                <th class="detail">詳細</th>
                <th class="time">時刻</th>
                <th class="destination">行先</th>
                <th class="track">のりば</th>
            </tr>
            <c:forEach var="tokyo" items="${tokyo}">

                <tr>
                    <td><a
                        href="${pageContext.request.contextPath}/tokyo_detail?id=${tokyo.id}">詳細</a></td>
                    <td><fmt:formatDate value="${tokyo.time}" pattern="HH:mm" /></td>
                    <td><c:out value="${tokyo.destination}" /></td>
                    <td><c:out value="${tokyo.track}" /></td>
                </tr>

            </c:forEach>

        </table>



    </c:param>
</c:import>