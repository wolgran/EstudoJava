public class bolo {

    int quantidadeAcucar;
    public static void main(String[] args) {
   
        bolo boloDeChocolate = new bolo();

        boloDeChocolate.quantidadeAcucar = 200;

        bolo boloDeBaunilha = new bolo();

        boloDeBaunilha.quantidadeAcucar = 150;


        System.out.println("Quantidade de açucar no bolo de chocolate: " + boloDeChocolate.quantidadeAcucar);

        System.out.println("Quantidade de açucar no bolo de baunilha: " + boloDeBaunilha.quantidadeAcucar);



    }
}
