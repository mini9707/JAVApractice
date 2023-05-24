package week03.sample;

public class Main {
    final static String COMPANY = "genesis";
    //상수는 통상적으로 스펠링을 모두 대문자로 작성

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
        //지역변수는 return 까지 수행후 소멸하기 때문에 첫번째와 두번째 println 결과값이 같다.

    }

    public int getNumber() {
        //[지역변수] <-> [전역변수]
        //해당 메서드가 실행될 때 마다 독립적인 값 저장, 관리
        //지역변수는 메서드 내부에서 정의될 때 생성
        //메서드가 종료될 때 소멸
        int number = 1;
        number += 1;
        return number;
    }

}
