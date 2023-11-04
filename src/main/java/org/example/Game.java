package org.example;

public class Game {

  public static Game from(final String boardRepresentation) {
    return new Game();
  }

  public void nextGeneration() {

  }

  @Override
  public String toString() {
    return "---\n" +
            "---\n" +
            "---";
  }
}
