import java.util.HashMap;

public class Test{
    public static void main(String[] args){
        Chain chain1 = new AddStatement();
        Chain chain2 = new SubStatement();
        Chain chain3 = new MulStatement();
        Chain chain4 = new DivStatement();
        Chain chain5 = new ModStatement();
        Chain chain6 = new PowStatement();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
        chain4.setNextChain(chain5);
        chain5.setNextChain(chain6);
        
        Equation request = new Equation(4, 2, "*");
        chain1.calc(request);
        request = new Equation(4, 2, "+");
        chain1.calc(request);
        request = new Equation(4, 2, "%");
        chain1.calc(request);
        request = new Equation(4, 2, "/");
        chain1.calc(request);
        request = new Equation(4, 2, "-");
        chain1.calc(request);
        request = new Equation(4, 2, "^");
        chain1.calc(request);
        /*
        chain1.calc(new Equation(chain1.calc(request),chain1.calc(new Equation(9,8,"-")),"+"));
    
        
        

        String problem = "8 + 8 * 7 / 2"; 
        HashMap<String,Integer> operators = new HashMap<String,Integer>();
        operators.put("^",2);
        operators.put("*",1);
        operators.put("/",1);
        operators.put("+",0);
        operators.put("-",0);
        
        String[] splitProblem = problem.split(" "); 
        for(int i=0; i<splitProblem.length; i++){
            System.out.print(splitProblem[i]);
        }System.out.println("\n");
        while(splitProblem.length > 1){
            
            int greatestOp =-1;
            int greatestPlace =1;
            int tmp=1;
            for(int i=1; i< splitProblem.length-1; i+=2){
                    if(operators.get(splitProblem[i]) > greatestOp){
                        greatestPlace = i;
                        greatestOp = operators.get(splitProblem[i]); 
                    }  
            }
            String[] buffer = new String[splitProblem.length-2];
            tmp =0;
            for(int i=1; i<splitProblem.length-1; i+=2){
                try{
                if(i != greatestPlace){
                    if(!(i == greatestPlace + 2)){
                        buffer[tmp++] =splitProblem[i-1];
                    }
                    buffer[tmp++] =splitProblem[i];
                    if(!(i == greatestPlace - 2)){
                        buffer[tmp++] =splitProblem[i+1];
                    }
                }else{
                    request = new Equation(Integer.parseInt(splitProblem[greatestPlace-1]),Integer.parseInt(splitProblem[greatestPlace+1]),(String)splitProblem[greatestPlace]);
                    buffer[tmp++] = String.valueOf(chain1.calc(request));
                }
                }catch(Exception e){}
            }
            splitProblem = buffer;
        }
        
       */
    }
}