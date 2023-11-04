package org.example;

import java.util.List;

class GameExecutor {

  public GameExecutor() {
  }

  public String invoke(final String boardRepresentation) {
    ConsoleGameSerializer serializer = new ConsoleGameSerializer();
    List<List<Cell>> cells = parser.from(boardRepresentation);
    final Game game = new Game(cells);

    game.nextGeneration();

    return game.serializeWith(serializer);
  }
}
