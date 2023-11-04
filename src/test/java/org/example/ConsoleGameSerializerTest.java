package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ConsoleGameSerializerTest {
    @Test
    void empty_representation_returns_no_cells() {

        ConsoleGameSerializer serializer = new ConsoleGameSerializer();

        List<List<Cell>> cells = serializer.from("");

        assertThat(cells.isEmpty()).isEqualTo(true);
    }

}