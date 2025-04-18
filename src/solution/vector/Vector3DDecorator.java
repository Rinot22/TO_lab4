package solution.vector;

public class Vector3DDecorator implements IVector {
    private IVector vector;
    private double z;

    public Vector3DDecorator(IVector vector, double z) {
        this.vector = vector;
        this.z = z;
    }

    @Override
    public double abs() {
        double vx = vector.getComponents()[0];
        double vy = vector.getComponents()[1];
        return Math.sqrt(vx*vx + vy*vy + this.z*this.z);
    }

    @Override
    public double cdot(IVector vector) {
        double[] vectorComponents = vector.getComponents();
        double[] components = getComponents();
        double tmp = 0;

        for (int i = 0; i < components.length; i++) {
            tmp += components[i] * vectorComponents[i];
        }

        return tmp;
    }

    @Override
    public double[] getComponents() {
        return new double[] {this.vector.getComponents()[0], this.vector.getComponents()[2], this.z};
    }

    @Override
    public String toString() {
        return "Polar2DAdapter{" +
                "vector=" + vector +
                ", z=" + z +
                '}';
    }
}
