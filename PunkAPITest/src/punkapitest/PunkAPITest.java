/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punkapitest;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author kdost
 */
public class PunkAPITest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String[] foodPairs = { "steak", "more beer", "pizza - duh" };
//        Beer thisNewBeer = new Beer(1, "AwesomeBeer", "will upset stomach", "10-11-2012", "Some really IPA stuff that'll mess up your tummy and make you wish it was water!",
//            "https://www.maxim.com/entertainment/beer-makes-you-happy-2017-9", foodPairs, "don't drink this stuff");
        String response = getHTML("https://api.punkapi.com/v2/beers/random");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode inititalJSON = mapper.readTree(response);
        // System.out.println(inititalJSON != null ? "yup" : "nope");;
        
        System.out.println(inititalJSON.toString());
        String description = inititalJSON.get("image_url").asText();
        System.out.println(description);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        try {
//            String beerToJSON = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(thisNewBeer);
//            System.out.println(beerToJSON);
//            Beer newerBeer = mapper.readValue(response, Beer.class);
//            System.out.println(newerBeer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        


        }

    private static String getHTML(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }
    
}
