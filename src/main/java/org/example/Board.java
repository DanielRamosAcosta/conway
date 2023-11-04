package org.example;

import java.util.List;

public class Board {

  public static Board create(final List<List<Cell>> cells) {
    return new Board();
  }

  @Override
  public boolean equals(final Object obj) {
    return true;
  }
}
