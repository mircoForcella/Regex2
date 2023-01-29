public class Regex2 {
    public static void main(String[] args) {
        String str = "tup tuup tuuup tuuuup";
        String result = str.replaceAll("(u{2,3})", "X");
        System.out.println(result);
    }
}
