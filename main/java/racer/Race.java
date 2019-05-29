package racer;

import java.util.ArrayList;
import java.util.List;

public class Race {
    public List<Runner> runners = new ArrayList<>();

    public void addRunner(Runner runner){
        runners.add(runner);
    }

    public Runner getWinner(){
        Runner first = runners.get(0);
        for (int i = 0; i < (runners.size() - 1); i++) {
            if(first.finishingTime > runners.get(i+1).finishingTime ){
                first = runners.get(i+1);
            }
       }
        return first;
    }
}
