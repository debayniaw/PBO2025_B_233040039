package pertemuan2;

public class Ball {
    private String color;
    private int size;
    private boolean moveStatus;

    // Constructor for the Ball class
    public Ball(String color, int size, boolean moveStatus) {
        this.color = color;
        this.size = size;
        this.moveStatus = moveStatus;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }
}