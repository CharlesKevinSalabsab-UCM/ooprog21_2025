public class DebugPen {
    private String color;
    private String point;

    // Default constructor
    public DebugPen() {
        color = "black";
        point = "fine";
    }

    // Constructor with parameters
    public DebugPen(String color, String point) {
        this.color = color;  // Use 'this' to refer to the instance variable
        this.point = point;  // Use 'this' to refer to the instance variable
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
