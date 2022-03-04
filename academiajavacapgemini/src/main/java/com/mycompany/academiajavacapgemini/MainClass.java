/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academiajavacapgemini;

import java.util.Arrays;

/**
 *
 * @author Pedro Albuquerque
 */
public class MainClass {
    public static String primeiraQuestao(int []arr1) {
        Arrays.sort(arr1); //Primeiro ordena-se a lista
        if(arr1.length%2==0){//Para essa questão a lista tem que ter um length impar.
            return("Inválido. Array de tamanho par!");
        }
        return Integer.toString(arr1[((arr1.length)-1)/2]);  
    }
    
    public static int segundaQuestao (int []array, int diferenca){
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
        }
        return count;
    }
    
    public static String terceiraQuestao (String string){
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
            if(i==matriz.length-1) break;
            codigo.append(" ");//A cada fim de coluna, separada por um espaço
        }   
            
        return codigo.toString();
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DEFINA AQUI QUAL OS DADOS PARA VERIFICAR OS MÉTODOS
        
        int arrayPrimeiraQuestao[] = {-9,2,1,4,5,0,6,8,7}; //Insira aqui o vetor da questão 1
        
        System.out.println(primeiraQuestao(arrayPrimeiraQuestao));;
        
        int arraySegundaQuestao[] = {1,3,2}; //Insira aqui o vetor da questão 2
        int diferencaSegundaQuestao = 0; //Insira aqui a diferença a ser averiguada da questão 2
        System.out.println(segundaQuestao(arraySegundaQuestao,diferencaSegundaQuestao));
        
        String stringTerceiraQuestao = new String("love is a loosing game");//Insira aqui a string a ser encriptada da questão 3
        System.out.println(terceiraQuestao(stringTerceiraQuestao));
        

    }
}
