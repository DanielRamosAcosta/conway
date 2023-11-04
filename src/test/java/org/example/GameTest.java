package org.example;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class GameTest {
  @Test
  void an_empty_games_remain_the_same() {
    Game game = Game.from(
        "---\n" +
        "---\n" +
        "---");

    game.nextGeneration();

    final String string = game.toString();
    assertThat(string).isEqualTo(
        "---\n" +
        "---\n" +
        "---");
  }
}
