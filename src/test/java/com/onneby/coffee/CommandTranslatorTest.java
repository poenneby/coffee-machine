package com.onneby.coffee;

import com.onneby.coffee.model.Chocolate;
import com.onneby.coffee.model.Coffee;
import com.onneby.coffee.model.Message;
import com.onneby.coffee.model.Tea;
import org.junit.Test;

import static com.onneby.coffee.CommandTranslator.translate;
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

    @Test
    public void translate_chocolate_with_one_sugar() {
        assertThat(translate(new Chocolate().withSugar(1))).isEqualTo("H:1:0");
    }

    @Test
    public void translate_message() {
        assertThat(translate(new Message().withContent("Hello!"))).isEqualTo("M:Hello!");
    }


}
