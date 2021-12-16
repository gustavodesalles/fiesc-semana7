package pacote1;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public static void main(String[] args) {
        Administrador administrador = new Administrador("ed","postal","5432345",1,2300,8,250);
        System.out.println(administrador.calcularSalario());
    }
}
