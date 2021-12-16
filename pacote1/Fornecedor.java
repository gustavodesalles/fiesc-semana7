package pacote1;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return (valorCredito - valorDivida);
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("jenny","the block","867-5309", 500, 350.98);
        System.out.println(fornecedor.getNome());
        fornecedor.setEndereco("baker street");
        System.out.println(fornecedor.getEndereco());
        System.out.println(fornecedor.obterSaldo());
    }
}
