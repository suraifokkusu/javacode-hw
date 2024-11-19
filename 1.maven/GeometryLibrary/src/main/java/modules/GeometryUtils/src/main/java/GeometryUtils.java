public class GeometryUtils {

    // площадь из квадратных сантиметров в квадратные метры
    public double convertSquareCmToSquareM(double areaInCm) {
        return areaInCm / 10000; // 1 кв. м = 10,000 кв. см
    }

    // длина из сантиметров в метры
    public double convertCmToMeters(double lengthInCm) {
        return lengthInCm / 100;
    }

    // длина из метров в сантиметры
    public double convertMToCentimeters(double lengthInM) {
        return lengthInM * 100;
    }

    // сравнение площади двух фигур
    public String compareArea( double area1, double area2) {

        if (area1 > area2) {
            return "Первая фигура имеет большую площадь.";
        } else if (area1 < area2) {
            return "Вторая фигура имеет большую площадь.";
        } else {
            return "Обе фигуры имеют одинаковую площадь.";
        }
    }

    // сравнение периметров двух фигур
    public String comparePerimeter(double perimeter1, double perimeter2) {

        if (perimeter1 > perimeter2) {
            return "Первая фигура имеет больший периметр.";
        } else if (perimeter1 < perimeter2) {
            return "Вторая фигура имеет больший периметр.";
        } else {
            return "Обе фигуры имеют одинаковый периметр.";
        }
    }
}
