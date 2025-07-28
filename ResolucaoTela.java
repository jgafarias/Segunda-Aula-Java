package Java.SegundaAulaJava;

public class ResolucaoTela {
    public static void main(String[] args) {
        // Verifica a resolução da tela do sistema
        int largura = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int altura = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        

        System.out.println("Resolução da sua tela é: " + largura + "x" + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
    }
}
