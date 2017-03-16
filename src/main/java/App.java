import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter the length of your rectangle:");
    String stringLength = myConsole.readLine();

    System.out.println("Enter the width of your rectangle:");
    String stringWidth = myConsole.readLine();

    Rectangle rectangle = new Rectangle(Integer.parseInt(stringLength), Integer.parseInt(stringWidth));

    boolean squareResult = rectangle.isSquare();
    System.out.println("Is your rectangle a square, too? " + squareResult + "!");
    int areaResult = rectangle.surfaceArea();
    String areaString = String.format("The area is: %d", areaResult);
    System.out.println(areaString);
  }
}
