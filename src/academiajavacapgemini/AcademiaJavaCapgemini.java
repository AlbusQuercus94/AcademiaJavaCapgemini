/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academiajavacapgemini;

import java.util.Arrays;

/**
 *
 * @author Pedro Albuquerque
 */
public class AcademiaJavaCapgemini {

    /**
     * @param args the command line arguments
     */
    
    static void primeiraQuestao(float []arr1) {
        Arrays.sort(arr1); //Primeiro ordena-se a lista
        if(arr1.length%2==0){//Para essa questão a lista tem que ter um length impar.
            System.out.println("O array possui um número par de elementos. \n"
                    + "Digite um array com uma quantidade impar de elementos.");
        }else{
            System.out.println(arr1[((arr1.length)-1)/2]);//Printa o valor da mediana
        }
        
    }
    
    static void segundaQuestao (int []array, int diferenca){
        int count = 0; //Esse será o contador das vezes que a subtração dos pares é igual a diferença selecionada
        //Arrays.sort(array); //A ordenação é será necessária para que a diferença não seja negativa.
        if(diferenca<0){
            System.out.println("Digite para o parâmetro diferença um valor maior ou igual a zero");
        }else{
            for(int i = 0; i < array.length; i++){
                for (int l = i+1; l<array.length; l++){
                    if(Math.abs(array[l]-array[i]) == Math.abs(diferenca)){ //Math.abs faz com que o resultado seja o valor absoluto da operação.
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    
    static void terceiraQuestao (String string){
        String s = string.replaceAll(" ", ""); //Retirando os espaços em branco
        String texto[] = s.split(""); //Transformando a string sem espaços em um array.
        
        int raiz = (int)Math.round(Math.ceil(Math.sqrt(s.length()))); //Calculando a raiz a ser usada como tamanho máximo de linhas e colunas
        
        String matriz[][] = new String [raiz][raiz]; // Declarando um vetor com tamanho pré-estabelecido
        
        int count = 0; //Esse contador para definir quando parar de adicionar caractere na matriz
        
        for(int i = 0; i < raiz; i++){  
            for(int l = 0; l < raiz; l++){
                matriz[i][l] = texto[count];
                if(count == s.length()-1){ //Aqui define quando parar de adicionar caractere e quebrar o loop.
                    break;
                }else{
                    count++;
                }
            }
        }    
        
        StringBuilder codigo = new StringBuilder(); //Criando a nova string que será o código
        for(int i = 0; i < matriz.length; i++) {
            for(int l = 0; l < raiz; l++){
                if(null == matriz[l][i]){ //Como a string pode ser menor que a quantidade de linhas*colunas, haverá espaços null,
                                            //aqui retiramos esses espaços ao construir a string.
                    continue;
                }else{
                codigo.append(matriz[l][i]);
                }
            }  
            codigo.append(" ");//A cada fim de coluna, separada por um espaço
        }   
            
        System.out.println(codigo);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //
        
        //int arr1[] = {9,2,1,4,6,3,5,8,7};
//        primeiraQuestao(new float[]{9,2,1,4,6,3,5,8,7});
        
        int arr2[] = {1,3,2};
        int diferenca = 0;
        segundaQuestao(arr2,diferenca);
        
//        terceiraQuestao(new String("tenha uma maravilhosa semana"));
        
        //---------------------RASCUNHOS---------------------------//
        
        //QUESTÃO 1 - MEDIANA
        
        //int arr1[] = {9,2,1,4,6,3,5,8,7}; ;
        //Arrays.sort(arr1);
        //if(arr1.length%2==0){
            //System.out.println("O array possui um número par de elementos. \n"
                    //+ "Digite um array com uma quantidade impar de elementos.");
        //}else{
            //System.out.println("A mediana é: " + arr1[((arr1.length)-1)/2]);
        //}
        
        
        
        //QUESTÃO 2 - DIFERENÇA
        
        //int arr2[] = {1,3,2};
        //int diferenca = 1;
        //int count = 0;
        //Arrays.sort(arr2);
        //for(int i = 0; i < arr2.length; i++){
            //for (int l = i+1; l<arr2.length; l++){
                //System.out.println(arr2[l] + " - " + arr2[i] + " = " + (arr2[l]-arr2[i]));
                //if(arr2[l]-arr2[i] == diferenca){
                    //count++;
                //}
            //}
        //}
        //System.out.println("No array " + Arrays.toString(arr2) + " tem " + count +
                //" pares de números com a diferença de " + diferenca);

        //QUESTÃO 3 - CODIFICAÇÃO
        
        //String s = new String("ola mundo");
        
        //String s3 = s.replaceAll(" ", "");
        //String texto[] = s3.split("");
        //int raiz = (int)Math.round(Math.ceil(Math.sqrt(s3.length())));
        //String matriz[][] = new String [raiz][raiz];
        
        //int count = 0;
        //for(int i = 0; i < raiz; i++){  
            //for(int l = 0; l < raiz; l++){
                //matriz[i][l] = texto[count];
                //if(count == s3.length()-1){
                    //break;
                //}else{
                    //count++;
                //}
            //}
        //}    
        //StringBuilder sb = new StringBuilder();
        //for(int i = 0; i < matriz.length; i++) {
            //for(int l = 0; l < raiz; l++){
                //if(null == matriz[l][i]){
                    //continue;
                //}else{
                //sb.append(matriz[l][i]);
                //}
            //}  
            //sb.append("\n");
        //}   
            
        //System.out.println(sb);
        
    }
    
}
