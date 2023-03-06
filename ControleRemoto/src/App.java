public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();
        c.fecharMenu();
        c.maisVolume();
        c.menosVolume();
        c.desligar();
    }
}
