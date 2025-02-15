package practise;


public class StringOperations {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));

        String words ="I am Gopinath, from Krishnagiri and completed my engineering degree";
        System.out.println(words.toLowerCase());
        System.out.println(words.toUpperCase());
        System.out.println(words.contains("Gopinath"));
        System.out.println(words.equals("Lalitha"));
        System.out.println(words.charAt(7));
        System.out.println(words.concat(" Currently working at Cinque Technologies"));
        System.out.println(words.length());
        System.out.println(words.trim());
        System.out.println(words.substring(6, 13));
        System.out.println(words.replaceAll("a", "z"));
        System.out.println(words.split(""));
    }
}
