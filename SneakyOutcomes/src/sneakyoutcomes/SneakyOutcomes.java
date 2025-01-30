/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sneakyoutcomes;

import java.util.HashSet;

/**
 *
 * @author Dennis
 */
public class SneakyOutcomes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] outcomes = {123456, 234567, 123347, 456789, 567890, 678901, 789012, 890123, 901234, 112233, 223344, 334455, 789012, 222234, 123347};
        HashSet<Integer> seen = new HashSet<>();
        int[] result = new int[2];
        int index = 0;

        for (int outcome : outcomes) {
            if (seen.contains(outcome)) {
                result[index++] = outcome;
            } else {
                seen.add(outcome);
            }
        }

        System.out.println("[" + result[1] + ", " + result[0] + "]");
    }

}
