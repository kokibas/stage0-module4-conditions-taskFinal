package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String season;
        switch (monthNumber){
            case 1 :
            case 2 :
            case 12 :
                season = "Winter";
                System.out.println(season);
                break;
            case 3 :
            case 4 :
            case 5 :
                season = "Spring";
                System.out.println(season);
                break;
            case 6 :
            case 7 :
            case 8 :
                season = "Summer";
                System.out.println(season);
                break;
            case 9 :
            case 10 :
            case 11 :
                season = "Autumn";
                System.out.println(season);
                break;
            default:
                System.out.println("Wrong month number");
        }
    }
}
