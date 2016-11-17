public class Calculator{

    private int result;
    
    
    /**
        Summaring arguments
        @param params - Arguments of summaring
    */
    public void add(int ... params){
    
        for (int param : params){
            this.result = this.result+param;
        }
    }


    public int getResult(){
        return this.result;
    }
    
    public void cleanResult(){
        this.result = 0;
    }
}