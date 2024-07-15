package lesson7.labs.prob2.intfaces2;

import java.awt.*;

public class EQTriangle implements ClosedCurve,Polygon{
    private double side;
    EQTriangle(double side){
        this.side = side;
    }

    @Override
    public double computePerimeter() {
        return Polygon.super.computePerimeter();
    }
    @Override
    public double[] getSides(){
    return new double[]{side,side,side};
    }
}

