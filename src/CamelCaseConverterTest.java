import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class CamelCaseConverterTest {

    @Test
    public void testConverterCamelCaseSimples() {
        List<String> resultado = CamelCaseConverter.converterCamelCase("camelCaseExample");
        assertEquals(3, resultado.size());
        assertEquals("camel", resultado.get(0));
        assertEquals("Case", resultado.get(1));
        assertEquals("Example", resultado.get(2));
    }



    @Test
    public void testConverterCamelCaseComLetraMaiusculaNoComeco() {
        List<String> resultado = CamelCaseConverter.converterCamelCase("ExemploCamelCase");
        assertEquals(3, resultado.size());
        assertEquals("exemplo", resultado.get(0));
        assertEquals("Camel", resultado.get(1));
        assertEquals("Case", resultado.get(2));
    }

    @Test
    public void testConverterCamelCaseComPalavrasUnicas() {
        List<String> resultado = CamelCaseConverter.converterCamelCase("Single");
        assertEquals(1, resultado.size());
        assertEquals("single", resultado.get(0));
    }
}
    