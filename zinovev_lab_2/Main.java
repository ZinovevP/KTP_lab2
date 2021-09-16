package zinovev_lab_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static double computeSideLength(Point3d pointA, Point3d pointB) {
        return Math.sqrt(
                Math.pow(pointA.getXCoord() - pointB.getXCoord(), 2) +
                        Math.pow(pointA.getYCoord() - pointB.getYCoord(), 2) +
                        Math.pow(pointA.getZCoord() - pointB.getZCoord(), 2));
    }

    private static double computeArea(Point3d pointA, Point3d pointB, Point3d pointC) {
        double sideA = computeSideLength(pointA, pointB);
        double sideB = computeSideLength(pointB, pointC);
        double sideC = computeSideLength(pointA, pointC);

        double halfPerimeter = (sideA + sideB + sideC) / 2;

        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Последовательно введите координаты первой точки: ");
        double firstX = Double.parseDouble(reader.readLine());
        double firstY = Double.parseDouble(reader.readLine());
        double firstZ = Double.parseDouble(reader.readLine());
        Point3d firstPoint = new Point3d(firstX, firstY, firstZ);

        System.out.println("Последовательно введите координаты второй точки: ");
        double secondX = Double.parseDouble(reader.readLine());
        double secondY = Double.parseDouble(reader.readLine());
        double secondZ = Double.parseDouble(reader.readLine());
        Point3d secondPoint = new Point3d(secondX, secondY, secondZ);

        System.out.println("Последовательно введите координаты третьей точки: ");
        double thirdX = Double.parseDouble(reader.readLine());
        double thirdY = Double.parseDouble(reader.readLine());
        double thirdZ = Double.parseDouble(reader.readLine());
        Point3d thirdPoint = new Point3d(thirdX, thirdY, thirdZ);

        if (firstPoint.isEqual(secondPoint) || firstPoint.isEqual(thirdPoint) || secondPoint.isEqual(thirdPoint)) {
            System.out.println("Координаты некоторых из указаных точек равны. Вычисление площади бессмысленно.");
        } else {
            System.out.println(
                    computeArea(firstPoint, secondPoint, thirdPoint)
            );
        }
    }
}