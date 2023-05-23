package week02.array;

public class Arr04 {
    public static void main(String[] args) {
        // [기본형 변수 vs 참조형 변수]
        // 1. 기본형 변수는 소문자로 시작, 참조형 변수는 대문자로 시작
        //      - Wrapper class 에서 기본형 변수를 감싸줄 때 (boxing), int -> Integer
        // 2. 기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 지정(= 주소형 변수)

        //String 기능활용
        String str = "ABCD";

        //(1) length
        int strLength = str.length();
        System.out.println(strLength);

        //(2) charAt(int index)
        char strChar = str.charAt(2);
        System.out.println(strChar);

        //(3) substring(int fromIdx, int toIdx)
        String strSub = str.substring(0,2);
        System.out.println(strSub);

        //(4) equals(String str)
        String newStr = "ABCe";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        //(5) toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();

        //(6) char[] -> String -> char
        char[] charArray = {'a', 'b', 'c'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);
    }
}
