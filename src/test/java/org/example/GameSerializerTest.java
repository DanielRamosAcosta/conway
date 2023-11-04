package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GameSerializerTest {
    @Test
    void empty_representation_returns_no_cells() {

        GameSerializer serializer = new GameSerializer();

        List<List<Cell>> cells = serializer.from("");

        assertThat(cells.isEmpty()).isEqualTo(true);
    }

}