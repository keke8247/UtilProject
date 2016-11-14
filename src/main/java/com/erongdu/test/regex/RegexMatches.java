package com.erongdu.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *	@Description
 *	验证正则表达式
 *  @author wangdk,wangdk@erongdu.com
 *  @CreatTime 2016年11月8日 下午2:50:35
 *  @since version 1.0.0
 */
public class RegexMatches {
	public static void main( String args[] ){

	      // 按指定模式在字符串查找
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(\\D*)(\\d+)(.*)";
	      
	      String p1 = "^";
	      
	      // 创建 Pattern 对象
	      Pattern r = Pattern.compile(pattern);

	      // 现在创建 matcher 对象
	      Matcher m = r.matcher(line);
	      if (m.matches()) {
	    	  
	    	 System.out.println(m.groupCount());
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	         System.out.println("Found value: " + m.group(3) );
	      } else {
	         System.out.println("NO MATCH");
	      }
	   }
}
