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
class SegundaQuestaoTests {

    @ParameterizedTest(name = "Diferença")
    @CsvSource(
            value = {"1,5,3,4,2|2|3",//Aqui cada linha está escrita o vetor analisado, a diferença a ser averiguada e o valor esperado;
                    "-9,2,1,4,5,0,6,8,7|5|3",
                    "9,2,1,7,16,3,6,4,7|7|2",
            }, 
            delimiter = '|' //O valor analisado, a diferença e o valor esperado estão separados por um pipe;
    )
    void isDiferencaCerta(String first, int second, int expectedResult) {
        String[] array = first.split(",");
        int[] ints = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
        assertEquals(expectedResult, MainClass.segundaQuestao(ints, second));
        System.out.println("\nA quantidade de pares ordenados com a diferença de " + second +" em [" + first + "] é : " + expectedResult);
    }
}

