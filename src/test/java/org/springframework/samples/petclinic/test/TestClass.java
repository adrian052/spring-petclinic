package org.springframework.samples.petclinic.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class TestClass {

	@Test
	void assertThatAnotherTrue() {
		assertThat(2 + 2 > 0).isTrue();
	}

	@Test
	void assertThatFalse() {
		assertThat(BigInteger.ONE.intValue() < 0).isFalse();
	}

	@Test
	void assertThatArraysEqual() {
		String[] expected = new String[]{"abc", "def"};
		assertThat(new String[]{"abc", "def"}).containsExactlyInAnyOrder(expected);
	}
}
