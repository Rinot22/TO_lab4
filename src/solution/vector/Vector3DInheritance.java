package solution.vector;

public class Vector3DInheritance extends Vector2D {
    private double z;

    public Vector3DInheritance(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double abs() {
        double x = super.getComponents()[0];
        double y = super.getComponents()[1];
        return Math.sqrt(x*x + y*y + z*z);
    }

    @Override
    public double cdot(IVector vector) {
        double[] vectorComponents = vector.getComponents();
        double[] components = this.getComponents();
        double tmp = 0;

        if (vectorComponents.length == 2) {
            components[2] = 0.0;
        }

        for (int i = 0; i < components.length; i++) {
            tmp += components[i] + vectorComponents[i];
        }

        return tmp;
    }

    @Override
    public double[] getComponents() {
        return new double[] {this.x, this.y, this.z};
    }

    @Override
    public String toString() {
        return "Vector3DInheritance{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
