package combatproject;

import java.util.Random;

public class Fight {

    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean approved;

    public void schedule(Fighter f1, Fighter f2){
        if (f1.getCategory() == f2.getCategory()) {
           this.approved = true;
           this.challenged = f1;
           this.challenger = f2;
        } else {
            this.approved = false;
            this.challenged = null;
            this.challenger = null;
        }
    }
    public void toFight() {
        if (this.approved) {
            System.out.println("### CHALLENGED ###");
            this.challenged.show();
            System.out.println("### CHALLENGER ###");
            this.challenger.show();

            Random random = new Random();
            int winner = random.nextInt(3);
            System.out.println("================ Result ================");
            switch (winner) {
                case 0:
                    System.out.println("TIED !!!");
                    this.challenged.tieFight();
                    this.challenger.tieFight();
                    break;

                case 1:
                    System.out.println("The Winner is " + this.challenged.getName());
                    this.challenged.winFight();
                    this.challenger.loseFight();
                    break;

                case 2:
                    System.out.println("The Winner is " + this.challenger.getName());
                    this.challenger.winFight();
                    this.challenged.loseFight();
                    break;
            }
            System.out.println("===========================================");

        } else {
            System.out.println("The fight can not be happen !!!");
        }

    }

    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
