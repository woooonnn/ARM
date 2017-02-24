<%@page import="java.util.ArrayList" %>
<%@page import="com.arm.dto.*" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" href="style.css" type="text/css">
<script src="js/amcharts.js" type="text/javascript"></script>
<script src="js/serial.js" type="text/javascript"></script>
<script src="js/todaygraph.js"></script>
<script src="js/dailygraph.js"></script>

<script type="text/javascript">
	function change_app(selectobj){
		var va=selectobj.value;
		var str="/appManageServlet?appname"+va
		document.f.action=str;
		document.f.submit();
	}
</script>


<title>Insert title here</title>
</head>
<body>
<header>
		<jsp:include page="/include/include_header.jsp" />
</header>

<div id = "article_wrapper" style="padding-left:100px;">
	<div>
		<form name="f" method="post">
			<sapn id="selectaff" style="float:left;">
				<select class="form-control" name="selaffliate">
					<option>KB국민은행</option>
					<option>KB국민카드</option>
				</select>
			</sapn>
			<span id="selectapp" style="float:left; padding-left:30px;">
				<select class="form-control" name="selapp" onchange="change_day(this)">
					<option value="starbanking">KB스타뱅킹</option>
					<option value="bankingmini">스타뱅킹미니</option>
					<option value="smartotp">스마트OTP</option>
				</select>
			</span>
		</form>
	</div>
	<br><br><br>
	<div id="middle" style="width:1000px;height:400px;">
		<span id="todayscore" style="float:left; width:300px;height:300px;"></span>
		<span id="dailyscore" style="float:left; width:580px;height:300px;"></span>
	</div>
	
	
	<table class="table table-striped"><tr class="success"><td>id</td><td>이름</td><td>점수</td></tr>
			<%
				ArrayList<appRivewDTO> list=(ArrayList<appRiewDTO>)request.getAttribute("list");
				for(int i=0;i<list.size();i++){
			%>
			<tr><td><%=list.get(i).getUserid() %></td><td><%=list.get(i).getUname()%></td><td><%=list.get(i).getDaySocre()%></td></tr>
			<%} %>
	</table>
</div>

<footer>
</footer>
</body>
</html>