import java.util.Scanner;

/**
    Class designed for start calculator. Supports input from user. 
*/

public class InterraptRunner{

    public static void main(String[] args){
    
        Scanner reader = new Scanner(System.in);
        
        try{
            Calculator  calc = new Calculator();
            String exit = "no";
            while(!exit.equals("yes")){
                System.out.println("Input first agument");
                String first = reader.next();
                System.out.println("Input second agument");
                String second = reader.next();
                calc.add(Integer.valueOf(first),Integer.parseInt(second));
                System.out.println("Result: "+calc.getResult());
                calc.cleanResult();
                System.out.println("Exit yes/no");
                exit = reader.next();       
            }
        }catch(Exception e){   
            System.out.println(e);    
        }finally{reader.close();
                 System.out.println("Bay");}
    
    }


}