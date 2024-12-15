public class Main {
    public static void main(String[] args) {
        System.out.println("Our dream team\n");

        CoachsDesicion coach = new CoachsDesicion();

// we can create objects from either Started class or specifical like Goalkeepears etc
    StartedList gk = new Goalkeepers("Viktor", 190, PlayerConditions.Perfect, 90, false);
        StartedList defender1 = new Defenders("Volodymr", 187, PlayerConditions.Notbad, 91, false);
        Defenders defender2 = new Defenders("Anton", 185, PlayerConditions.Notbad, 90, false);
        StartedList midfielder1= new MIdfielder("Mykola", 180, PlayerConditions.Notbad, 83, false);
        StartedList midfielder2= new MIdfielder("Yaroslav", 180, PlayerConditions.setHisOnTheBench, 89, false);
        StartedList forward1 = new Forwards("Yuriy", 176, PlayerConditions.Perfect, 10, false);

coach.addPlayer(gk);
coach.addPlayer(defender1);
coach.addPlayer(defender2);
coach.addPlayer(midfielder1);
coach.addPlayer(midfielder2);
coach.addPlayer(forward1);

        coach.showPlayerDetails();

        /// checking deleting method, was 6 players and should be 5 after

        System.out.println("\n");

        coach.removePlayer(midfielder2); // put him on the bench

        coach.showPlayerDetails();

    }
}








/*

    List<StartedList> startedSquad = new ArrayList<>();
    CoachsDesicion coach = new CoachsDesicion();
        for(StartedList player : startedSquad){
                startedSquad.add(gk);
                startedSquad.add(defender1);
                startedSquad.add(defender2);
                startedSquad.add(midfielder1);
                startedSquad.add(midfielder2);
                startedSquad.add(forward1);
                }


                for (StartedList chosen: startedSquad ){

                System.out.println(chosen);


                }*/
