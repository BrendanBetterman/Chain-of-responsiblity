public class Equation{
    private int num1;
    private int num2;
    private String expression;

    public Equation(int newNum1, int newNum2, String express){
        this.num1 = newNum1;
        this.num2 = newNum2;
        this.expression = express;
    }
    public int getNum1(){return num1;}
    public int getNum2(){return num2;}
    public String getExpress(){return expression;}
}