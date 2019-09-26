public class ChoiseQuestion extends Question
{
   private int choiseNumer;
    public ChoiseQuestion()
    {
     choiseNumer = 0;
    }
    
    public void addChoise(String choise , boolean correct)
    {   choiseNumer++;
        if(correct)
        {super.setAnswer(String.valueOf(choiseNumer));
        }
    }
}
