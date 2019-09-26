import java.util.Scanner;

public class Main{
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Question q = new Question();
        q.setText("Quien fue el creador de java?");
        q.setAnswer("James");
        
        q.display();
        System.out.println("Your answer: ");
        String response = input.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}