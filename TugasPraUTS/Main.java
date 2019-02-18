/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rivki
 */  
public class Main {
    public static void main (String[] args){
        
        Employee boss = new Manajer("Boss","Jakarta", 5000000, 3700000);
        System.out.println("Nama : "+ Boss.getName());
        System.out.println("Alamat : " + Boss.getAddress());
        System.out.println("Gaji : Rp." + Boss.getSalary());
        System.out.printIn(" ") ;


        Employee staff1 = new Staff("Zacky","Bandung",35000000);
        System.out.println("Nama : "+ Zacky.getName());
        System.out.println("Alamat : " + Zacky.getAddress());
        System.out.println("Gaji : Rp." + Zacky.getSalary());
        System.out.printIn(" ") ;

     
        Employee staff2 = new Staff("Habibie","Yogyakarta",3500000);
        System.out.println("Nama : "+ Habibie.getName());
        System.out.println("Alamat : " + Habibie.getAddress());
        System.out.println("Gaji : Rp." + Habibie.getSalary());
        System.out.printIn(" ") ;

   
    }
}
