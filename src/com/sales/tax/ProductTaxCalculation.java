package com.sales.tax;

public class ProductTaxCalculation {
    private static final double SALES_TAX_PERCENT = 0.1;
    private static final double ADDITIONAL_SALES_TAX_PERCENT = 0.05;

    public static void applyTaxes(ProductItem item) {
        if (!item.isExempted()) {
            item.setBasicSalesTaxAmount(SALES_TAX_PERCENT);
        }

        if (item.isImported()) {
            item.setAdditionalSalesTax(ADDITIONAL_SALES_TAX_PERCENT);
        }
    }
}
