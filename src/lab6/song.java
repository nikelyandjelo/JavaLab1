package lab6;

public class song {
    private final int length;
    private final String name;
    private final String genre;
    public song(int length, String name, String genre ) {
        this.length = length;
        this.name = name;
        this.genre = genre;
    }
    public int getLength(){
        return length;
    }
    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public String showData() {
        return String.format("Length: %d | Name: %s | Genre: %s ", getLength(), getName(), getGenre());
    }
}
