import java.util.Scanner;

public class Main{
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        ChoiseQuestion choiseQuestion = new ChoiseQuestion();
       
        choiseQuestion.setText("what was the oeriginal name?");
        choiseQuestion.addChoise("*7",false);
        choiseQuestion.addChoise("Duke",false);
        choiseQuestion.addChoise("Oak",true);
        choiseQuestion.addChoise("Gosling",false);
        
        choiseQuestion.display();
        System.out.println("Your answer: ");
        String response = input.nextLine();
        System.out.println(choiseQuestion.checkAnswer(response));
    }
}