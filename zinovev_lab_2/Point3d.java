package zinovev_lab_2;

import java.util.Objects;

public class Point3d {

    // координата X
    private double xCoord;

    // координата Y
    private double yCoord;

    //координата Z
    private double zCoord;

    public Point3d(double xCoord, double yCoord, double zCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }

    public Point3d() {
        this(0 , 0 ,0);
    }

    public double getXCoord() {
        return xCoord;
    }

    public void setXCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getYCoord() {
        return yCoord;
    }

    public void setYCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public double getZCoord() {
        return zCoord;
    }

    public void setZCoord(double zCoord) {
        this.zCoord = zCoord;
    }

    public boolean isEqual(Point3d point) {
        if (this.xCoord == point.xCoord && this.yCoord == point.yCoord && this.zCoord == point.zCoord) {
            return true;
        }

        return false;
    }
}