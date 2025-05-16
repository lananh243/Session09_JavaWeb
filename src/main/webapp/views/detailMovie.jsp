<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/16/2025
  Time: 1:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Movie Detail</title>
</head>
<body>
    <h2>Chi tiết các bộ phim</h2>
    <p>Id: ${movie.id}</p>
    <p>Tiêu đề: ${movie.title}</p>
    <p>Đạo diễn: ${movie.director}</p>
    <p>Thể loại: ${movie.genre}</p>
    <p>Mô tả: ${movie.description}</p>
    <p>Thời lượng: ${movie.duration}</p>
    <p>Ngôn ngữ: ${movie.language}</p>

    <h3>Lịch chiếu</h3>
    <c:if test="${not empty schedules}">
        <table border="1" cellspacing="0" cellpadding="8">
            <tr>
                <th>Thời gian</th>
                <th>Phòng chiếu</th>
                <th>Ghế trống</th>
                <th>Định dạng</th>
            </tr>
            <c:forEach var="schedule" items="${schedules}">
                <tr>
                    <td>${schedule.showTime}</td>
                    <td>${schedule.screenRoomId}</td>
                    <td>${schedule.availableSeats}</td>
                    <td>${schedule.format}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

    <c:if test="${empty schedules}">
        <p>Không có lịch chiếu nào cho phim này.</p>
    </c:if>
</body>
</html>
