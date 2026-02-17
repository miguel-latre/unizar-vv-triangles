package es.unizar.eina.vv.testing.triangles;

import java.util.Arrays;

/**
 * Class for representing triangles based solely on the <b>integer</b> length
 * of their sides.
 */
public class Triangle {

    /**
     * Constructs a triangle whose sides measure a, b and c units.
     *
     * @param a
     *            the integer length of the first side of the triangle.
     * @param b
     *            the integer length of the second side of the triangle.
     * @param c
     *            the integer length of the third side of the triangle.
     * @throws IllegalArgumentException
     *            when any of the sides is less than or equal to zero or when their lengths
     *            do not allow forming a triangle because the sum of the lengths of the
     *            two smaller sides is less than or equal to the length of the longest side.
     */
    public Triangle(int a, int b, int c) throws IllegalArgumentException {
    }


    /**
     * Returns the type of this triangle (equilateral, isosceles or scalene)
     * @return the type of this triangle (equilateral, isosceles, scalene).
     */
    public TriangleType type() {
        return null;
    }
}
