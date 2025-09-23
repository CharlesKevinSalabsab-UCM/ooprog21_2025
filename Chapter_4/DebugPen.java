public class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }


    public DebugPen(String color, String point) {
        this.color = color; 
        this.point = point; 
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Getter for point
    public String getPoint() {
        return point;
    }
}
