package com.logicalsapien.dataformat.yaml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Main class to test.
 */
public class YamlMergeApplication {

    public static void main(String[] args) throws IOException {

        YamlMapper mapper = new YamlMapper();
        JsonNode merged = new YamlMerger().merge(
            mapper.read(new File("src/test/resources/com/logicalsapien/dataformat/yaml/simple/input.yaml")),
            mapper.read(new File("src/test/resources/com/logicalsapien/dataformat/yaml/simple/override.yaml"))
        );
        mapper.write(new YAMLFactory().createGenerator(System.out), merged);
        mapper.write(new YAMLFactory().createGenerator(new FileOutputStream(new File("output.yaml"))), merged);
    }

}
