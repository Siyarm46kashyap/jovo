public class StringBuilder {
    public static void main(String[] args) {
        String str="My name is Radhey Pandya";
       String [] token=str.split("\\s"); //this split the word when white space(\\s) comes;
        for(String s:token) {
            System.out.println(s);
        }
    }
}
