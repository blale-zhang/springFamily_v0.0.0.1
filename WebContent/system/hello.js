define(function(require, exports, module) {

  // 模块代码
  var $ = require('jquery');
 
  // 通过 exports 对外提供接口
//   exports.doSomething = alert(1);

  // 或者通过 module.exports 提供整个接口
  var a = function(obj){
//	  alert(obj);
	  return obj;
  };
  //使用namespace方式把function引到页面上去，然后再调用
  var std = {};
  std['a'] = a;
  module.exports = std;
//  exports.a = a;
  

  
});