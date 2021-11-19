public interface Chain{
    public void setNextChain(Chain nextChain);
    public int calc(Equation request);
}