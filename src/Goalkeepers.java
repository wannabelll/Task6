public class Goalkeepers implements StartedList{
    private String name;
    private int height;
    private PlayerConditions conditions;
    private boolean isRedCard = true;
    private int safeStat; // in % how many balls gk reflected
    Goalkeepers(String name, int height, PlayerConditions conditions, int safeStat , boolean card ){
this.name=name;
this.height=height;
this.conditions = conditions;
this.safeStat=safeStat;
this.isRedCard=card;

    }

    @Override
    public void showPlayerDetails() {
if(!isRedCard){
    System.out.println("Name: "
            +this.name+",   His height is: "
            +this.height+",     His physical and emotional state: "
            +this.conditions+",     Cleansheats percentage is: "
            +this.safeStat);

}
else System.out.println("We are injured. Select the gk from the 2nd squad. ");

    }


}
