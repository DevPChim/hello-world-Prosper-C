public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";

        // Add "My todo:" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying indention


        String todoText2 = "My todo:\n" + todoText + " - Download games\n" + " - Diablo";

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText2);
    }
}