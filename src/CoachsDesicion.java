import java.util.ArrayList;
import java.util.List;

public class CoachsDesicion implements StartedList{
    static int countOfPlayers=0;
    private List<StartedList> startedLists = new ArrayList<>();

    @Override
    public void showPlayerDetails() {
        for(StartedList player : startedLists){
            player.showPlayerDetails();
        }

    }
    public void addPlayer(StartedList player)
    {
        startedLists.add(player);
        countOfPlayers++;
    }

    public void removePlayer(StartedList player)
    {
     startedLists.remove(player);
    }


}
