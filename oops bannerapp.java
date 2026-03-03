 feature/UC6-string-join
public class OOPSstatic {

    // Pattern for letter O
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Pattern for letter P
    public static String[] getPPattern() {
        return new String[] {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Pattern for letter S
    public static String[] getSPattern() {
        return new String[] {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS (O O P S)
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );

 features/UC5-inclined-array
public class OOPSArrayInit {

    public static void main(String[] args) {

        // Declare and initialize array inline using String.join()
        String[] lines = {
            String.join(" ", " *** ", " *** ", " *****", " *****"),
			
            String.join(" ", "*   *", "*   *", "*    *", "*     "),
			
            String.join(" ", "*   *", "*   *", "*    *", "*     "),
			
            String.join(" ", "*   *", "*   *", "***** ", "***** "),
			
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
			
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
			
            String.join(" ", " *** ", " *** ", "*     ", "***** ")
        };

        // Loop to print banner

public class OOPSArray{
    public static void main(String[] args) {

        String[] lines = {
            " ***     ***     *****   ***** ",
			
            "*   *   *   *    *    *  *     ",
			
            "*   *   *   *    *    *  *     ",
			
            "*   *   *   *    *****   ***** ",
			
            "*   *   *   *    *           * ",
			
            "*   *   *   *    *           * ",
			
            " ***     ***     *       ***** "
        };
 main
        for (String line : lines) {
            System.out.println(line); main
        }
    }
}
