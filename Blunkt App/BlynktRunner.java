class BrandShopRunner{

	public static void main(String brand[]){
		  boolean  item  = BrandShop.addItemBrands("Fratelli");
			System.out.println(item);
			
		    item  = BrandShop.addItemBrands("Fratelli");
			System.out.println(item);
			
			 item  = BrandShop.addItemBrands("charosa");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("dia");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("red item");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("blue item");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("sula");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("york");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("Barefoot");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("bi banayan");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("manshion house");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("millor");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("Signature");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("Mordivi");
			System.out.println(item);
			
			item  = BrandShop.addItemBrands("rasa item");
			System.out.println(item);
			
			  
			  BrandShop.getAllBrands();
			  
		boolean items =  BrandShop.updateitemBrand("millor","90 ml");
			System.out.println(item);
  
			  BrandShop.getAllBrands();
			
	boolean itemss =  BrandShop.deleteBrandName("90 ml");
			System.out.println(item);			
			 
			  BrandShop.getAllBrands();
	
	}




}