package practice;

public class ReturnValues {

    public int add(int a, int b)
    {
        int c = a + b;
        return c;

    }

    public static void main(String[] args) {
        ReturnValues Reobj = new ReturnValues();
        int result = Reobj.add(10,20);
        System.out.println(result);


    }
}
