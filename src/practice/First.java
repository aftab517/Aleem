package practice;

public class First {

    int a = 60, b = 80, c;

    public void AddCalc(){
        c = a + b;
        System.out.println(c); //Addition
    }
    public void SubCalc(){
        c = a - b;
        System.out.println(c);// Substraction
    }
    public void MulCalc(){
        c = a * b;
        System.out.println(c); // Multiplication
    }
    public void DivCalc(){

        c = a / b;
        System.out.println(c); //Division
    }

    public static void main(String[] args) {
        First Calc = new First();

        Calc.AddCalc();
        Calc.SubCalc();
        Calc.MulCalc();
        Calc.DivCalc();


        }
    }


