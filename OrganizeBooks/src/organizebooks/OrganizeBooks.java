/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package organizebooks;

import java.util.HashMap;

/**
 *
 * @author Dennis
 */
public class OrganizeBooks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] shelf = {1234567, 1234567, 2345678, 2345678, 3456789, 3456789, 1234567, 2345678, 3456789, 4567890, 4567890, 5678901, 5678901, 6789012, 6789012, 1234567, 2345678, 3456789, 4567890, 5678901, 4567890, 5678901};
        HashMap<Integer, Integer> bookCounts = new HashMap<>();

        for (int book : shelf) {
            bookCounts.put(book, bookCounts.getOrDefault(book, 0) + 1);
        }

        int gcd = 0;
        for (int count : bookCounts.values()) {
            gcd = gcd == 0 ? count : findGCD(gcd, count);
        }

        System.out.println(gcd > 1 ? "YES" : "NO");
    }

    private static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }
    
}
