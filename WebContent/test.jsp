<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.9.0/jquery.js"></script>
<script>
	function searchClick() {		// ��ġ �˻� ��ư�� ������ �� �Լ�
		var psearch = $('#search').val();	// ��� �̸�
		var url = "https://www.googleapis.com/androidpublisher/v2/applications/com.kbstar.smartotp/reviews?access_token=ya29.Glv7A0X8ZXiZ9b3CsiNv14FjTVPJLV64L5xbD-TXT1bkRGKSy7qljEuoq6TGqGKpIETI4F9vlB2cPRLhI858Txnd9anbtRBXlySoBhWQNxmACO47zsPqsyE2AgTi"
		var output = "";
		var address;
		var point_x;
		var point_y;
		var title;
		var x;
		var y
		$.ajax({		// ajax�� ���� ����� �ּҸ� �޾ƿ´�.
			url : url,
			dataType : "JSON",
			type : "GET",
			success : function(data) {
				
				var myXML = data.responseText;
				myXML = $.parseXML(myXML);
				$(myXML).find("item").each(	// xml �Ľ�
						function(i) {
	
							address = $(this).find("address").eq(0).text();
							point_x = $(this).find("mapx").eq(0).text();
							point_y = $(this).find("mapy").eq(0).text();
							title = $(this).find("title").eq(0).text();
							list.push({
								placeName : title,
								add : address,
								x : point_x,
								y : point_y
							});
							output += "<b>" + title		// �ּҰ˻������ ���̾�α׿� html�� �߰�
									+ "</b>&nbsp&nbsp&nbsp&nbsp"
									+ "<a href='#' id='" + i
									+ "' onclick='changeMinimap(id); return false;'>"
									+ address + "</a>" + "<br><br>";
						});
				document.getElementById("list").innerHTML = output;
				$("#popup").dialog({	// ���̾�α� open
					width : 500,
					height : 400
				});
			}
		});

	}

</script>
<body>
<% 
	AndroidPublisherHelper helper=new AndroidPublisherHelper();
	helper.init("com.kbstar.smartotp");
	
%>
</body>
</html>