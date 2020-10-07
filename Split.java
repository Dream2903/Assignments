public class Split {
    public static void main(String[] args) {

        String s = "Ofte anvendte metoder på String";

        String[] ss = s.split(:" ");
        
        System.out.println(s);
        System.out.println(" ");
        for (String element: ss) {
            System.out.println(element);
        }
    }
}
