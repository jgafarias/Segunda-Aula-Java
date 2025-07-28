package Java.SegundaAulaJava;

public class IdiomaSistema {
    public static void main(String[] args) {
        /* Verifica o idioma utilizado do sistema */
        String idioma = System.getProperty("user.language");
        String pais = System.getProperty("user.country");
        System.out.println("Idioma do sistema é: " + idioma + "-" + pais);
    }
    
}
