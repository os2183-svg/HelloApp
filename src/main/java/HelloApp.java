public class UC7HelloArgs {
    public static void main(String[] args) {

        // Check if arguments are passed
        if (args.length == 0) {
            // Default message
            System.out.println("Hello User");
        } else {
            // Join arguments with comma and space
            String joinedNames = String.join(", ", args);

            // Display result
            System.out.println("Hello " + joinedNames);
        }
    }
}