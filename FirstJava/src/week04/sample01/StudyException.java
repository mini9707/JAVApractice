package week04.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();
//        ourClass.thisMethodIsDangerous(); 에러발생!

        //try(시도) ~ catch(잡다) ~ finally(마침내)
        //위험한 메소드를 그냥 호출하면 에러가 나기 때문에 감싸줘야한다.
        //일단 try해~~ 그리고, 예외가 발생하면 그걸 catch(잡아)해
        //그리고 정상적으로 수행되든, 예외가 발생하든 마침내 수행돼야 하는 로직은 finally 수행해
        try {
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            //무조건 여기는 거친다
            System.out.println("우리는 방금 예외를 핸들링 했습니다. 정상처리되든, 예외사항이 발생하든 여기를 거쳐요");
        }


    }
}
