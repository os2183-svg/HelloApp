public class UC6HelloArgs {
    public static void main(String[] args) {
     
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }
        String result = "Hello ";
        for (int i = 0; i < args.length; i++) {
            result += args[i] + ", ";
        }
        result = result.substring(0, result.length() - 2);
        System.out.println(result);
    }
}