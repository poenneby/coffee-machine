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

    private String translate(Tea tea) {
        if (tea.hasSugar()) {
            return String.format("T:%d:0", tea.getNumberOfSugars());
        }
        return "T::";
    }


    private class Tea {
        private int numberOfSugars;

        public Tea withSugar(int numberOfSugars) {
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
}
