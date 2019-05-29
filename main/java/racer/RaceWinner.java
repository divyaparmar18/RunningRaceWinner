package racer;

public class RaceWinner {
    public static void main(String[] args) {
        Race race = new Race();
        Runner danny = new Runner("danny",5.20);
        Runner divya = new Runner("divya",4.10);
        Runner zoyaa = new Runner("zoyaa",4.10);
        race.addRunner(danny);
        race.addRunner(divya);
        race.addRunner(zoyaa);
        System.out.println(race.getWinner().name);
    }
}
