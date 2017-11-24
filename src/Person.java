public class Person {
    String name;
    int score;

    public Person(String name,int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("%s : %d\n",name,score);
    }
}