public class Funcionario {

    String nome;
    String cargo;
    int idade;
    
    //Este é o Construtor
    Funcionario(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Felipe", "Desenvolvedor", 32);
        //funcionario1.nome = "Felipe";
        //funcionario1.cargo = "Desenvolvedor";
        //funcionario1.idade = 32;

        Funcionario funcionario2 = new Funcionario("Mayara","Nails Designer",27);
        //funcionario2.nome = "Mayara";
        //funcionario2.cargo = "Nails Designer";
        //funcionario2.idade = 27;

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);
        System.out.println("------------------------------");
        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);
    }
}