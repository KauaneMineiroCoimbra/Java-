public class Divida {

    private String nomeDevedor;
    private double valorDivida;
    private int diasAtraso;

    private final double taxa_juros = 0.00033;
    private final double taxa_multa = 0.02;

    public String getNomeDevedor() {
        return nomeDevedor;
    }

    public void setNomeDevedor(String nomeDevedor) {
        this.nomeDevedor = nomeDevedor;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public double calcularJuros() {
        return diasAtraso * taxa_juros * valorDivida;
    }

    public double calcularMulta() {
        return taxa_multa * valorDivida;
    }

    public double calcularValorTotal() {
        return valorDivida + calcularJuros() + calcularMulta();
    }

    public void mostrarDados() {
        System.out.println("devedor: " + nomeDevedor);
        System.out.println("valor original: " + valorDivida);
        System.out.println("dias em atraso: " + diasAtraso);
        System.out.println("juros: " + calcularJuros());
        System.out.println("multa: " + calcularMulta());
        System.out.println("valor total a pagar: " + calcularValorTotal());
    }
}