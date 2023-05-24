package week03;

        //[클래스를 만들기 위한 4가지 STEP]
        //1. 만들려고 하는 설계도를 선언 (클래스 선언)
        //2. 객체가 가지고 있어야할 속성 (필드)을 정의
        //3. 객체를 생성하는 방식을 정의 (생성자)
        //4. 객체가 가지고 있어야할 행위 (메서드)를 정의

public class Car {
    //필드영역
    //1)고유데이터 영역
    String company; //자동차 회사
    String model = "Gv80"; //자동차 모델
    String color; //자동차 색
    //2)상태데이터 영역
    double price; //자동차 가격
    double speed; //자동차 속도, km/h
    char gear; //기어상태(P,R,N,D)
    boolean lights = true; //자동차 조명의 상태
    //3)객체데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    //생성자 : 처음 객체가 생성될 때(instance 화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의
    public Car (){
        //기본생성자 : 생략가능
        System.out.println("생성자 호출! 객체가 생성됩니다.");

    }
    //메서드영역
    double gasPedal(double kmh, char type) {
        changeGear(type); //가속도 페달을 밟으면 자동으로 기어가 변한다
        speed = kmh;
        return speed;
    }
    double brakePedal(){
        speed = 0;
        return speed;
    }
    char changeGear(char type){
        gear = type;
        return gear;
    }
    boolean onOffLight(){
        lights = !lights;
        return lights;
    }
    void horn(){
        System.out.println("빵빵!");
    }
    void carSpeeds(double ... speeds){
        for (double v : speeds){
            System.out.println("v = " + v);
        }
    }
}
