package practice;

public class SubClass extends SuperClass {

        public void mul(int a,int b)
        {
            int c=a*b;
            System.out.println("multiplication value="+c);
        }
        public static void main(String[] args) {
            SubClass operation=new SubClass();
            operation.add(5,4);
            operation.sub(6,3);
            operation.mul(4,5);
        }
}
