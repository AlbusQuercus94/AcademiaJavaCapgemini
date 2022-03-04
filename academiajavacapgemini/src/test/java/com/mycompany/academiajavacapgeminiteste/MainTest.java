/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academiajavacapgeminiteste;

/**
 *
 * @author Pedro Albuquerque
 */

import com.mycompany.academiajavacapgemini.MainClass;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;




class PrimeiraQuestaoTests {
    
    @ParameterizedTest(name = "Mediana")
    @CsvSource(
            value = {"9,2,1,4,6|4",
                    "9,2,1,4,5,3,6,8,7|5",
                    "15,2,1,4,19,3,54,80,11|11",
                    "-9,2,1,4,5,0,6,8,7|4",
                    "9,2,1,4,5,3,6,8|Inválido. Array de tamanho par!"}, 
            delimiter = '|'
    )
    void isMediana(String first, String expectedResult) {
        
        String[] array = first.split(",");
        int[] ints = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
        
        assertEquals(expectedResult, MainClass.primeiraQuestao(ints));
        System.out.println("\n [" + first + "] tem como mediana o número " + expectedResult);
    }
}


//
class SegundaQuestaoTests {

    @ParameterizedTest(name = "Diferença")
    @CsvSource(
            value = {"1,5,3,4,2|2|3",
                    "-9,2,1,4,5,0,6,8,7|5|3",
                    "9,2,1,7,16,3,6,4,7|7|2",
            }, 
            delimiter = '|'
    )
    void isDiferencaCerta(String first, int second, int expectedResult) {
        String[] array = first.split(",");
        int[] ints = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
        assertEquals(expectedResult, MainClass.segundaQuestao(ints, second));
        System.out.println("\nA quantidade de pares ordenados com a diferença de " + second +" em [" + first + "] é : " + expectedResult);
    }
}


class TerceiraQuestaoTests {

    @ParameterizedTest(name = "Encriptando")
    @CsvSource(
            value = {"tenha um bom dia|taoa eum nmd hbi",
                    "ola mundo|omd luo an",
                    "tenha uma maravilhosa semana|turhe emaom navsa hmian aalsa",
                    "love is a loosing game|lssae oaim vlne eog iog"
            }, 
            delimiter = '|'
    )
    
    void encriptado(String first, String expectedResult) {
        
        assertEquals(expectedResult, MainClass.terceiraQuestao(first));
        System.out.println("\nA encriptação de [" + first +"] é: " + expectedResult);
    }
}