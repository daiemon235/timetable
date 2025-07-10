<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:import url="../layout/app.jsp">
    <c:param name="content">
        <link rel="stylesheet" href="<c:url value='/css/style_tokyo.css' />">


        <h2>発車時刻詳細</h2>
        <h3>（東京駅 山手線外回り 品川・渋谷方面）</h3>


        <table class="tokyo2">

            <tbody>
                <!-- 山手線の電車はすべて各駅に停車 -->
                <tr>
                    <th>発車時刻</th>
                    <td><fmt:formatDate value="${tokyo.time}" pattern="HH時mm分" /></td>
                </tr>
                <tr>
                    <th>行先</th>
                    <td><c:out value="${tokyo.destination}" /></td>
                </tr>
                <tr>
                    <th>のりば</th>
                    <td><c:out value="${tokyo.track}" /></td>

                </tr>
            </tbody>
        </table>

        <p>※時刻データは最新のものではございません。</p>
        <p>現行ダイヤと異なる場合があります。</p>


        <p>
            <a href="${pageContext.request.contextPath}/tokyo">一覧に戻る</a>
        </p>
    </c:param>
</c:import>