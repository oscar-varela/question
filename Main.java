import java.util.Scanner;

public class Main{
    
    public static void main(String args[]){
        
         Question q = new Question();
        ChoiseQuestion choiseQuestion = new ChoiseQuestion();
        
        q.setText("Quien fue el creador de java?");
        q.setAnswer("James");
        
        choiseQuestion.setText("what was the oeriginal name?");
        choiseQuestion.addChoise("*7",false);
        choiseQuestion.addChoise("Duke",false);
        choiseQuestion.addChoise("Oak",true);
        choiseQuestion.addChoise("Gosling",false);
        
        showQuestion(q);
        
        showQuestion(choiseQuestion);
    }
    
    public static void showQuestion(Question q)
    {  Scanner input = new Scanner(System.in);
        
        q.display();
        System.out.println("Your answer: ");
        String response = input.nextLine();
        System.out.println(q.checkAnswer(response));}
}