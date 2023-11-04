package org.example;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class BoardTest {
  @Test
  public void killALonelyCell() {
    Board board = Board.create(List.of(
        List.of(Cell.dead(),Cell.dead(),Cell.dead()),
        List.of(Cell.dead(),Cell.alive(),Cell.dead()),
        List.of(Cell.dead(),Cell.dead(),Cell.dead())
    ));

    Board nextBoard = board.nextGeneration();

    Board expected = Board.create(List.of(
        List.of(Cell.dead(),Cell.dead(),Cell.dead()),
        List.of(Cell.dead(),Cell.dead(),Cell.dead()),
        List.of(Cell.dead(),Cell.dead(),Cell.dead())
    ));
    assertThat(nextBoard).isEqualTo(expected);
  }

  public void keepsCellsAliveIfHaveTwoNeighbours() {
    Board board = Board.create(List.of(
        List.of(Cell.dead(),Cell.alive(),Cell.alive()),
        List.of(Cell.dead(),Cell.alive(),Cell.alive()),
        List.of(Cell.dead(),Cell.dead(),Cell.dead())
    ));

    Board nextBoard = board.nextGeneration();

    Board expected = Board.create(List.of(
        List.of(Cell.dead(),Cell.alive(),Cell.alive()),
        List.of(Cell.dead(),Cell.alive(),Cell.alive()),
        List.of(Cell.dead(),Cell.dead(),Cell.dead())
    ));
    assertThat(nextBoard).isEqualTo(expected);
  }

  @Test
  public void getsTheNeighborsOfAPosition() {
    Board board = Board.create(List.of(
        List.of(Cell.dead(),Cell.alive(),Cell.alive()),
        List.of(Cell.dead(),Cell.alive(),Cell.alive()),
        List.of(Cell.dead(),Cell.dead(),Cell.dead())
    ));

    int aliveNeighbors = board.amountOfAliveNeighbors(1, 1);

    assertThat(aliveNeighbors).isEqualTo(3);
  }

  @Test
  public void getsTheNeighborsOfPositionInSameRow() {
    Board board = Board.create(List.of(
        List.of(Cell.dead(),Cell.dead(),Cell.dead()),
        List.of(Cell.alive(),Cell.alive(),Cell.alive()),
        List.of(Cell.dead(),Cell.dead(),Cell.dead())
    ));

    int aliveNeighbors = board.amountOfAliveNeighbors(1, 1);

    assertThat(aliveNeighbors).isEqualTo(2);
  }

  @Nested
  class CanCompare {

    @Test
    public void twoEqualBoards() {
      Board board1 = Board.create(List.of(List.of(Cell.dead())));
      Board board2 = Board.create(List.of(List.of(Cell.dead())));

      boolean areEquals = board1.equals(board2);

      assertTrue(areEquals);
    }

    @Test
    public void twoDifferentBoards() {
      Board board1 = Board.create(List.of(List.of(Cell.dead())));
      Board board2 = Board.create(List.of(List.of(Cell.alive())));

      boolean areEquals = board1.equals(board2);

      assertFalse(areEquals);
    }

  }
}
