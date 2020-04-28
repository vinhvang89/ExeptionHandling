import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter side1 :");
            int side1 = scan.nextInt();
            System.out.println("Enter side2 :");
            int side2 = scan.nextInt();
            System.out.println("Enter side 3 :");
            int side3 = scan.nextInt();
            isTriangle(side1,side2,side3);
        }
        catch (isNotTriangleException e){
            System.out.println("Note : "+ e);
        }
        catch (Exception e){
            System.out.println("He he he");
        }

    }
    static class isNotTriangleException extends Exception{
        isNotTriangleException(String note){
            super(note);
        }
    }
    static void isTriangle(int side1 , int side2, int side3) throws isNotTriangleException{
            if( side1 > 0 && side2 > 0 && side3 > 0
                    && side1 + side2 > side3 && side1 + side3 > side2 && side3 + side2 > side1)
                System.out.println("This is a triangle");
            else
                throw new isNotTriangleException("Mẹ mày");

    }
}
