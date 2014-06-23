<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/context.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
			'xslt':'/js/jquery-xslt.js'
		}
	}).use(['bootstrap_css','bootstrap_theme']);
</script>
<title>less样式示例</title>
</head>
<body>

<button class="btn">bootstrap</button>
	<div class="dropdown">
		<button class="btn dropdown-toggle sr-only" type="button"
			id="dropdownMenu1" data-toggle="dropdown">
			Dropdown <span class="caret"></span>
		</button>
		<div class="btn-group">
			<button type="button" class="btn btn-default">1</button>
			<button type="button" class="btn btn-default">2</button>

			<div class="btn-group">
				<button type="button" class="btn btn-default dropdown-toggle"
					data-toggle="dropdown">
					Dropdown <span class="caret"></span>
				</button>
				<ul class="dropdown-menu">
					<li><a href="#">Dropdown link</a>
					</li>
					<li><a href="#">Dropdown link</a>
					</li>
				</ul>
			</div>
		</div>
	</div>


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

				<!-- Single button -->
				<div class="btn-group">
					<button type="button" class="btn btn-default dropdown-toggle"
						data-toggle="dropdown">
						Action <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" role="menu">
						<li><a href="#">Action</a>
						</li>
						<li><a href="#">Another action</a>
						</li>
						<li><a href="#">Something else here</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">Separated link</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div>
		<form class="navbar-form navbar-left" role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>
	
</body>


<script type="text/javascript"> 
	// 加载一个模块，在加载完成时，执行回调
	seajs.use(['jquery','less','jqueryUi'], function ($,less,ui){
		ui($);
		$("div").draggable();
		/* var parser = new(less.Parser);
		
		parser.parse('.class { width: 1 + 1 }', function (e, tree) {
		    tree.toCSS({ compress: true }); // Minify CSS output
		});
		 */
	});
</script>

<!-- <script type="text/javascript"> 
	// 加载一个模块，在加载完成时，执行回调
	seajs.use(['buttons_less','jquery','less'], function (btn,$,less){
		var parser = new(less.Parser)({
		    paths: ['${ctx}', './component/bootstrap-3.0.2/less'], // Specify search paths for @import directives
		    filename: 'buttons.less' // Specify a filename, for better error messages
		});

		parser.parse(['buttons_less'], function (err, tree) {
		    if (err) { return console.error(err) }
		    console.log(tree.toCSS());
		});
	});
</script> -->
</html>