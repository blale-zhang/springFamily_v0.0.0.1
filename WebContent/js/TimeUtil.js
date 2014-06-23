/**
 * TimeUtil
 */

var TimeUtil = function(){
	
	// ��Date����չ���� Date ת��Ϊָ����ʽ��String
	// ��(M)����(d)��Сʱ(h)����(m)����(s)������(q) ������ 1-2 ��ռλ���� 
	// ��(y)������ 1-4 ��ռλ��������(S)ֻ���� 1 ��ռλ��(�� 1-3 λ������) 
	// ���ӣ� 
	// (new Date()).Format("yyyy-MM-dd hh:mm:ss.S") ==> 2006-07-02 08:09:04.423 
	// (new Date()).Format("yyyy-M-d h:m:s.S")      ==> 2006-7-2 8:9:4.18 
	Date.prototype.Format = function (fmt) { //author: meizz 
	    var o = {
	        "M+": this.getMonth() + 1, //�·� 
	        "d+": this.getDate(), //�� 
	        "h+": this.getHours(), //Сʱ 
	        "m+": this.getMinutes(), //�� 
	        "s+": this.getSeconds(), //�� 
	        "q+": Math.floor((this.getMonth() + 3) / 3), //���� 
	        "S": this.getMilliseconds() //���� 
	    };
	    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	    for (var k in o)
	    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
	    return fmt;
	};
	//���ã� var time1 = new Date().Format("yyyy-MM-dd");var time2 = new Date().Format("yyyy-MM-dd HH:mm:ss");
	var dayMils = 24*60*60*1000;
	var hourMils = 60*60*1000;
	var minuteMils = 60*1000;
	
	/**
	 * ��ȡָ���µ�����
	 */
	function getDaysNumOfMonth(mm){
		
		var date  = new Date();
		var year = date.getFullYear();
		var isLeapYear =  (year%4 == 0 && year%100 != 0 || year%400 == 0 && year%100 != 0); 
		var dayOfMonth = 30;
		switch(mm){
			case 1:dayOfMonth = 31;break;
			case 2: dayOfMonth = isLeapYear? 29:28;break;
			case 3:dayOfMonth = 31;break;
			case 4:dayOfMonth = 30;break;
			case 5:dayOfMonth = 31;break;
			case 6:dayOfMonth = 30;break;
			case 7:dayOfMonth = 31;break;
			case 8:dayOfMonth = 31;break;
			case 9:dayOfMonth = 30;break;
			case 10:dayOfMonth = 31;break;
			case 11:dayOfMonth = 30;break;
			case 12:dayOfMonth = 31;break;
		}
		
		return dayOfMonth;
		
	}
	
	/**
	 * ��ʽ�����ʱ���ʽ
	 * @author Thinkpad
	 * @param date ʱ��
	 * @param format ��ʽ
	 */
	function format(date , format){
		return date.Format(format);
	}
	
	function getDate(){
		
	}
	
	/**
	 * ʱ�����n����λ
	 * @param field yyyy,MM,dd HH,mm,ss
	 * @param n ��ӵ�λ
	 */
	function add(field,n){
		
	}
	
	function setTime(){
		d.setTime(new Date().valueOf()-365*24*60*60*1000);
	}
	
	/**
	 * ��ȡ��ȥ30��
	 */
	function getLast30Days(date,format){
		var tempDate = new Date();
		tempDate.setTime(date.valueOf() - 30*dayMils);
		var dateArr = [];
		for(var i = 0;i < 30 ;i++){
			dateArr.push(tempDate.format(format));
			tempDate.setTime(date.valueOf() + dayMils);
		}
		return dateArr;
	}
	
	/**
	 * ��ȡ��ȥ30��
	 */
	function getLast30DaysStr(){
		var dateArr = getLast30Days(date,format);
		var sb = new StringBuffer();
		for(var i = 0 ; i < dateArr.length ; i++ ){
			sb.append(dateArr[i]);
			if(i+1<dateArr.length){
				sb.append(",");
			}
		}
		return sb.toString();
	}
	
	
	/**
	 * ��ȡ��ȥ7��
	 */
	function getLast7Days(date,format){
		var tempDate = new Date();
		tempDate.setTime(date.valueOf() - 7*dayMils);
		var dateArr = [];
		for(var i = 0;i < 7 ;i++){
			dateArr.push(tempDate.format(format));
			tempDate.setTime(date.valueOf() + dayMils);
		}
		return dateArr;
	}
	
	/**
	 * ��ȡ��ȥ7���ַ��� ��ʽ��
	 */
	function getLast7DaysStr(date,format){
		var dateArr = getLast7Days(date,format);
		var sb = new StringBuffer();
		for(var i = 0 ; i < dateArr.length ; i++ ){
			sb.append(dateArr[i]);
			if(i+1<dateArr.length){
				sb.append(",");
			}
		}
		return sb.toString();
	}
	
	/**
	 * ��ȡ��ȥ24Сʱ
	 */
	function getLast24Hours(){
		
	}
	
};


function StringBuffer(){
    this._Strings = new Array();
}
StringBuffer.prototype = {
    append : function(str){
        this._Strings.push(str);
    },
    toString : function(){
        return this._Strings.join(",");
    }
}


