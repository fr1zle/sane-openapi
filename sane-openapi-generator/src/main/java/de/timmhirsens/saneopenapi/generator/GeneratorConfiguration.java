package de.timmhirsens.saneopenapi.generator;

import java.io.File;
import java.nio.charset.StandardCharsets;

import lombok.Data;

/**
 * TODO <<Zweck und Verantwortung des Moduls, ggf. mehrere Zeilen>>
 */
@Data
public class GeneratorConfiguration {

	private boolean beanValidation;
	private String javaPackage;
	private File outputDir;
	private File inputFile;
	private String outputCharset = StandardCharsets.UTF_8.name();
	private String inputCharset = StandardCharsets.UTF_8.name();
}
