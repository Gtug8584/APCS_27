import java.util.*;

public class StepTracker{

    private int actday;
    private int totalstep;
    private int days;


public StepTracker(){
    totalstep=0;
    actday=0;
    days=0;
    
}

    public int addDailySteps(int a){
        totalstep=totalstep+a;
        days=days+1;
        activeDays();
    }
    public int activeDays(){
        if(totalstep/days>=10000){
        actday= actday+1;
        return actday;
        }
        else{
            return actday;
        }
    }
    public int averageSteps(){
        return (totalstep/days);
    }



}