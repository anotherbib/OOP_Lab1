import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What to draw?");
        int inputshape = sc.nextInt();
        
        FootShape fs = new FootShape();
        Foot foot = new Foot(fs); 
        System.out.println(foot.draw(inputshape));
        sc.close();
    }
}
