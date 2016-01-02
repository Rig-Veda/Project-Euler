package com.github.nalin.euler.problem17;

import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class InWordsTest {

	@Test
	public void testGetNumber() {
		
		assertThat(InWords.getNumber("123", false)).isEqualToIgnoringCase("One hundred and twenty three");
		assertThat(InWords.getNumber("03", false).trim()).isEqualToIgnoringCase("Three");
		assertThat(InWords.getNumber("13", false).trim()).isEqualToIgnoringCase("Thirteen");
		assertThat(InWords.getNumber("056", false).trim()).isEqualToIgnoringCase("Fifty Six");
		assertThat(InWords.getNumber("596", false).trim()).isEqualToIgnoringCase("Five hundred and ninety six");
		assertThat(InWords.getNumber("406", false).trim()).isEqualToIgnoringCase("Four hundred and six");
		assertThat(InWords.getNumber("900", false).trim()).isEqualToIgnoringCase("Nine hundred");
	}
	
		
	@Test
	public void testGetInWords() {
		assertThat(InWords.getInWords("12345").trim()).isEqualToIgnoringCase("Twelve thousand Three Hundred and forty five");
	}

}
