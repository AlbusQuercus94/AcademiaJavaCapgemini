/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academiajavacapgeminiteste;

import com.mycompany.academiajavacapgemini.MainClass;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author Pedro Albuquerque
 */
class PrimeiraQuestaoTests {
    
    @ParameterizedTest(name = "Mediana")
    @CsvSource(
            value = {"9,2,1,4,6|4", //Aqui cada linha está escrita o vetor analisado e o valor esperado;
                    "9,2,1,4,5,3,6,8,7|5",
                    "15,2,1,4,19,3,54,80,11|11",
                    "-9,2,1,4,5,0,6,8,7|4",
                    "9,2,1,4,5,3,6,8|Inválido. Array de tamanho par!"}, 
            delimiter = '|' //O valor analisado e o valor esperado estão separados por um pipe;
    )
    void isMediana(String first, String expectedResult) {
        
        String[] array = first.split(",");
        int[] ints = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
        
        assertEquals(expectedResult, MainClass.primeiraQuestao(ints));
        System.out.println("\n [" + first + "] tem como mediana o número " + expectedResult);
    }
}


