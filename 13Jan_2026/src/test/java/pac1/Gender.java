
package pac1;

public enum Gender {
    M, F;

    // Optional helper: convert user input to Gender safely
    public static Gender fromInput(String input) {
        if (input == null || input.isEmpty()) return null;
        char c = Character.toUpperCase(input.trim().charAt(0));
        if (c == 'M') return M;
        if (c == 'F') return F;
        return null;
    }
}
