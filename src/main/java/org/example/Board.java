package org.example;

import java.util.List;
import java.util.Objects;

public class Board {

  private final List<List<Cell>> cells;

  public Board(final List<List<Cell>> cells) {
    this.cells = cells;
  }

  public static Board create(final List<List<Cell>> cells) {
    return new Board(cells);
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Board board = (Board) o;
    return Objects.equals(cells, board.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cells);
  }
}
