public class hockey {
    private String name;
    private int jerseyNumber;
    private String hand;
    private String shoot;

    private int goals;
    private int assists;
    private int games;

    public void person (String n, int jn, String lr, String st) {
        name = n;
        jerseyNumber = jn;
        hand = lr;
        shoot = st;
    }

    public void completeGame (int g, int a, int game) {
        goals = goals+g;
        assists = a + assists;
        games = games + game;
    }

     public int points() {
        return goals+assists;
     }

}
