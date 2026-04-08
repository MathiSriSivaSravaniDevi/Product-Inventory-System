package com.service;

import java.util.Scanner;

import com.base.Product;
import com.business_layer.ProductBusiness;
import com.validation_layer.Data_Validation;
public class ProductMain {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		
		ProductBusiness.animateString("***Welcome to JSP == Product Inventory System***");
		
		ProductBusiness.animateString("Login to the inventory");
		ProductBusiness.animateString("Enter your mobile number");
		long mobileNumber=sc.nextLong();
		if(Data_Validation.validateMobileNumber(mobileNumber))
		{
			int genOTP=ProductBusiness.generateOTP();
			System.out.println("\u001B[35m"+"your otp:"+genOTP);
			System.out.println("enter otp:");
			int enOTP=sc.nextInt();
			if(enOTP==genOTP) {
				System.out.println("login successful✔️✔️✔️");
				String type="facewash";
				String brand="himachalpradesh";
			String prodId=ProductBusiness.generateProductId(type,brand);
			System.out.println(prodId);
			while(true) {
				System.out.println("\u001B[33m"+"select from the options..."+"\u001B[0m");
				System.out.println("\u001B[31m"+"1.addproduct");
				System.out.println("2.removeproduct");
				System.out.println("3.view all products  ");
				System.out.println("4.search product");
				System.out.println("5.update product price");
				System.out.println("6.close");
				
				int option=sc.nextInt();
					switch(option) {
					case 1:
	                    ProductBusiness.addProduct();
	                    System.out.println("Product added...");
	                    break;
					case 2:
						ProductBusiness.removeProduct();
						
	                    break;
					case 3:
					     ProductBusiness.viewAllProducts();
	                    break;
					case 4:
						ProductBusiness.searchProduct();
	                    break;
	                case 5:
	                		ProductBusiness.updatedProduct();
	                    break;
	                case 6:{
	                	System.out.println("Thank you...get lost");
	                		System.exit(0);
	                }
	                		break;
	                default:
	                    System.out.println("Invalid option");
					}

			}
					
			}
			else
				System.out.println("invalid otp❌❌❌......try again after sometime");
		}
		else {
			System.out.println("invalid mobile number❌❌❌❌...");
		}
	}
}