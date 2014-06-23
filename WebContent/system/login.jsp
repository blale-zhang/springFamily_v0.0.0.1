<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/context.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>seajs示例</title>
<script src="${ctx}/component/seajs-2.2.1/dist/sea.js" id="seajsnode"></script>
<script type="text/javascript">
	seajs.config({
		base : "../js",
		alias : {
			"jquery" : "jquery.js",
			"bootstrap" : "bootstrap.js",
			'jqueryUi':'jquery-ui.js'
		}
	});
</script>
</head>
<body>
	<div id="layout" style="width:400px;height:300px;border:1px;border-style: solid;">
		
		<div class="top"></div>
		<div class="left"></div>
		<div class="center"></div>
		<div class="right"></div>
		<div class="bottom"></div>
		
		<div id="show" style="width:100px;height:100px;border:1px;border-style: solid;">show</div>
		<div id="another" style="width:100px;height:100px;border:1px;border-style: solid;">another</div>
	</div>
	<div id="log"></div>
	
	<div id="container"></div>
</body>

<script type="text/javascript">
	// 加载一个模块，在加载完成时，执行回调
	seajs.use([ './hello', 'jquery','bootstrap','jqueryUi'], function(a, $,bootstrap,jqueryUi) {
		var num = a['a'](4);
		bootstrap($);
		jqueryUi($);
		$("#show").draggable();
		$("#another").draggable();
		
		$( "#another" ).draggable({
			  stop: function( event, ui ) {
// 				  console.log(event);
// 				  console.log(ui);
 				  console.log(isHover2($( "#layout" ),ui.helper));
				  if(!isHover2($( "#layout" ),ui.helper)){
					  ui.helper.appendTo($('#container'));
				  }else{
					  ui.helper.appendTo($( "#layout" ));
// 					  ui.helper.offset().top = 
				  }
			  }
		});
// 		console.log($("#layout").offset().top);
// 		console.log($("#layout").offset().left);
		function getPosition(){
	
		}
		/**
			两元素相交（包含） $jQueryObj ) $this
		**/
		function isHover($jQueryObj,$this){
			
			//上左座标
			var $jQueryObjTop =  $jQueryObj.offset().top;
			var $jQueryObjLeft =  $jQueryObj.offset().left;
			var $thisTop =  $this.offset().top;
			var $thisLeft =  $this.offset().left;
			//宽度，高度
			var $thisWidth = $this.width();
			var $thisHeight = $this.height();
			var $jQueryObjWidth = $jQueryObj.width();
			var $jQueryObjHeight = $jQueryObj.height();
			
			//下右座标
			var $thisRight = $thisLeft + $thisWidth;
			var $thisBottom = $thisTop + $thisHeight;
			var $jQueryObjRight = $jQueryObjLeft + $jQueryObjWidth;
			var $jQueryObjBottom = $jQueryObjTop + $jQueryObjHeight;
			
			//判断$this是否在$jQueryObjTop里面
			if( $jQueryObjTop <= $thisTop && $jQueryObjLeft <= $thisLeft && 
					$jQueryObjRight >= $thisRight &&  $jQueryObjBottom >= $thisBottom	){
				return true;
			}
			return false;
		}
	
		/**
		两元素相交（包含） $jQueryObj ) $this
	**/
	function isHover2($jQueryObj,$this){
		
			var $jQueryObjPos = getPositions($jQueryObj);
			var $thisPos = getPositions($this);
			//判断$this是否在$jQueryObjTop里面
			if( $jQueryObjPos.topAxis <= $thisPos.topAxis &&
					$jQueryObjPos.leftAxis <= $thisPos.leftAxis && 
					$jQueryObjPos.rightAxis >= $thisPos.rightAxis &&
					$jQueryObjPos.bottomAxis >=  $thisPos.bottomAxis	){
				return true;
			}
			return false;
	}
		
	//获取元素位置信息
	function getPositions($jQueryObj){
		
		var rightAxis = $jQueryObj.offset().left + $jQueryObj.width();
		var bottomAxis = $jQueryObj.offset().top + $jQueryObj.height();
		var topAxis = $jQueryObj.offset().top;
		var leftAxis = $jQueryObj.offset().left;
		return {
			topAxis: topAxis,
			rightAxis: rightAxis ,
			bottomAxis: bottomAxis ,
			leftAxis: leftAxis,
			centerPoint: { x:(leftAxis + rightAxis)/2, y:(topAxis + bottomAxis)/2}
// 		,
// 			leftTopPoint:{x:},
// 			rightTopPoint:{},
// 			leftBottomPoint:{},
// 			rightBottomPoint:{}
		};
	}
		
	//两元素相交
	function isTouch($jQueryObj,$this){
		
		if(isHover2($jQueryObj,$this))
			return isHover2($jQueryObj,$this);
		
		var $jQueryObjPos = getPositions($jQueryObj);
		var $thisPos = getPositions($this);
		
		//this 右下角
		if( $jQueryObjLeft <= $thisRight && $jQueryObjRight >= $thisRight &&
				$jQueryObjBottom >= $thisBottom && $jQueryObjTop <= $thisBottom ){
			
		}
		
		//this 右下角(未写)TODO
		if($jQueryObjTop <= $thisTop && $jQueryObjLeft <= $thisLeft &&
				$jQueryObjRight >= $thisRight &&  $jQueryObjBottom >= $thisBottom	){
			
		}
		
		//判断$this是否在$jQueryObjTop里面
		if( $jQueryObjTop <= $thisTop && $jQueryObjLeft <= $thisLeft &&
				$jQueryObjRight >= $thisRight &&  $jQueryObjBottom >= $thisBottom	){
			return true;
		}
		return false;
	}
		
		
	$( "#layout" ).mousemove(function( event ) {
		  var msg = "Handler for .mousemove() called at ";
		  msg += event.pageX + ", " + event.pageY;
		  $( "#log" ).html('');
		  $( "#log" ).append( "<div>" + msg + "</div><div>"+isHover2($(this),$( "#another" ))+"<div>" );
		  
// 		  console.log(isHover2($(this),$( "#another" )));
		 
	});
		
	});
</script>

</html>