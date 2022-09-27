public class Player {
  private String navn;
  private int score;

  public Player(String navn,int score){
    this.navn=navn;
    this.score=score;
  }

  public void addScore(int dice1, int dice2) {
    int sum = dice1 + dice2;
    score = sum + score;

  }

  public void setNavn(String newNavn) {
    navn = newNavn;
  }

  public String getNavn() {
    return navn;
  }

  public int getScore() {
    return score;
  }

}

