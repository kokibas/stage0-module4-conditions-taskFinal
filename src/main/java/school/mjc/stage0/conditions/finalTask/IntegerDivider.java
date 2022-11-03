package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = dividend / divider;
        int result1 = result * divider;
        if  ( result1 == dividend ){
            System.out.println("can be divided completely");
        }else if (result1 == 0){
            System.out.println("division by zero");
        }
        else {
            System.out.println("cannot be divided completely");
        }
    }
}
