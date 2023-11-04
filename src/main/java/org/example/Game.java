package org.example;

import java.util.List;

public class Game {

  private final List<List<Cell>> cells;

  public Game(final List<List<Cell>> cells) {

    this.cells = cells;
  }

  public static Game from(final String boardRepresentation) {
    return new GameExecutor(boardRepresentation).invoke(boardRepresentation);
  }

  public void nextGeneration() {
    throw new RuntimeException("Unimplemented method Game#nextGeneration");
  }

  @Override
  public String toString() {
    ConsoleGameSerializer parser = new ConsoleGameSerializer();
    return parser.toRepresentation(cells);
  }

  public String serializeWith(final GameSerializer serializer) {
    return null;
  }
}
