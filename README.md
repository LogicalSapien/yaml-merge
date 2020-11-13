# yaml-merge
Simple Yaml Merge maven library

You can use in your project as :

<pre>
<code>
&lt;dependency
    &lt;groupId&gt;com.logicalsapien.dataformat&lt;/groupId&gt;
    &lt;artifactId>yaml-merge&lt;/artifactId&gt;
    &lt;version>1.0.0&lt;/version&gt;
&lt;/dependency&gt;
</code>
</pre>

Sample usage:

<pre>
<code>
YamlMapper mapper = new YamlMapper();
JsonNode merged = new YamlMerger().merge(
            mapper.read(new File("file.yaml")),
            mapper.read(new File("file2.yaml"))
        );
mapper.write(new YAMLFactory().createGenerator(System.out), merged);
</code>
</pre>

Courtesy: https://github.com/otrosien/yaml-merge