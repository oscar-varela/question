import java.util.LinkedList;

public class ChoiseQuestion extends Question
{
   private int choiseNumer;
   private LinkedList<String> choises;
    public ChoiseQuestion()
    {
     choiseNumer = 0;
     choises = new LinkedList<>();
    }
    
    public void addChoise(String choise , boolean correct)
    {   this.choises.add(choise);
        choiseNumer++;
        if(correct)
        {
            super.setAnswer(String.valueOf(choiseNumer));
        }
    }
    
    public void display()
    {   
        super.display();
        int counter = 1;
        System.out.println("Dysplaying choices... ");
        for(String choise : this.choises)
        {
            System.out.println(counter++ + ")" +choise);
            
        }
    }
}
