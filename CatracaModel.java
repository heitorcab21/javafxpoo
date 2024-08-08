public class CatracaModel {
    private boolean aberta;

    public CatracaModel() {
        this.aberta = false;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("Catraca aberta.");
        }
    }

    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("Catraca fechada.");
        }
    }
}
