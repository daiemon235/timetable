<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:import url="../layout/app.jsp">
    <c:param name="content">

        <h2>発車時刻詳細</h2>
        <h3>（大阪駅 大阪環状線内回り 西九条・新今宮方面）</h3>

        <table class="osaka2">
            <tbody>
                <tr>
                    <!-- 「○○時○○分」と表示 -->
                    <th>発車時刻</th>
                    <td><fmt:formatDate value="${osaka.time}" pattern="HH時mm分" /></td>
                </tr>
                <tr>
                    <th>種別</th>
                    <td><c:out value="${osaka.type}" /></td>
                </tr>
                <tr>
                    <th>行先</th>
                    <td><c:out value="${osaka.destination}" /></td>
                </tr>
                <tr>
                    <!-- 「○番のりば」と表示 -->
                    <th>のりば</th>
                    <td><c:out value="${osaka.track}" />番のりば</td>

                </tr>
            </tbody>
        </table>

            <!-- "remark" = "注釈" -->
            <!-- ("途中駅切り離し"や"誤乗防止の案内") -->
        <p>
            <c:out value="${osaka.remark}" />
        </p>

        <p>
            <c:out value="${osaka.remark2}" />
        </p>

        <p>※時刻データは最新のものではございません。</p>
        <p>現行ダイヤと異なる場合があります。</p>

        <p>
            <a href="${pageContext.request.contextPath}/osaka">一覧に戻る</a>
        </p>
    </c:param>
</c:import>
