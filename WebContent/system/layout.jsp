<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${ctx}/component/seajs-2.2.1/dist/sea.js" id="seajsnode"></script>
<script type="text/javascript">
	seajs.config({
		base : "../js",
		alias : {
			"baseCss" : "${ctx}/css/base.css",
			"layoutCss" : "${ctx}/css/layout.css"
		}
	});
</script>
<%-- <link rel="stylesheet" type="text/css" href="${ctx}/css/base.css"></link>
<link rel="stylesheet" type="text/css" href="${ctx}/css/layout.css"></link>
 --%>
<title>布局练习</title>
</head>
<body>

	<div class="head">这是头部</div>

	<div class="left">这是左部，css2的 display:inline;与 float:left 好似有些区别，在试验的过程中，inline宽度以文字宽为准
	
	而float:left;则是以width.
	
	
	</div>
	<div class="center">中间</div>
	<!-- 		<div class="right">右部</div> -->
	<div class="foot">底部</div>
</body>
<script type="text/javascript">
	// 加载一个模块，在加载完成时，执行回调
	seajs.use([ 'baseCss', 'layoutCss']); 
</script>
</html>