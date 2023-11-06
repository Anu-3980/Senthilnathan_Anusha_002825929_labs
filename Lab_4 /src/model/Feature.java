/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author archil
 */
public class Feature {
     private Product owner;
     private String name;
     private Object value;
     private ArrayList<Feature> featureList;
     
     public Feature(Product owmner){
         this.owner = owner;
     }
     public Feature(Product owner,String name,Object value){
     this.owner=owner;
     this.name= name;
     this.value=value;
     }
     
      public Feature(){
    
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
     @Override
    public String toString() {
        return name;
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
}


