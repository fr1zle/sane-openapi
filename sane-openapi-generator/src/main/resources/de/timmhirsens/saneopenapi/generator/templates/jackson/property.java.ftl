<#macro property modelProperty>
    @JsonProperty("${modelProperty.name}")
    private ${modelProperty.type} ${modelProperty.javaName};

    public void set${modelProperty.javaName?capitalize}(${modelProperty.type} ${modelProperty.javaName}) {
        this.${modelProperty.javaName} = ${modelProperty.javaName};
    }

    public ${modelProperty.type} get${modelProperty.javaName?capitalize}() {
        return this.${modelProperty.javaName};
    }
</#macro>