package lab.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QR {
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    int a = IOUtils.readInt(pen, eyes, "Please enter coefficient of x^2: ");
    pen.println("a is " + a);

    int b = IOUtils.readInt(pen, eyes, "Please enter coefficient of x: ");
    pen.println("b is " + b);

    int c = IOUtils.readInt(pen, eyes, "Please enter constant: ");
    pen.println("c is " + c);

    Quadratic qr = new Quadratic(a, b, c);
    double r = qr.smallerRoot();

    pen.println("Smaller root of " + a +"x^2+" + b + "x+" + c + " is: " + (qr.smallerRoot()));

    pen.println("Value of quadratic at this root is: " + qr.evaluate(r));
  } // main
} // QR
