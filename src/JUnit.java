import java.util.ArrayList;
public class JUnit {
    //Q1 METHOD
    public boolean multiple(int num){
        if (num % 5 == 0 || num % 3 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    //Q2 METHOD
    public int checkLargest(int num1, int num2, int num3){
        int largest = num1;
        if (num2 > largest){
            largest = num2;
        }
        if (num3 > largest){
            largest = num3;
        }
        return largest;
    }
}
