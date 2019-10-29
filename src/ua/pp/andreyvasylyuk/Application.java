package ua.pp.andreyvasylyuk;

public class Application {
    public static void main(String[] args) {      
        Anagram anagram = new Anagram();
        System.out.println(anagram.reverse("some1 text12 3rsidjf3"));
        System.out.println(anagram.reverse("some12 !@p#$$%ae^&-*|}{{"));
        System.out.println(anagram.reverse("bla1 bla2"));
    }
}
