/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kucko.zavrsnirad.model.Mjesto;
import kucko.zavrsnirad.controller.HibObrada;


public class UcitajMjesta {
    
    public static List<String> mjesto = new ArrayList<>();

    private final String source = 
            "https://raw.githubusercontent.com/ndekic/popis_naselja_u_republici_hrvatskoj/master/json/popis_naselja_u_republici_hrvatskoj.json";
    
    
    public UcitajMjesta(){
        try {
            URL url = new URL(source);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            
            JsonParser parser = new JsonParser();
            JsonElement content = parser.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonArray mjesta = content.getAsJsonArray();
            
            for (int i = 0; i < mjesta.size(); i++) {
                JsonObject mjesto = mjesta.get(i).getAsJsonObject();
                String naziv = mjesto.get("mjesto").getAsString() + "(" + mjesto.get("postanskiBroj") + ")";
                naziv = naziv.replace("\"", "");
                UcitajMjesta.mjesto.add(naziv);
                System.out.println(naziv);

                
            }
        
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(UcitajMjesta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UcitajMjesta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        
    }
    
    }
    
    
    
    


