package de.timmhirsens.saneopenapi.generator.ftl;

import java.util.List;

import org.apache.commons.text.CaseUtils;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

/**
 * TODO <<Zweck und Verantwortung des Moduls, ggf. mehrere Zeilen>>
 */
public class CamelCaseMethod implements TemplateMethodModelEx {
	@Override
	public Object exec(List arguments) throws TemplateModelException {
		String argument = (String) arguments.get(0);
		return CaseUtils.toCamelCase(argument, false, '_', '-');
	}
}
