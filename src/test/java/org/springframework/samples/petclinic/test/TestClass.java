package org.springframework.samples.petclinic.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class TestClass {

	@Test
	void assertThatTrue() {
		assertThat("".isEmpty()).isTrue();
	}

	@Test
	void assertThatFalse() {
		assertThat(1 > 3).isFalse();
	}

	@Test
	void assertThatStringsEqual() {
		//TODO implement it
		//assertThat().isEqualTo();
	}
}
