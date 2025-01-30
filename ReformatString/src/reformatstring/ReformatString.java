/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reformatstring;

/**
 *
 * @author Dennis
 */
public class ReformatString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "Za^B8g@E2jH*kWl!MoPqXr7YvT1c$Fs3Ud9IwZ&yX0pLkV6sHqN^tB4rA+oZ%gFj";
        StringBuilder result = new StringBuilder();
        boolean toUpper = true;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(toUpper ? Character.toUpperCase(c) : Character.toLowerCase(c));
                toUpper = !toUpper;
            } else {
                result.append(c);
            }
        }

        System.out.println(result);
    }

}
