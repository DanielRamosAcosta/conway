package org.example;

import java.util.Objects;

public class Cell {

  private final boolean alive;

  public Cell(final boolean alive) {
    this.alive = alive;
  }

  public static Cell dead() {
    return new Cell(false);
  }

  public static Cell alive() {
    return new Cell(true);
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Cell cell = (Cell) o;
    return alive == cell.alive;
  }

  @Override
  public int hashCode() {
    return Objects.hash(alive);
  }
}
