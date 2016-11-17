import java.util.Scanner;

/**
    Class designed for start calculator. Supports input from user. 
*/

public class InterraptRunner{

    public static void main(String[] args){
    
        Scanner reader = new Scanner(System.in);
        
        try{
            Calculator  calc = new Calculator();
            String operation = "0";
            while(!operation.equals("5")){
                
                printMenu();
                
                operation = reader.next();
                
                System.out.println("Input first agument");
                String firstArg = reader.next();
                System.out.println("Input second agument");
                String secondArg = reader.next();
                
                doOperation(calc,operation,Integer.parseInt(firstArg),Integer.parseInt(secondArg));
                
                System.out.println("Result: "+calc.getResult());
                
                calc.cleanResult();
                
                System.out.println("Press any key...");
                
                reader.next();
            
            }
        }catch(Exception e){   
            System.out.println(e);    
        }finally{reader.close();
                 System.out.println("Bay");}
    
    }
    
    
    private static void printMenu(){
        
        System.out.println("Enter operation:");
        System.out.println("1. add");
        System.out.println("2. mult");
        System.out.println("3. sub");
        System.out.println("4. div");
        System.out.println("5. exit");            
    }
    
    private static void doOperation(Calculator calc,String operation,int firstArg,int secondArg){
        
        int presentRes = calc.getResult();

        
        System.out.println(""+presentRes+"   "+firstArg+"   "+secondArg);  
        
        if(operation.equals("1")){
            calc.add(presentRes,0);
            presentRes = calc.getResult();  
            calc.add(firstArg,secondArg);
        } else if(operation.equals("2")){
            calc.mult(presentRes,1);
            presentRes = calc.getResult();   
            calc.mult(firstArg,secondArg);
        } else if(operation.equals("3")){
            calc.sub(firstArg,0);
            presentRes = calc.getResult();   
            calc.sub(firstArg,secondArg);
        } else if(operation.equals("4")){
            calc.div(firstArg,1);
            presentRes = calc.getResult();   
            calc.div(firstArg,secondArg);
        }
    }


}