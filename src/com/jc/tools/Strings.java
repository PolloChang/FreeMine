package com.jc.tools;

import java.util.LinkedHashMap;
import java.util.Arrays;

/**
 * File Description/檔案描述: 字串常用工具
 *
 * @author JamesChang
 * @version 1.0
 * @since 2020/6/9下午 03:56
 **/
public class Strings {

    /**
     * 英文字母小寫
     */
    public final static String[] englishLower = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    /**
     * 英文字母大寫
     */
    public final static String[] englishUpper = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    /**
     * 中文數字(小寫)
     * <Long, String>
     */
    public final static LinkedHashMap<Long, String> chineseNumberLowerL  = new LinkedHashMap<Long, String>(){{
        put(0L,"〇");put(1L,"一");put(2L,"二");put(3L,"三");put(4L,"四");put(5L,"五");
        put(6L,"六");put(7L,"七");put(8L,"八");put(9L,"九");put(10L,"十");put(20L,"廿");
        put(30L,"卅");put(40L,"卌");put(100L,"百");put(200L,"皕");put(1000L,"千");put(10000L,"萬");
        put(100000000L,"億");put(1000000000000L,"兆");put(10000000000000000L,"京");
    }};

    /**
     * 中文數字(小寫)
     * <Integer, String>
     */
    public final static LinkedHashMap<Integer, String> chineseNumberLower  = new LinkedHashMap<Integer, String>(){{
        put(0,"〇");put(1,"一");put(2,"二");put(3,"三");put(4,"四");put(5,"五");
        put(6,"六");put(7,"七");put(8,"八");put(9,"九");put(10,"十");put(20,"廿");
        put(30,"卅");put(40,"卌");put(100,"百");put(200,"皕");put(1000,"千");put(10000,"萬");
        put(100000000,"億");
    }};

    /**
     * 中文數字(大寫)
     * <Long, String>
     */
    public final static LinkedHashMap<Long, String> chineseNumberUpperL  = new LinkedHashMap<Long, String>(){{
        put(0L,"零");put(1L,"壹");put(2L,"貳");put(3L,"參");put(4L,"肆");put(5L,"伍");
        put(6L,"陸");put(7L,"柒");put(8L,"捌");put(9L,"玖");put(10L,"拾");put(20L,"念");
        put(30L,"參拾");put(40L,"肆拾");put(100L,"佰");put(200L,"貳佰");put(1000L,"仟");put(10000L,"萬");
        put(100000000L,"億");put(1000000000000L,"兆");put(10000000000000000L,"京");
    }};

    /**
     * 中文數字(大寫)
     * <Integer, String>
     */
    public final static LinkedHashMap<Integer, String> chineseNumberUpper  = new LinkedHashMap<Integer, String>(){{
        put(0,"零");put(1,"壹");put(2,"貳");put(3,"參");put(4,"肆");put(5,"伍");
        put(6,"陸");put(7,"柒");put(8,"捌");put(9,"玖");put(10,"拾");put(20,"念");
        put(30,"參拾");put(40,"肆拾");put(100,"佰");put(200,"貳佰");put(1000,"仟");put(10000,"萬");
        put(100000000,"億");
    }};

    /**
     * 羅馬數字轉換
     * <Integer, String>
     */
    public final static LinkedHashMap<Integer, String> RomanNumerals = new LinkedHashMap<Integer, String>(){{
        put(1,"I");
        put(2,"II");
        put(3,"III");
        put(4,"IV");
        put(5,"V");
        put(6,"VI");
        put(7,"VII");
        put(8,"VIII");
        put(9,"IX");
        put(10,"X");
        put(11,"XI");
        put(12,"XII");
        put(13,"XIII");
        put(14,"XIV");
        put(15,"XV");
        put(16,"XVI");
        put(17,"XVII");
        put(18,"XVIII");
        put(19,"XIX");
        put(20,"XX");
        put(30,"XXX");
        put(40,"XL");
        put(50,"L");
        put(60,"LX");
        put(70,"LXX");
        put(80,"LXXX");
        put(90,"XC");
        put(99,"XCIX");
        put(100,"C");
        put(101,"CI");
        put(102,"CII");
        put(199,"CXCIX");
        put(200,"CC");
        put(300,"CCC");
        put(400,"CD");
        put(500,"D");
        put(600,"DC");
        put(700,"DCC");
        put(800,"DCCC");
        put(900,"CM");
        put(1000,"M");
        put(1400,"MCD");
        put(1437,"MCDXXXVII");
        put(1500,"MD");
        put(1800,"MDCCC");
        put(1900,"MCM");
        put(2000,"MM");
        put(3000,"MMM");
        put(3333,"MMMCCCXXXIII");
        put(4000,"MV");
        put(5000,"V");
        put(10000,"X");
        put(50000,"L");
        put(100000,"C");
        put(500000,"D");
        put(1000000,"M");
    }};

    /**
     * 身分證字號與居留證(統一證)編號檢核程式碼
     * @param str
     * @return 正確 true
     */
    public boolean isValidIDorROCNumber(String str) {

        boolean returnValue = false;

        if (str == null || "".equals(str)) {
            returnValue =  false;
        }

        final char[] pidCharArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

        // 原身分證英文字應轉換為10~33，這裡直接作個位數*9+10
        final int[] pidIDInt = { 1, 10, 19, 28, 37, 46, 55, 64, 39, 73, 82, 2, 11, 20, 48, 29, 38, 47, 56, 65, 74, 83, 21, 3, 12, 30 };

        // 原居留證第一碼英文字應轉換為10~33，十位數*1，個位數*9，這裡直接作[(十位數*1) mod 10] + [(個位數*9) mod 10]
        final int[] pidResidentFirstInt = { 1, 10, 9, 8, 7, 6, 5, 4, 9, 3, 2, 2, 11, 10, 8, 9, 8, 7, 6, 5, 4, 3, 11, 3, 12, 10 };

        // 原居留證第二碼英文字應轉換為10~33，並僅取個位數*6，這裡直接取[(個位數*6) mod 10]
        final int[] pidResidentSecondInt = {0, 8, 6, 4, 2, 0, 8, 6, 2, 4, 2, 0, 8, 6, 0, 4, 2, 0, 8, 6, 4, 2, 6, 0, 8, 4};

        str = str.toUpperCase();// 轉換大寫
        final char[] strArr = str.toCharArray();// 字串轉成char陣列
        int verifyNum = 0;

        /* 檢查身分證字號 */
        if (str.matches("[A-Z]{1}[1-2]{1}[0-9]{8}")) {
            // 第一碼
            verifyNum = verifyNum + pidIDInt[Arrays.binarySearch(pidCharArray, strArr[0])];
            // 第二~九碼
            for (int i = 1, j = 8; i < 9; i++, j--) {
                verifyNum += Character.digit(strArr[i], 10) * j;
            }
            // 檢查碼
            verifyNum = (10 - (verifyNum % 10)) % 10;

            returnValue = verifyNum == Character.digit(strArr[9], 10);
        }

        /* 檢查統一證(居留證)編號 */
        verifyNum = 0;
        if (str.matches("[A-Z]{1}[A-D]{1}[0-9]{8}")) {
            // 第一碼
            verifyNum += pidResidentFirstInt[Arrays.binarySearch(pidCharArray, strArr[0])];
            // 第二碼
            verifyNum += pidResidentSecondInt[Arrays.binarySearch(pidCharArray, strArr[1])];
            // 第三~八碼
            for (int i = 2, j = 7; i < 9; i++, j--) {
                verifyNum += Character.digit(strArr[i], 10) * j;
            }
            // 檢查碼
            verifyNum = (10 - (verifyNum % 10)) % 10;

            returnValue =  verifyNum == Character.digit(strArr[9], 10);
        }

        return returnValue;
    }
}
