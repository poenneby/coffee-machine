package com.onneby.coffee;

import com.onneby.coffee.model.Chocolate;
import com.onneby.coffee.model.Coffee;
import com.onneby.coffee.model.Drink;
import com.onneby.coffee.model.Tea;

public class CommandTranslator {

    public static String translate(Drink drink) {
        StringBuilder sb = new StringBuilder();
        if (drink instanceof Tea) {
            sb.append("T");
        } else if (drink instanceof Coffee) {
            sb.append("C");
        } else if (drink instanceof Chocolate) {
            sb.append("H");
        }
        if (drink.hasSugar()) {
            sb.append(String.format(":%d:0", drink.getNumberOfSugars()));
        } else {
            sb.append("::");
        }
        return sb.toString();
    }
}