<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <link rel="stylesheet" href="css/bootstrap.css">

	<script src="http://code.jquery.com/jquery-1.11.1.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js"></script>
<div id="navbar-wrapper">
				<nav class="navbar navbar-default navbar-static-top" role="navigation">
						<div class="container">
							<div class="navbar-header">
								<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
									<span class="sr-only">Toggle navigation</span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button>
								<span class="navbar-brand" href="#"><B>KB국민은행</B></span>
							</div>

							<!-- Collect the nav links, forms and other content for toggling -->
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav">
									<li><a href="/">리뷰 모니터링</a></li>
									<li><a href="/">앱관리 운영</a></li>
									<li><a href="/">평점관리</a></li>
								</ul>
								<ul class="nav navbar-nav navbar-right">
									<li class="dropdown">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown">설정
											<b class="caret"></b>
										</a>
										<ul class="dropdown-menu">
											<li><a href="/MemberServlet?tag=logout">로그아웃</a></li>
											<%--
												<li><a href="#">정보수정</a></li>
											--%>
										</ul>
									</li>
								</ul>
							</div>
						</div>
					</nav>
				</div>