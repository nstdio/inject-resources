/**
 * This package provides {@code inject-resources} Spring extension.
 *
 * <p>This extension consist of annotations (called resource annotations) that when added on {@code Beans} fields,
 * methods or constructor arguments, provides them with content of resources.
 *
 * <h2>Available resource annotations:</h2>
 * <ul>
 *     <li>{@link com.adelean.inject.resources.spring.BinaryResource} - for binary resource</li>
 *     <li>{@link com.adelean.inject.resources.spring.TextResource} - for text resource</li>
 *     <li>{@link com.adelean.inject.resources.spring.PropertiesResource} - for properties resource</li>
 *     <li>{@link com.adelean.inject.resources.spring.JsonResource} - for JSON resource</li>
 *     <li>{@link com.adelean.inject.resources.spring.JsonLinesResource} - for JSON lines resource (one JSON document
 *     per line)</li>
 *     <li>{@link com.adelean.inject.resources.spring.YamlResource} - for YAML resource</li>
 *     <li>{@link com.adelean.inject.resources.spring.YamlDocumentsResource} - for YAML resources containing multiple
 *     YAML documents</li>
 * </ul>
 *
 * <h2>Usage</h2>
 *
 * <p>Enable processing of resource annotations with {@code @EnableResourceInjection}:
 *
 * <pre>
 * &#64;Configuration
 * &#64;EnableResourceInjection
 * public class MyConfig {
 * }
 * </pre>
 *
 * <p>Then you can use use resource annotations to inject content of resources into your beans:
 *
 * <pre>
 * &#64;Component
 * public class MyBean {
 *
 *     &#64;BinaryResource("/com/adelean/junit/jupiter/fibonacci.bin")
 *     private byte[] fibonacciInstanceField;
 *
 *     &#64;Autowired
 *     public MyBean(
 *             &#64;TextResource("/com/adelean/junit/jupiter/resource.txt")
 *             String text) {
 *         // ...
 *     }
 *
 *     &#64;JsonResource(from = "/com/adelean/junit/jupiter/sponge-bob.json", parserBean = "defaultObjectMapper")
 *     public void setParsedJson(Person parsedJson) {
 *         // ...
 *     }
 * }
 * </pre>
 *
 * @author Alexei KLENIN
 */
package com.adelean.inject.resources.spring;
