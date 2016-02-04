package com.onneby.coffee;

import com.onneby.coffee.model.*;

public class CommandTranslator {

    public static String translate(Command command) {
        StringBuilder sb = new StringBuilder();
        if (command instanceof Tea) {
            sb.append("T");
        } else if (command instanceof Coffee) {
            sb.append("C");
        } else if (command instanceof Chocolate) {
            sb.append("H");
        } else if (command instanceof Message) {
            sb.append("M");
        }
        if (command instanceof Drink) {
            Drink drink = (Drink)command;
            if (drink.hasSugar()) {
                sb.append(String.format(":%d:0", drink.getNumberOfSugars()));
            } else {
                sb.append("::");
            }
        } else {
            Message message = (Message) command;
            sb.append(String.format(":%s", message.getContent()));
        }

        return sb.toString();
    }
}