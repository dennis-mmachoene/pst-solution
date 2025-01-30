/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package magicpotionidentifier;

import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class MagicPotionIdentifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long powerLevel = new Scanner(System.in).nextLong();
        long cubeRoot = (long) Math.round(Math.cbrt(powerLevel));

        if (cubeRoot * cubeRoot * cubeRoot == powerLevel) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
