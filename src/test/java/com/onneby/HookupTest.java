package com.onneby;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ponneby on 04/02/16.
 */
public class HookupTest {

    @Test
    public void should_fail() throws Exception {
        assertThat(true).isFalse();
    }
}
