import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("평점을 입력해주세요 : ");
        float rate = sc.nextFloat();
        ArrayList<String> recipeList = new ArrayList<String>();

        while (true) {
            System.out.println("레시피를 입력하세요(작성완료 시 '끝'이라고 입력) : ");
            String recipe = sc.nextLine();
            if(Objects.equals(recipe, "끝")){
                break;
            }
            recipeList.add(recipe);
        }
        System.out.println("["+title+"]");
        int intRate = (int)rate;
        double percentageRate = intRate * 100 / 5.0;
        System.out.println("평점 : " + percentageRate);
        for (int i=0; i<recipeList.size();i++){
            System.out.println(recipeList.get(i));
        }

    }
}

