package com.erongdu.test.md5;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class HexTest {
	public static void main(String[] args) throws DecoderException {
    	String srcStr = "待转换字符串";  
        String encodeStr = Hex.encodeHexString(srcStr.getBytes());  
        String decodeStr = new String(Hex.decodeHex(encodeStr.toCharArray()));  
        System.out.println("转换前：" + srcStr);  
        System.out.println("转换后：" + encodeStr);  
        System.out.println("还原后：" + decodeStr);  
	}
}
