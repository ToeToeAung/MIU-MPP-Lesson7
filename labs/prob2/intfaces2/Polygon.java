package lesson7.labs.prob2.intfaces2;

public interface Polygon {
    double[] getSides();

    default double computePerimeter() {
        double[] sides = getSides();
        double perimeter = 0;
        for(double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}