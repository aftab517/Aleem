package practice;

public class Argue {
    public void Add(int a, int b, int c)
    {
        int d = a + b + c;
        System.out.println("Addition of a + b+ c = " +d);

    }

    public static void main(String[] args) {
        Argue Calc = new Argue();
        Calc.Add(11, 10, 20);
    }
}
