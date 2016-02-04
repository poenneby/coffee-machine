package com.onneby.coffee;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ponneby on 04/02/16.
 */
public class CommandTranslatorTest {

    @Test
    public void translate_tea() {
        assertThat(translate(new Tea())).isEqualTo("T::");
    }

    @Test
    public void translate_tea_with_one_sugar() {
        assertThat(translate(new Tea().withSugar(1))).isEqualTo("T:1:0");
    }

    @Test
    public void translate_tea_with_two_sugars() {
        assertThat(translate(new Tea().withSugar(2))).isEqualTo("T:2:0");
    }

    @Test
    public void translate_coffee() {
        assertThat(translate(new Coffee())).isEqualTo("C::");
    }

    @Test
    public void translate_coffee_with_one_sugar() {
        assertThat(translate(new Coffee().withSugar(1))).isEqualTo("C:1:0");
    }

    private String translate(Drink drink) {
        StringBuilder sb = new StringBuilder();
        if (drink instanceof Tea) {
            sb.append("T");
        } else if (drink instanceof Coffee) {
            sb.append("C");
        }
        if (drink.hasSugar()) {
            sb.append(String.format(":%d:0", drink.getNumberOfSugars()));
        } else {
            sb.append("::");
        }
        return sb.toString();
    }






    private class Drink {
        private int numberOfSugars;

        public Drink withSugar(int numberOfSugars) {
            this.numberOfSugars = numberOfSugars;
            return this;
        }

        public boolean hasSugar() {
            return this.numberOfSugars > 0;
        }

        public int getNumberOfSugars() {
            return numberOfSugars;
        }
    }

    private class Coffee extends Drink {
    }

    private class Tea extends Drink {

    }
}
