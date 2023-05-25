public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }

    //Pythagorean theorem
    public int solver(int a, int b){
        return (int) Math.sqrt(add(times(a,a), times(b,b)));
    }
}
