


public class Main {
    public static void main(String[] args) {
        CompanySide google = new CompanySide();

        Mobile redmi = new Mobile("redmi");
        Mobile samsung = new Mobile("samsung");
        Mobile realme = new Mobile("realme");

        google.addMobile(redmi);
        google.addMobile(samsung);
        google.addMobile(realme);

        google.notifyMobiles("please checkout our new chatGPT version");

        google.removeMobile(redmi);

        google.notifyMobiles("let me know how are you?");
    }
}