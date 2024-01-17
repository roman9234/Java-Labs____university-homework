package points;

public class Point3d extends Point2d{
    private double zCoord;

    public Point3d(double x, double y, double z) {
        super(x, y);//задание x y методом-конструктором из суперкласса
        zCoord = z;
    }

    public Point3d() {//конструктор
        this(0, 0, 0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double val) {
        zCoord = val;
    }
}