public class Coordinate {
    private final X x;
    private final Y y;

    public Coordinate(double x, double y) {
        this.x = new X(x);
        this.y = new Y(y);
    }

    public static Coordinate from(String inputViewCoordinate) {
        String[] split = inputViewCoordinate.split(",");

        double x = Double.parseDouble(split[0].replace("(", ""));
        double y = Double.parseDouble(split[1].replace(")", ""));

        return new Coordinate(x, y);
    }

    public X getX() {
        return this.x;
    }

    public Y getY() {
        return this.y;
    }

    public double calculateDistanceWith(Coordinate otherCoordinate) {
        double x = this.x.getX();
        double y = this.y.getY();

        double otherX = otherCoordinate.x.getX();
        double otherY = otherCoordinate.y.getY();

        return Math.sqrt(
                Math.pow((x - otherX), 2)
                        + Math.pow((y - otherY), 2)
        );
    }
}
