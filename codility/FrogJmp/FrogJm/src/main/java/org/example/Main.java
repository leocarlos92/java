package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;
        System.out.println(Solution(X, Y, D));
    }

    public static int Solution(int X, int Y, int D) {
        if (X == Y || X > Y) {
            return 0;
        }

        int countJump = 0;
        while (X < Y) {
            X = X + D;
            countJump++;
        }
        return countJump;
    }
}