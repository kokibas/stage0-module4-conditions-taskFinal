package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year % 4 == 0) {
            switch (month) {
                case 2:
                    month = 29;
                    System.out.println(month);
                    break;
                case 4:
                case 06 :
                case 9 :
                case 11 :
                    month = 30;
                    System.out.println(month);
                    break;
                case 1 :
                case 3 :
                case 5 :
                case 7 :
                case 8 :
                case 10 :
                case 12 :
                    month = 31;
                    System.out.println(month);
                    break;
                default:
                    System.out.println("invalid date");
            }
        } else if (year % 400 != 0) {
            System.out.println("invalid date");
        }else if (year % 100 != 0){
            switch (month) {
                case 2:
                    month = 28;
                    System.out.println(month);
                    break;
                case 4:
                case 6 :
                case 9 :
                case 11 :
                    month = 30;
                    System.out.println(month);
                    break;
                case 1 :
                case 3 :
                case 5 :
                case 7 :
                case 8 :
                case 10 :
                case 12 :
                    month = 31;
                    System.out.println(month);
                    break;
                default:
                    System.out.println("invalid date");
            }
        }else {
            System.out.println("invalid date");
        }
    }
}
