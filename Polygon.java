import java.util.Scanner;

class Polygon {
    protected String name;

    public Polygon() {
        this.name = "";
    }

    public Polygon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}