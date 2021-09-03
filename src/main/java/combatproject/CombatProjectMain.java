package combatproject;

public class CombatProjectMain {
    public static void main(String[] args){

        Fighter f[] = new Fighter[4];

        f[0] = new Fighter("Goku", "USA", 31, 70.9f, 1.92f, 11, 2, 1);
        f[1] = new Fighter("Naruto", "Fukuoka - JP",29, 77.5f, 1.77f, 20, 2, 3);
        f[2] = new Fighter("Inu Yasha", "Kyoto - JP", 300, 80.3f, 1.81f, 100, 30, 50);
        f[3] = new Fighter("Ichigo", "Brazil", 21, 81.5f, 1.97f, 15, 20, 5);

        Fight CMBProject = new Fight();
        CMBProject.schedule(f[0], f[1]);
        CMBProject.toFight();
        f[0].status();
        f[1].status();

    }
}
