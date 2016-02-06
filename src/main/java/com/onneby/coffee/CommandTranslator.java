package com.onneby.coffee;

import com.onneby.coffee.model.*;

public class CommandTranslator {

    public static String translate(Drink drink) {
        StringBuilder sb = new StringBuilder();
        sb.append(drink.getType());
        if (drink.hasSugar()) {
            sb.append(String.format(":%d:0", drink.getNumberOfSugars()));
        } else {
            sb.append("::");
        }

        return sb.toString();
    }
}