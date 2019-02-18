/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rivki
 */Membuat kelas abstact Shape
public class Shape {
    private string name;
    private string area;
    
    public Shape (String name, String Area) {
        this.name = name;
        this.area = area;
}
        public String getName() {
            return this.name;
        }
        public void setName (String name) {
            this.name = name ;
        }
        public String getArea() {
            return this.area ;
        }
        public void setArea(String area) {
            this.area = area ;
        } 
        
}