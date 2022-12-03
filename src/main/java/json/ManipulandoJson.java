package json;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ManipulandoJson {

//    public void criandoJason(){ //aqui es para rodar e dar certo
//        JSONObject json = new JSONObject();
//        json.put("nome", "Eleer");
//        json.put("sobrenome", "Mendoza");
//        json.put("idade", 23);
        //System.out.println(json);
        //System.out.println(json.get("nome"));

    public String criandoJason(){ // aqui es para restornar um valor
        JSONObject json = new JSONObject();
        json.put("nome", "Eleer");
        json.put("sobrenome", "Mendoza");
        json.put("idade", 23);
        return json.get("nome").toString();


    }
    public void navegarJsonArquivo(){
        JSONObject json;
        try{
            InputStream inputStream = new FileInputStream("./src/main/resources/arquivosJson/cep.Json");
            json = new JSONObject(new JSONTokener(inputStream));
            System.out.println( json.get("localidade"));
            System.out.println(json.get("cep"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("error ao covertir arquivos json" + e);
        }
    }


}
