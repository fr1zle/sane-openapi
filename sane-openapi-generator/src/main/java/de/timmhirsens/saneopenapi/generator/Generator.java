package de.timmhirsens.saneopenapi.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.TemplateModelException;

/**
 * TODO <<Zweck und Verantwortung des Moduls, ggf. mehrere Zeilen>>
 */
public class Generator {

	private GeneratorConfiguration configuration;
	private Configuration freemarker;

	public Generator(GeneratorConfiguration configuration) {
		this.configuration = configuration;
	}

	public void generate() {
		try {
			buildFreemarker();
			Template template = freemarker.getTemplate("");
			template.process(null, new FileWriter(new File(".")));
		} catch (IOException | TemplateException e) {
			e.printStackTrace();
		}

	}

	private void buildFreemarker() throws TemplateModelException {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
		cfg.setClassLoaderForTemplateLoading(Thread.currentThread().getContextClassLoader(), "de.timmhirsens.saneopenapi.generator.templates");
		cfg.setDefaultEncoding(configuration.getInputCharset());
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		cfg.setSharedVariable("config", this.configuration);
		this.freemarker = cfg;
	}

}
