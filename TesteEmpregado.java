Pubic class TesteEmpregado{
    public static void main(String[] args) {
        String nome "kauã";
        String apelido = nome;
        nome: "maria";

        Empregado empregado1 = new Empregado(nome: "maria", idade: 18, salario 5000);
        
        Empregado empregado2 = empregado1;
        empregado2.setNome(nome: "Ana");
        System.out.printIn(empregado1.getNome());
        System.out.printIn(empregadp2.getNome());
    }
}