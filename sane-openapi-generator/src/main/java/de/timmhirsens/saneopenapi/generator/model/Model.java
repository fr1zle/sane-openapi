package de.timmhirsens.saneopenapi.generator.model;

import java.util.List;

import lombok.Data;

/**
 * TODO <<Zweck und Verantwortung des Moduls, ggf. mehrere Zeilen>>
 */
@Data
public class Model {

	private String name;
	private List<ModelProperties> properties;

}
