package com.mycompany.academiajavacapgeminiteste;

import com.mycompany.academiajavacapgemini.MainClass;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro Albuquerque
 */

class TerceiraQuestaoTests {

    @ParameterizedTest(name = "Encriptando")
    @CsvSource(
            value = {"tenha um bom dia|taoa eum nmd hbi", //Cada linha é contém a string a ser codificada e o valor esperado
                    "ola mundo|omd luo an",
                    "tenha uma maravilhosa semana|turhe emaom navsa hmian aalsa",
                    "love is a loosing game|lssae oaim vlne eog iog"
            }, 
            delimiter = '|' //A string a ser codificado e o valor esperado estão separados por um pipe;
    )
    
    void encriptado(String first, String expectedResult) {
        
        assertEquals(expectedResult, MainClass.terceiraQuestao(first));
        System.out.println("\nA encriptação de [" + first +"] é: " + expectedResult);
    }
}
