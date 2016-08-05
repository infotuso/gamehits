package cz.tuso.gamehits;

/**
 * Created by Alex on 9.7.2016.
 */
public class Game {

    private String name;
    private int year;
    private int votes;
    private int image;
    private String desc;

    public Game(String name, int year, int image) {
        this.name = name;
        this.year = year;
        this.image = image;
        this.votes = 0;
    }

    public Game(String name, int year, int image, String desc) {
        this.name = name;
        this.year = year;
        this.image = image;
        this.votes = 0;
        this.desc = desc;
    }

    public String getName() {
        return(this.name);
    }

    public int getYear() {
        return(this.year);
    }

    public int getVotes() {
        return(this.votes);
    }

    public int getImage() {
        return (this.image);
    }

    public String getDesc() {
        return(this.desc);
    }

    public void vote() {
        this.votes++;
    }

}
