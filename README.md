# ACADEMIA JAVA CAPGEMINI

Neste repositório está o projeto com as respostas do Desafio de Programação da Academia Java Capgemini Turma B.

### Tecnologias Usadas

As questões foram respondidas na linguagem de programação Java através da IDE Apache Netbeans.

* Java Version: JDK 17.0.2;
* Apache Netbeans Version: 12.6
* Apache Maven

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
    2	a	u	m	b
    3	o	m	d	i
    4	a
    ```

    O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.

    coluna 1 = taoa

    coluna 2 = eum

    coluna 3 = nmd

    coluna 4 = hbi

    Saída = taoa eum nmd hbi
