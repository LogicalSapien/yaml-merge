package com.logicalsapien.dataformat.yaml;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;

public class YamlMergerTest {

    @Test
    public void should_merge_two_yaml() throws Exception {
        JsonNode node1  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/simple/input.yaml"));
        JsonNode node2  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/simple/override.yaml"));
        JsonNode expected  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/simple/expected.yaml"));
        JsonNode merged = new YamlMerger().merge(node1, node2);
        assertThat(merged).isEqualTo(expected);
    }

    @Test
    public void should_merge_textnode_yaml() throws Exception {
        JsonNode node1  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/textnode/input.yaml"));
        JsonNode node2  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/textnode/override.yaml"));
        JsonNode expected  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/textnode/expected.yaml"));
        JsonNode merged = new YamlMerger().merge(node1, node2);
        assertThat(merged).isEqualTo(expected);
    }

    @Test
    public void should_merge_nestedarray_yaml() throws Exception {
        JsonNode node1  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/nestedarrays/input.yaml"));
        JsonNode node2  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/nestedarrays/override.yaml"));
        JsonNode expected  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/nestedarrays/expected.yaml"));
        JsonNode merged = new YamlMerger().merge(node1, node2);
        assertThat(merged).isEqualTo(expected);
    }

    @Test
    public void should_merge_with_replacement() throws Exception {
        JsonNode node1  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/replace/input.yaml"));
        JsonNode node2  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/replace/override.yaml"));
        JsonNode expected  = new YamlMapper().read(getClass().getResourceAsStream("/com/logicalsapien/dataformat/yaml/replace/expected.yaml"));
        JsonNode merged = new YamlMerger().merge(node1, node2);
        assertThat(merged).isEqualTo(expected);
    }
}
