import java.lang.Math;
public class PowStatement implements Chain{
    private Chain nextInChain;
    public void setNextChain(Chain nextChain){
        this.nextInChain = nextChain;
    }
    public int calc(Equation request){
        if(request.getExpress().equals("^")){
            System.out.println(request.getNum1() + "^" + request.getNum2() +"="+ (int)(Math.pow(request.getNum1(),request.getNum2())));
            return (int)(Math.pow(request.getNum1(),request.getNum2()));
        }else{
            try{
                return nextInChain.calc(request);
            }catch(Exception e){
                System.out.println("Out of Links");
                return 0;
            }
        }
    }
}