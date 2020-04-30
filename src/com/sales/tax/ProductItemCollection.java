package com.sales.tax;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductItemCollection {

    public static List<ProductItem> from(String[] inputs) {
        return Arrays.stream(inputs)
                .map(ProductItemCollection::from)
                .collect(Collectors.toList());
    }

    private static ProductItem from(String input) {
        ProductItem item = RawInputData.createItemFromString(input);
        ProductTaxCalculation.applyTaxes(item);
        return item;
    }

}
