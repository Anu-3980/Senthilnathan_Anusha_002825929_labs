/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product  {
    
    private String name;
    private int price;
    private int id;
   private ArrayList<Feature> featureList;
    private static int count = 0;
    private ImageIcon logoImage;
    
    
    public Product() {
        count++;
        id = count;
       featureList = new ArrayList<Feature>();
    }
public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Feature> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(ArrayList<Feature> featureList) {
        this.featureList = featureList;
    }

   public void addNewFeature(Feature feature){
       featureList.add(feature);
   
   }
    
    @Override
    public String toString() {
        return name;
    }
    
}
