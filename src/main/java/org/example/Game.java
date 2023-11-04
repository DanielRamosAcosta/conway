package org.example;

public class Game {

  private final String boardRepresentation;

  public Game(final String boardRepresentation) {

    this.boardRepresentation = boardRepresentation;
  }

  public static Game from(final String boardRepresentation) {
    return new Game(boardRepresentation);
  }

  public void nextGeneration() {

  }

  @Override
  public String toString() {
    return boardRepresentation;
  }
}
