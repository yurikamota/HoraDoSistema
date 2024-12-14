import java.util.Locale;
import java.util.Locale.LanguageRange;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do sistema é ");
        System.out.println(idioma.getDisplayLanguage());
        System.out.println("Código do idioma: " + idioma.getLanguage());
    }
}
