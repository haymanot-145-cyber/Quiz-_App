public class User {
    private String username;
    private int totalScore;
    private int gamesPlayed;
    
    public User(String username) {
        this.username = username;
        this.totalScore = 0;
        this.gamesPlayed = 0;
    }
    
    public void addScore(int score) {
        this.totalScore += score;
        this.gamesPlayed++;
    }
    
    public void showStats() {
        System.out.println("\n========== USER STATS ==========");
        System.out.println("Player: " + username);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Games Played: " + gamesPlayed);
        if (gamesPlayed > 0) {
            double average = (double) totalScore / gamesPlayed;
            System.out.println("Average Score: " + average);
        }
        System.out.println("=================================");
    }
    
    public String getUsername() {
        return username;
    }
}
