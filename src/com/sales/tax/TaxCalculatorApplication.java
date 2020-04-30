package com.sales.tax;

import java.util.List;

public class TaxCalculatorApplication {

   public  OrderBill generateReceipt(String[] inputs) {
        List<ProductItem> items = ProductItemCollection.from(inputs);
        return new OrderBill(items);
    }
    
    public static void main(String args[]) {
    	TaxCalculatorApplication tt = new TaxCalculatorApplication();
    	String price[]={"1 imported box of chocolates at 10.00","1 imported bottle of perfume at 47.50"};
    	OrderBill generateReceipt = tt.generateReceipt(price);
    	System.out.println(generateReceipt.getTotalSalesTax()+""+generateReceipt.getTotalAmount() );
    }
}
