package Json;

import json.ManipulandoJson;
import org.junit.Assert;
import org.junit.Test;

public class JsonTest {
    @Test
//    public void testCriandojson(){
//        ManipulandoJson manipulandoJson = new ManipulandoJson();
//        manipulandoJson.criandoJason();

    public void testCriandojson(){ //aqui es para retornar um valor
        ManipulandoJson manipulandoJson = new ManipulandoJson();
        String valor = manipulandoJson.criandoJason();
        Assert.assertEquals("Eleer", valor);

    }
    @Test
    public void lerJson(){
        ManipulandoJson manipulandoJson = new ManipulandoJson();
        manipulandoJson.navegarJsonArquivo();

    }
}
