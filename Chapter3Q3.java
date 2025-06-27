public class Chapter3Q3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|> Thanks a lot!";
        letter = letter.replace("name", "Ravi");
        System.out.println(letter);
    }
    
}
