package de.timmhirsens.saneopenapi.generator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * TODO <<Zweck und Verantwortung des Moduls, ggf. mehrere Zeilen>>
 */
public class GeneratorTest {

	@Test
	public void testInit() {
		assertNotNull(new Generator(new GeneratorConfiguration()));
	}

}