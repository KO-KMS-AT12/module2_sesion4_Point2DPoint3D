package com.module.kethua;

import com.module.kethua.point.Point2D;
import com.module.kethua.point.Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(10, 5);
        System.out.println(point2D.toString());
        point2D.setXY(7, 4);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(point2D.getX(), point2D.getY(), 8);
        System.out.println(point3D.toString());
        point3D.setXYZ(2, 4, 6);
        System.out.println(point3D.toString());
    }
}
