package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class BoardTest {
  @Test
  public void keeps_all_cells_dead() {
    Board board1 = Board.create(List.of(List.of(Cell.dead())));
    Board board2 = Board.create(List.of(List.of(Cell.dead())));

    boolean areEquals = board1.equals(board2);

    assertTrue(areEquals);
  }
}
