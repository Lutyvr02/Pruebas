package example1;

import Estu.Estudiante;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EstudentTes {

    Estudiante estudiante;
    @BeforeEach
    public void setup(){
        estudiante = new Estudiante();
    }

    @Test
    public void verifyAdditionPar(){
        String actualResult=estudiante.notas(80);
        String expectedResult= "Bien nota: "+80;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "89, Muy Bien nota: 89",
                    "79, Bien nota: 79",
                    "56, Necesitas mejorar nota: 56",
                    "90, Muy Bien nota: 90",
                    "80, Bien nota: 80",
                    "70, Necesitas mejorar nota: 70",
                    "100, Excelente nota: 100",
                    "200, Tu nota no tiene sentido",
                    "-5, nota sin sentido ",
                    "9, Necesitas mejorar nota: 9"
            }
    )
    public void verifyAdditionPar(int nota, String expectedResult){
        Estudiante estudiante1 = new Estudiante();
        String actualResult=estudiante1.notas(nota);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR!");
    }
}
