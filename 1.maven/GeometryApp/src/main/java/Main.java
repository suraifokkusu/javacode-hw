import models.TriangleModel;
import models.RectangleModel;
import models.CircleModel;
import models.CubeModel;
import models.SphereModel;

public class Main {
    public static void main(String[] args) {
        double aTriangle = 30, bTriangle = 40, cTriangle = 24;
        double aRectangle = 50, bRectangle = 60, aCube = 20;
        double radiusCircle = 56, radiusSphere = 20;

        GeometryUtils geometryUtils = new GeometryUtils();


        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("\t\t\t\t[2D]");
        System.out.println("//////////////////////////////////////////////////////");


        TriangleModel triangleModel = new TriangleModel(aTriangle, bTriangle, cTriangle);

        System.out.println("\t\t\t\t[TRIANGLE]");
        System.out.println("Triangle Area = " + triangleModel.calculateArea()+ " cm^2. OR "
                + geometryUtils.convertSquareCmToSquareM(triangleModel.calculateArea()) + " m^2.");

        System.out.println("Triangle Perimeter = " + triangleModel.calculatePerimeter()+ " cm. OR "
                + geometryUtils.convertCmToMeters(triangleModel.calculatePerimeter()) + " m.");

        System.out.println("//////////////////////////////////////////////////////");


        RectangleModel rectangleModel = new RectangleModel(aRectangle, bRectangle);

        System.out.println("\t\t\t\t[RECTANGLE]");
        System.out.println("Rectangle Area = " + rectangleModel.calculateArea()+ " cm^2. OR " +
                geometryUtils.convertSquareCmToSquareM(rectangleModel.calculateArea()) + " m^2.");

        System.out.println("Rectangle Perimeter = " + rectangleModel.calculatePerimeter()+ " cm. OR "
                + geometryUtils.convertCmToMeters(rectangleModel.calculatePerimeter()) + " m.");

        System.out.println("//////////////////////////////////////////////////////");


        CircleModel circleModel = new CircleModel(radiusCircle);

        System.out.println("\t\t\t\t[CIRCLE]");
        System.out.println("Circle Area = "
                + circleModel.calculateArea() + " cm^2. OR "
                + geometryUtils.convertSquareCmToSquareM(circleModel.calculateArea()) + " m^2.");

        System.out.println("Circle Perimeter (length) = "
                + circleModel.calculatePerimeter()+ " cm. OR "
                + geometryUtils.convertCmToMeters(circleModel.calculatePerimeter()) + " m.");
        System.out.println("//////////////////////////////////////////////////////");


        System.out.println("\t\t\t\t[GEOMETRY_UTILS]");
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("\t\t\tCompare CircleArea and RectangleArea\n"
                + geometryUtils.compareArea(circleModel.calculateArea(), rectangleModel.calculateArea()));

        System.out.println("\n\t\t\tCompare CirclePerimeter (length) and TrianglePerimeter\n"
                +geometryUtils.comparePerimeter( circleModel.calculatePerimeter(), rectangleModel.calculatePerimeter()));

        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("\t\t\t\t[3D]");
        System.out.println("//////////////////////////////////////////////////////");

        CubeModel cubeModel = new CubeModel(aCube);


        System.out.println("\t\t\t\t[CUBE]\n");

        System.out.println("Cube volume = " + cubeModel.calculateVolume()+ " cm^3.");
        System.out.println("//////////////////////////////////////////////////////");


        SphereModel sphereModel = new SphereModel(radiusSphere);

        System.out.println("\t\t\t\t[SPHERE]");
        System.out.println("Sphere volume = " + sphereModel.calculateVolume()+ " cm^3.");
        System.out.println("//////////////////////////////////////////////////////");
    }
}
