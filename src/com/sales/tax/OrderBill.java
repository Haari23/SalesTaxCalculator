package com.sales.tax;

import java.util.List;

public class OrderBill {
    private double totalSalesTax = 0.0;
    private double totalAmount = 0.0;
    private String itemDetails;

    public OrderBill(List<ProductItem> items) {

        StringBuilder itemDetails = new StringBuilder();

        for (ProductItem item : items) {
            itemDetails.append(item.toString()).append("\n");
            totalSalesTax += item.getTaxAmount();
            totalAmount += item.getFinalPrice();
        }
        totalAmount = MathUtils.roundOffAmount(totalAmount);
        totalSalesTax = MathUtils.roundOffAmount(totalSalesTax);

        this.itemDetails = itemDetails.toString();
    }

    public String getTotalAmount() {
        return " Total :" +totalAmount;
    }

    public String getTotalSalesTax() {
        return "Sales Taxes :" +totalSalesTax;
    }

    @Override
    public String toString() {
        return "Receipt" + "\n"
                + itemDetails
                + "Sales Taxes: " + totalSalesTax + "\n"
                + "Total: " + totalAmount
                +"\n*******************************\n";
    }
}