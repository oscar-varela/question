public class Question{
    
    private String answer;
    private String text;
    
    public void setText(String questionTest){
        text = questionTest;
    }
    
    public void setAnswer(String correctResponse){
        answer = correctResponse;
    }
    
    public boolean checkAnswer(String response){
        if(this.answer.equals(response)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void display(){
        System.out.println(text);
    }
}