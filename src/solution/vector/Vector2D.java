package solution.vector;


public class Vector2D implements IVector {
    protected double x;
    protected double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double abs() {
        return Math.sqrt(x*x + y*y);
    }

    @Override
    public double cdot(IVector vector) {
        // double
        return 0;
    }

    @Override
    public double[] getComponents() {
        double[] newVector = new double[2];
        newVector[0] = this.x;
        newVector[1] = this.y;
        return newVector;
    }
}
