/*
 * Assignment-1
 * create a class called Product
 * create a main method
 * print the following data in main method


 id: 101,
title: iphone15,
price: 1895 euros,
description: perfect product with best image quality,
category: phone,
 */


package assaignment1;


class Product {

     int id;
     String title;
     String price;
     String description;
     String catagory;
     
    public static void main(String[] args) {
      
        Product product1 = new Product();
        product1.id = 101;
        product1.price = "1895 euros";
       product1.title = "iphone15" ;
       product1.description ="perfect product with best image quality" ;
        product1.catagory ="Phone" ;
       
        System.out.println("id =" + product1.id);
          System.out.println("title =" + product1.title);
          System.out.println("price =" + product1.price);
          System.out.println("description =" + product1.description);
              System.out.println("catagory =" + product1.catagory);
                
                
    }
    
} 



