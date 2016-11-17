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


     /**
        Multiplaying arguments
        @param params - Arguments for mult
    */
    public void mult(int ... params){
        
        this.result = params[0];
        
        this.result = this.result==0?1:this.result;
        
        for (int i = 1;i<params.length;i++){
            this.result *=params[i];
        }
    }

    
     /**
        div arguments
        @param params - Arguments fo division
    */
    public void div(int ... params){
        
        this.result = params[0];
        
        for (int i = 1;i<params.length;i++){
            if (params[i] == 0){
                System.out.println("division by zero. Next step;");
            }
            else{
                this.result /=params[i];    
            }
        }
    }

    
     /**
        subtract arguments
        @param params - Arguments for subtract
    */
    public void sub(int ... params){
    
        for (int param : params){
            this.result -=param;
        }
    }

    
    
    public int getResult(){
        return this.result;
    }
    
    public void cleanResult(){
        this.result = 0;
    }
}