public class Defenders implements StartedList{
    private String name;
    private int height;
    private PlayerConditions conditions;
    private boolean isRedCard = true;

    private int interceptionsStat;

    Defenders(String name, int height, PlayerConditions conditions, int interceptionsStat, boolean card ){
        this.name=name;
        this.height=height;
        this.conditions = conditions;
        this.interceptionsStat=interceptionsStat;
        this.isRedCard=card;

    }
    @Override
    public void showPlayerDetails() {
        if(!isRedCard){
            System.out.println("Name: "
                    +this.name+",   His height is: "
                    +this.height+",      His physical and emotional state: "
                    +this.conditions+",     Ball's interception percentage is: "
                    +this.interceptionsStat
                    +"%");

        }
        else System.out.println("We will lose... Our defensive is so bad ");

    }
}
