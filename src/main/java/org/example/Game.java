package org.example;

import java.util.List;

public class Game {

  private final List<List<Cell>> cells;

  public Game(final List<List<Cell>> cells) {

    this.cells = cells;
  }

  public static Game from(final String boardRepresentation) {
    GameSerializer parser = new GameSerializer();
    List<List<Cell>> cells = parser.from(boardRepresentation);
    return new Game(cells);
  }

  public void nextGeneration() {
    throw new RuntimeException("Unimplemented method Game#nextGeneration");
  }

  @Override
  public String toString() {
    GameSerializer parser = new GameSerializer();
    return parser.toRepresentation(cells);
  }
}
