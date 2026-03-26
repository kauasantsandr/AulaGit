Pubic class TesteEmpregado{
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado(nome: "Marco", idade: 30 );
        Empregado empregado2 = empregado1;
        empregado2.setNome(nome: "Ana");
        System.out.printIn(empregado1.getNome());
        System.out.printIn(empregadp2.getNome());
    }
}