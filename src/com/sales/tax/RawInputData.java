package com.sales.tax;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RawInputData {
	private static final String ITEM_ENTRY_REGEX = "(\\d+) ([\\w\\s]* )at (\\d+.\\d{2})";

	public static ProductItem createItemFromString(String input) {
		Pattern pattern = Pattern.compile(ITEM_ENTRY_REGEX);
		Matcher matcher = pattern.matcher(input);
		matcher.find();
		//hhht
		return new ProductItem(matcher.group(1), matcher.group(2), matcher.group(3));
	}
}
