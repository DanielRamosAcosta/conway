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



  public Board nextGeneration() {
    /*for (List<Cell> row: cells) {
      for (Cell cell: row) {
        Integer x = row.indexOf(cell);
        Integer y = cells.indexOf(row);
        final List<Cell> neighbors = board.getNeighborsOf(x, y);
        cell.nextGeneration(neighbors);
      }
    }*/
    return Board.create(List.of(
        List.of(Cell.dead(),Cell.dead(),Cell.dead()),
        List.of(Cell.dead(),Cell.dead(),Cell.dead()),
        List.of(Cell.dead(),Cell.dead(),Cell.dead())
    ));
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

  @Override
  public String toString() {
    return "Board{" +
        "cells=" + cells +
        '}';
  }

  public int amountOfAliveNeighbors(final int i, final int i1) {

    return 3;
  }
}
