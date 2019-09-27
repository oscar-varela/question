import java.util.LinkedList;

public class ChoiseQuestion extends Question
{
   private LinkedList<String> choises;
    public ChoiseQuestion()
    {
     choises = new LinkedList<>();
    }
    
    public void addChoise(String choise , boolean correct)
    {   this.choises.add(choise);
        if(correct)
        {
            super.setAnswer(String.valueOf(choises.size()));
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
