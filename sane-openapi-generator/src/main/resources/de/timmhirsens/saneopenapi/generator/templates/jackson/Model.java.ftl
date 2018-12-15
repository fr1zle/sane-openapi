<#import 'property.java.ftl' as p>

    package ${config.javaPackage};

    public class ${model.name} {

<#list model.properties as property>
    <@p.property property />
</#list>

<#--TODO: toString, hashcode, equals -->

@JsonIgnore
private Map
<String, Object> additionalProperties = new HashMap
<String, Object>();

@JsonAnyGetter
public Map
<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}