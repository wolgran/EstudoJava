public class loops {
    public static void main(String[] args){

/*loop for */
for (int i = 0; i < 5 ; i++) {

            System.out.println(i);
        }

//-------------------------------------------------------------

int j = 0; /*loop while */

while (j < 5) {

    System.out.println(j);

    j++;
}
//--------------------------------------------------------------
        
int k = 6;  loop do while 

do {
    System.out.println(k);
    k++;
} while (k < 5);*/

//--------------------------------------------------------------

int soma = 0;

for (int i = 0; i <= 10; i++) {
        soma = soma + i;
        System.out.println(soma);
            
}
//---------------------------------------------------------------

int contadorDoces = 1;

while (contadorDoces <= 3) {

    System.out.println("Pode comer!");
    contadorDoces++;
}

//---------------------------------------------------------------

int valor = 10;
int soma = 0;
int contador = 1;

do{
 soma += contador;
 contador++;
} while (contador <= valor);

System.out.println("A soma dos números até " + valor + " é: " + soma);
//---------------------------------------------------------------

int codigoDeSaida = 7;

for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++) {

    if (codigoCarteirinha == codigoDeSaida){
    break;
}

    if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
        System.out.println("Codigo " + codigoCarteirinha + " aceito pelo hospital Santa Clara.");
        continue;
}

    System.out.println("Codigo " + codigoCarteirinha + " não e aceito pelo hospital."); 

}


    }
}
