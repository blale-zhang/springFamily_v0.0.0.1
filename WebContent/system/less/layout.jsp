<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/context.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- <link rel="stylesheet/less" href="${ctx}/component/bootstrap-3.0.2/less/bootstrap.less"></link> --%>
<%-- <script src="${ctx}/js/less.js"></script> --%>
<script src="${ctx}/component/seajs-2.2.1/dist/sea.js" id="seajsnode"></script>
<script type="text/javascript">
	seajs.config({
				base : "${ctx}",
				alias : {
					"jquery" : "js/jquery.js",
					"bootstrap" : "js/bootstrap.js",
					"less" : "js/less.js",
					"alerts_less" : "component/bootstrap-3.0.2/less/alerts.less#",
					"buttons_less" : "component/bootstrap-3.0.2/less/buttons.less#",
					"bootstrap_css" : "component/bootstrap-3.0.2/dist/css/bootstrap.min.css",
					"bootstrap_theme" : "component/bootstrap-3.0.2/dist/css/bootstrap-theme.min.css",
					'jqueryUi' : 'js/jquery-ui.js',
					'xslt' : '/js/jquery-xslt.js'
				}
				}).use([ 'bootstrap_css', 'bootstrap_theme' ]);
</script>
<title>bootstrap删格布局</title>
</head>
<body>

	<div class="row">
		<div class="col-md-12">
			<div class="jumbotron">
				<!-- 				<h2>Hello, world!</h2> -->
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-3">
			<div class="jumbotron">
				<ul class="list-group">
					<li class="list-group-item">导航1</li>
					<li class="list-group-item">导航2</li>
					<li class="list-group-item">导航3</li>
					<li class="list-group-item">导航4</li>
					<li class="list-group-item">导航5</li>
				</ul>
			</div>
		</div>
		<div class="col-md-9">
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span2">
						<ul class="nav nav-pills">
							<li class="active"><a href="#">Home</a></li>
							<li><a href="#">Profile</a></li>
							<li><a href="#">Messages</a></li>
						</ul>
					</div>
					<div class="span10">
						<div class="jumbotron"></div>
					</div>
				</div>
			</div>
		</div>
	<!-- 	<div class="col-md-3">
			<div class="jumbotron"></div>
		</div> -->
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="jumbotron">
				<!-- 				<h2>Hello, world!</h2> -->
			</div>
		</div>

	</div>

</body>


<!-- <script type="text/javascript">
	// 加载一个模块，在加载完成时，执行回调
	seajs.use([ 'jquery', 'less', 'jqueryUi' ], function($, less, ui) {
		ui($);
		// 		$("div").draggable();
		/* var parser = new(less.Parser);
		
		parser.parse('.class { width: 1 + 1 }', function (e, tree) {
		    tree.toCSS({ compress: true }); // Minify CSS output
		});
		 */
	});
</script> -->

<script type="text/javascript"> 
	// 加载一个模块，在加载完成时，执行回调
	seajs.use(['jquery','less'], function ($,less){
		var parser = new(less.Parser);({
		    paths: ['${ctx}', 'component/bootstrap-3.0.2/less'], // Specify search paths for @import directives
		    filename: 'bootstrap.less' // Specify a filename, for better error messages
		});

		parser.parse('.class{width:1+1;}', function (err, tree) {
		    if (err) { 
		    	return console.error(err)
		    }
		    console.log(tree.toCSS());
		});
	});
</script>
</html>