# yaml-merge
Simple Yaml Merge maven library

You can use in your project as :

<dependency>
    <groupId>com.logicalsapien.dataformat</groupId>
    <artifactId>yaml-merge</artifactId>
    <version>1.0.0</version>
</dependency>

Sample usage:

YamlMapper mapper = new YamlMapper();
JsonNode merged = new YamlMerger().merge(
            mapper.read(new File("file.yaml")),
            mapper.read(new File("file2.yaml"))
        );
mapper.write(new YAMLFactory().createGenerator(System.out), merged);

Courtesy: https://github.com/otrosien/yaml-merge