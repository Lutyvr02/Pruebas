package example1;

import Inversion.InvertirNum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestInvNum {

    InvertirNum invertirNum;
    @BeforeEach
    public void setup(){
        invertirNum = new InvertirNum();
    }

    @Test
    public void verifyAdditionPar(){
        String actualResult=invertirNum.invertirNumero(123);
        String expectedResult= "321";
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "89,98",
                    "79,97",
                    "56,65",
                    "90,09",
                    "80,08",
                    "7,7",
                    "5678,8765",
                    "-200, Dato Incorrecto"
            }
    )
    public void verifyAdditionPar(int num, String expectedResult){
        InvertirNum invertirNum1 = new InvertirNum();
        String actualResult=invertirNum1.invertirNumero(num);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR!");
    }
}
