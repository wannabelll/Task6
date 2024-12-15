public class MIdfielder implements StartedList{

    private String name;
    private int height;
    private PlayerConditions conditions;
    private boolean isRedCard = true;

    private int passesStat;

    MIdfielder(String name, int height, PlayerConditions conditions, int passesStat, boolean card ){
        this.name=name;
        this.height=height;
        this.conditions = conditions;
        this.passesStat=passesStat;
        this.isRedCard=card;

    }
    @Override
    public void showPlayerDetails() {
        if(!isRedCard){
            System.out.println("Name: "
                    +this.name+",   His height is: "
                    +this.height+",     His physical and emotional state: "
                    +this.conditions+",     Accurate passes percentage is: "
                    +this.passesStat
                    +"%");

        }
        else System.out.println("It will be the hardest game we have ever played.. ");

    }
}
