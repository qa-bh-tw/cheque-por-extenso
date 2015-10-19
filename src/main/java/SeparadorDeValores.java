public class SeparadorDeValores {

    public static final int MIL = 1000;
    public static final int CEM = 100;

    public int milharesEm(int valor) {
        return valor/ MIL;
    }

    public int centenasEm(int valor) {
        return valor/ CEM;
    }
}
