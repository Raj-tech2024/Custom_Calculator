class InvalidInputException extends Exception{

    public String toString(){
 return "can not add 8 and 9";
     }
     public String getMessage(){
        return "i am getString";
     }
}
class CanNotDivideByZeroException extends Exception{

    public String toString(){
        return "can not divide by zero";
    }
    public String getMessage(){
        return "i am getString";
    }
}

class MaxInputException extends Exception{

    public String toString(){
        return "if any of input greater then 10000";
    }
    public String getMessage(){
        return "i am getString";
    }
}
class MaxMultiplyException extends Exception{

    public String toString(){
        return "Total multiply 7000";
    }
    public String getMessage(){
        return "i am getString";
    }
}
class Custom_Calculator   {
    double add(double a,double b) throws InvalidInputException, MaxInputException {
       if(a>10000||b>1000){
           throw new MaxInputException();
       }
        if(a==8||b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }

    double subtract(double a,double b) throws MaxInputException{
             if(a>10000||b>1000){
        throw new MaxInputException();
    }

        return a-b;
    }
    double multiply(double a,double b) throws MaxInputException,MaxMultiplyException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }
        else if (a>7000 || b>7000) {
            throw new MaxMultiplyException();
        }
        return a*b;
    }
    double divide(double a,double b) throws CanNotDivideByZeroException,MaxInputException {
        if(a>10000||b>1000){
            throw new MaxInputException();
        }
        if (b==0){
            throw  new CanNotDivideByZeroException();
        }
        return a/b;
    }

}

public class Main {
    public static void main(String[] args) throws InvalidInputException, CanNotDivideByZeroException, MaxInputException,MaxMultiplyException  {
        Custom_Calculator c = new Custom_Calculator();
       // c.add(8,9);
      //c.divide(5,0);
     // c.add(600000,10000);
       c.multiply(1,7001);
    }
}
