package pacote1;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * (comissao/100));
    }

    public static void main(String[] args) {
        Operario operario = new Operario("jimmy","sim","1652351",2,1453,3,600,10.5);
        System.out.println(operario.calcularSalario());
    }
}
