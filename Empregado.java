public class Empregado {
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;

    public Empregado(String nome, int idade, int tipo, double salario, double comissao, double bonus) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.salario = salario;
        this.comissao = comissao;
        this.bonus = bonus;
    }

    public double calcularSalario() {
        if (tipo == 1) {
            return salario;
        } else if (tipo == 2) {
            return salario + salario * comissao;
        } else if (tipo == 3) {
            return salario + bonus;
        } else {
            return 0;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTipo(int Tipo) {
        this.tipo = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getTipo() {
        return tipo;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getComissao() {
        return comissao;
    }

    public Double getBonus() {
        return bonus;
    }
}