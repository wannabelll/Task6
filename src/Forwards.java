public class Forwards implements StartedList{
    private String name;
    private int height;
    private PlayerConditions conditions;
    private boolean isRedCard = true;

    private int goalsStat;

    Forwards(String name, int height, PlayerConditions conditions, int goalsStat, boolean card ){
        this.name=name;
        this.height=height;
        this.conditions = conditions;
        this.goalsStat=goalsStat;
        this.isRedCard=card;

    }
    @Override
    public void showPlayerDetails() {
        if(!isRedCard){
            System.out.println("Name: "
                    +this.name+",    His height is: "
                    +this.height+",     His physical and emotional state: "
                    +this.conditions+",     Goals scored this season: "
                    +this.goalsStat);

        }
        else System.out.println("It will be rationally to choose defensive tactics.. ");

    }
}
