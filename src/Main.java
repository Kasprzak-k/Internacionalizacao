import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String lang = locale.getLanguage(); // "pt", "en", "es"

        System.out.println("OS language code: " + lang);

        switch (lang) {
            case "en":
                System.out.println("Welcome to the system!");
                break;
            case "pt":
                System.out.println("Bem vindo ao sistema!");
                break;
            case "es":
                System.out.println("¡Bienvenido al sistema!");
                break;
            default:
                System.out.println("Welcome!");
        }
    }
}