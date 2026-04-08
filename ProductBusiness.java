package com.business_layer;
import com.base.Product;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
public class ProductBusiness {

	static Scanner sc=new Scanner(System.in);
	static ArrayList<Product> productList=new ArrayList<Product>();
	
	public static int generateOTP() {
		Random r= new Random();
		int genOTP=r.nextInt(99999);
		return genOTP;
		
	}
	public static String generateProductId(String type,String brand) {
		String t=type.substring(0,3).toUpperCase();
		String b=brand.substring(brand.length()-3).toUpperCase();
		Random r=new Random(); 
		int number=r.nextInt(999);
		return t+number+b;
		
	}
	public static void addProduct() {
		System.out.println("adding product..");
		System.out.println("enter product type:");
		String productType=sc.next();
		System.out.println("Enter Product Brand");
        String productBrand = sc.next();
        System.out.println("Enter Product Price");
        double productPrice = sc.nextDouble();
        System.out.println("Enter Product Quantity");
        int productQuantity = sc.nextInt();
        	Product p=new Product(productType,productBrand,productPrice,productQuantity);
        	productList.add(p);
        	System.out.println(p);
	    System.out.println("Product Added Successfully");
	}

	public static void viewAllProducts() {
		if(productList.isEmpty()) {
			System.out.println("no prod added ..add a product");
		}
		else {
		System.out.println("you want to view all products😊..");
		System.out.println("______________________________________________________________________________________________________________");
		System.out.printf("|%-15s |  %-15s  | %-15s  | %-15s |  %-5s  | %n","productId","productType","productBrand","productPrice","productQuantity");
		System.out.println("_______________________________________________________________________________________________________________");
        for(Product pr : productList)
        	System.out.printf("|%-15s |  %-15s  | %-15s  | %-15f |  %-15d  | %n",pr.getProductId(),pr.getProductType(),pr.getProductBrand(),pr.getProductPrice(),pr.getProductQuantity());
		System.out.println("_______________________________________________________________________________________________________________");
//            System.out.println(pr);
		}
	}
	public static void removeProduct() {
		if(productList.isEmpty()) {
			System.out.println("no prod added ..add a product");
		}
		else {
		System.out.println("enter the product id");
		String productId=sc.next();
		System.out.println("you want to remove products😲..");
        Product product=null;
        Iterator<Product>itr=productList.iterator();
        while(itr.hasNext()) {
        		Product cp=itr.next();
        	if(cp.getProductId().equalsIgnoreCase(productId)){
		    product=cp;
		    itr.remove();
        		}
        }
        if(product==null)
			System.out.println("invalid prodid");
		else
			System.out.println(product+"removed successfully");
		}
        
	}
	public static void searchProduct() {
		if(productList.isEmpty()) {
			System.out.println("no prod added ..add a product");
		}
		else {
			Product product=null;
		System.out.println("enter the prodid");
		String productId=sc.next();
		for(Product cp:productList) {
			if(cp.getProductId().equalsIgnoreCase(productId))
				product =cp;
		 }
		if(product==null)
			System.out.println("invalid prodid");
		else
			System.out.println(product+"searched successfully");
		}
		
	}
	public static void updatedProduct() {
		if(productList.isEmpty()) {
			System.out.println("no prod added ..add a product");
		}
		else {
			Product product=null;
			System.out.println("enter the prodid");
			String productId=sc.next();
			for(Product p:productList) {
				if(p.getProductId().equalsIgnoreCase(productId)) {
					product =p;
					System.out.println("enter updated price:");
					double updatedPrice=sc.nextDouble();
					p.setProductPrice(updatedPrice);
					break;
					
				}
			
			}
			if(product==null)
				System.out.println("invalid prodid");
			else
				System.out.println(product+"updated successfully");
			}
			
		}
	
	public static void animateString(String st) throws InterruptedException 
	{
		for(int i=0;i<=st.length()-1;i++)
		{
			System.out.print(st.charAt(i));
//			Thread.sleep(150);
		}
		System.out.println();
	}
		
	}