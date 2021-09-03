package combatproject;

public class Fighter {

    private String name;
    private String nationality;
    private int age;
    private float weight;
    private float height;
    private String category;
    private int victories, defeats, tie;

    public void show() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("IT'S SHOW TIME !!! The fighter is " + this.getName());
        System.out.println("");
        System.out.println("He is from " + this.getNationality());
        System.out.println("With " + this.getAge() + "years old " + getHeight());
        System.out.println("His weight is " + this.getWeight() + "Kg");
        System.out.println(this.getVictories() + " ### Victories ###");
        System.out.println(this.getDefeats() + " Defeats");
        System.out.println(this.getTie() + "Tie !!!");

    }

    public void status() {
        System.out.println(this.getName() + " is weight " + this.getCategory());
        System.out.println("Won " + this.getVictories());
        System.out.println("Lose " + this.getDefeats());
        System.out.println("It's tie " + this.getTie());

    }

    public void winFight() {
        this.setVictories(this.getVictories() + 1);

    }

    public void loseFight() {
        this.setDefeats(this.getDefeats() + 1);

    }

    public void tieFight() {
        this.setTie(this.getTie() + 1);

    }

    public Fighter(String name, String nationality, int age, float weight, float height, int victories, int defeats, int tie) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.setWeight(weight);
        this.height = height;
        this.victories = victories;
        this.defeats = defeats;
        this.tie = tie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if (this.weight < 52.2) {
            this.category = "Invalid";
        } else if (this.weight <= 70.3) {
            this.category = "Light";
        } else if (this.weight <= 83.9) {
            this.category = "Medium";
        } else if (this.weight <= 120.2) {
            this.category = "Heavy";
        } else {
            this.category = "Invalid";
    }

}

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getTie() {
        return tie;
    }

    public void setTie(int tie) {
        this.tie = tie;
    }
}
