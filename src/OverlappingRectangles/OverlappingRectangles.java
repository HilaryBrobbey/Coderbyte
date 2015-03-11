package OverlappingRectangles;
import java.util.*;

/*
Have the function OverlappingRectangles(strArr) read the strArr parameter being passed which will 
represent two rectangles on a Cartesian coordinate plane and will contain 8 coordinates with the first 4 
making up rectangle 1 and the last 4 making up rectange 2. It will be in the following format: 
["(0,0),(2,2),(2,0),(0,2),(1,0),(1,2),(6,0),(6,2)"] Your program should determine the area of the space 
where the two rectangles overlap, and then output the number of times this overlapping region can fit into 
the first rectangle. For the above example, the overlapping region makes up a rectangle of area 2, and the 
first rectangle (the first 4 coordinates) makes up a rectangle of area 4, so your program should output 2. 
The coordinates will all be integers. If there's no overlap between the two rectangles return 0. 
*/
class Function {

    int OverlappingRectangles(String[] strArr) {

        Rectangle ObjectRectangle = new Rectangle(strArr);

        return ObjectRectangle._R1Area / ObjectRectangle._overlappingArea;

    }

    private class Rectangle {

        String[] _recArray;
        int _overlappingArea, _R1Area;

        Rectangle(String[] recArray) {
            _recArray = recArray;
            UnpackRectangleArray();
        }

        void UnpackRectangleArray() {
            String coordinates = _recArray[0];
            String[] coordArray = coordinates.replaceAll("[()]", "").split(",");

            String[] R1CoordinatesArray = Arrays.copyOfRange(coordArray, 0, coordArray.length / 2);
            String[] R2CoordinatesArray = Arrays.copyOfRange(coordArray, coordArray.length / 2, coordArray.length-1);

            int[][] R1 = GetCoordinatesRange(R1CoordinatesArray);
            int[][] R2 = GetCoordinatesRange(R2CoordinatesArray);

            _overlappingArea = OverlappingArea(R1, R2);
            _R1Area = CalculateArea(R1);

        }

        int[][] GetCoordinatesRange(String[] CoordinatesArray) {
            int xMin = Integer.MAX_VALUE;
            int xMax = Integer.MIN_VALUE;
            int yMin = Integer.MAX_VALUE;
            int yMax = Integer.MIN_VALUE;

            for (int i = 0; i < CoordinatesArray.length; i++) {
                int v = Integer.parseInt(CoordinatesArray[i]);
                if (i % 2 == 0) {//x-Coordinates
                    if (v < xMin) {
                        xMin = v;
                    }
                    if (v > xMax) {
                        xMax = v;
                    }
                } else {//y-Coordinates
                    if (v < yMin) {
                        yMin = v;
                    }
                    if (v > yMax) {
                        yMax = v;
                    }
                }
            }

            return new int[][]{{xMin, xMax}, {yMin, yMax}};
        }

        int OverlappingArea(int[][] R1, int[][] R2) {

            int[] xRange = new int[]{R1[0][0], R1[0][1], R2[0][0], R2[0][1]};
            int[] yRange = new int[]{R1[1][0], R1[1][1], R2[1][0], R2[1][1]};
            Arrays.sort(xRange);
            Arrays.sort(yRange);

            return CalculateArea(xRange[2] - xRange[1], yRange[2] - yRange[1]);
        }

        int CalculateArea(int x, int y) {
            return x * y;
        }

        int CalculateArea(int[][] R) {

            int x = R[0][1] - R[0][0];
            int y = R[1][1] - R[1][0];

            return CalculateArea(x, y);
        }

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.OverlappingRectangles(s.nextLine())); 
        System.out.print(c.OverlappingRectangles(new String[]{"(0,0),(2,2),(2,0),(0,2),(1,0),(1,2),(6,0),(6,2)"}));
    }

}
