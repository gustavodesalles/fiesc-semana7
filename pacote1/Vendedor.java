package pacote1;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * (comissao/100));
    }

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Peter Sellers","BBC Studios, London","555-1965",3,4009.67,9,400,23);
        System.out.println(vendedor.calcularSalario());
    }
}
