# ACADEMIA JAVA CAPGEMINI

Neste repositório está o projeto com as respostas do Desafio de Programação da Academia Java Capgemini Turma B.

### Tecnologias Usadas

As questões foram respondidas na linguagem de programação Java através da IDE Apache Netbeans.

* Java Version: JDK 17.0.2;
* Apache Netbeans Version: 12.6

### Como Executar

Abra o projeto ```academiajavacapgemini``` na IDE de Java, em ```Source Packages/ com.mycompany.academiajavacapgemini``` possui o arquivo ```MainClass.java```. Aqui no método main está comentado onde inserir os valores a serem avaliados. Depois de determinar os dados, é só ir em na aba Run/RunProject (atalho F6).

As questões foram separadas como métodos. A primeira questão, o método recebe como parâmetro vetores de inteiros com um número ímpar de elementos.

A segunda questão, o método recebe dois parâmetros: o primeiro é o vetor de inteiros e o segundo é o valor da diferença a ser analizada.

A terceira questão, o método recebe uma string como parâmetro.

Após executar o projeto uma vez, ao apertar Alt+F6, roda o arquivo teste.

## O Desafio de Programação

O Desafio de programação consiste em 3 questões que podem ser resolvidas em qualquer linguagem de programação. Porém, é indicado a escolha de ser feito em Java.

A seguir as 3 questões:

* Questão número 1: A **mediana** de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a **mediana**.

  * Exemplo: **Entrada** => array = [9,2,1,4,6] ; **Saída** => 4

* Questão número 2: Dado um vetor de inteiros **n** e um inteiro qualquer **x**. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de **x**.

  * Exemplo: **Entrada** => array = [1,5,3,4,2] , n = 2 ; **Saída** => 3
  * Explicação: No array acima há 3 pares de números cuja a diferença é 2:  [1,3], [4,2] e [5,3]

* Questão número 3: Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:

  ​									![img](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7BT%7D)<= linha <= coluna <= ![img](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7BT%7D)

  * Considere T, como o tamanho do texto.
  * Se certifique de que (linhas * colunas) >= ![img](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=T).

  * Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.

  * Exemplo: **Entrada** => string = "tenha um bom dia" ; **Saída** => taoa eum nmd hbi

  * Explicação: Depois de remover os espaços, a string tem 13 caracteres. ![img](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7B13%7D) está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:

  * ```
    	1	2	3	4
    1	t	e	n	h
    2	a	u	m   b
    3	o	m	d	i
    4	a
    ```

    O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.

    coluna 1 = taoa

    coluna 2 = eum

    coluna 3 = nmd

    coluna 4 = hbi

    Saída = taoa eum nmd hbi

## Soluções

### Questão 01

Essa foi a questão mais fácil de resolver, não tive muita dificuldade. O principal aqui é que ele quer mediana de um vetor com uma quantidade impar de números. Assim a mediana é o valor que ocupa a posição central do vetor, independente de qual seja o valor. 

No projeto, fiz como um método, cujo o parâmetro aceita um vetor de float, como apresentado abaixo

```java
static void primeiraQuestao(float []arr1) {
        Arrays.sort(arr1); //Primeiro ordena-se a lista
        if(arr1.length%2==0){//Para essa questão a lista tem que ter um length impar.
            System.out.println("O array possui um número par de elementos. \n"
                    + "Digite um array com uma quantidade impar de elementos.");
        }else{
            System.out.println(arr1[((arr1.length)-1)/2]);//Printa o valor da mediana
        }
        
    }
```

Decidi por como parâmetro um vetor de float porque o desafio não diz qual tipo primitivo o vetor terá. Por mediana ser usada em estatística, float é mais adequado que o integer.

### Questão 02

Essa questão surgiu uma dúvida: o número da diferença pode ser um número negativo?

A questão não deixa claro se pode ou não, então eu trabalhei com hipótese de que, ao dizer diferença, a questão pede em número absoluto, independente se a diferença seja positiva ou negativa. Assim, mesmo que no vetor tenha números negativos, a questão vai analisar a diferença absoluta entre eles.

Assim, o método da segunda questão ficou da seguinte forma:

```java
static void segundaQuestao (int []array, int diferenca){
        int count = 0; //Esse será o contador das vezes que a subtração dos pares é igual a diferença selecionada
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
```

### Questão 3

A lógica era simples: tirar os espaços, fazer um array da string, definir a raiz, jogar a o array em uma matriz usando for, por fim fazer printar na tela essa matriz só que coluna e linha invertidos.

Essa foi a questão mais complicada de fazer devido os seguintes problemas: não achava o modo certo de retirar os espaços da string, não sabia como mandar a string em um array por letra, por fim redefinir apresentar a string de novo. 

O primeiro problema tentei usar .trim(), .split() e .charAt() com for. Não deram certo até que achei a forma  string.replaceAll.

Assim que resolvido o primeiro problema, o split() resolvia meu segundo problema, de por cada caractere da string em um index do array.

O último problema demorei um pouco pra achar na internet, mas achei na internet o StringBuffer. Ao usar no Netbeans, o mesmo sugeriu a alteração para StringBuilder.

Então o método para a questão 3 ficou da seguinte forma:

```java
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
```
