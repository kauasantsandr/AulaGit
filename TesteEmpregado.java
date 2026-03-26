public class TesteEmpregado{
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("maria", 18, 1, 5000, 0, 0);
        Empregado empregado2 = new Empregado("Ana", 18, 1, 5000, 0, 0);
        System.out.println(empregado1.getNome());
        System.out.println(empregado2.getNome());
    }
}