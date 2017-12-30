/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punkapitest;

import Amount.Amount;
import Ingredients.Ingredients;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URL;
import java.util.Arrays;

/**
 *
 * @author kdost
 */
public class Beer {
    private double abv;
    private double ph;
    private Method method;
    private int target_og;
    private Ingredients ingredients;
    private String description;
    private String name;
    private int ebc;
    private String brewers_tips;
    private int target_fg;
    private int ibu;
    private int id;
    private Amount boil_volume;
    private URL image_url;
    private String first_brewed;
    private String contributed_by;
    private String tagline;
    private int srm;
    private int attenuation_level;
    private String[] food_pairing;
    private Amount volume;
    
}
