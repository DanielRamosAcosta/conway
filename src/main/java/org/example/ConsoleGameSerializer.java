package org.example;

import java.util.List;

public class ConsoleGameSerializer implements GameSerializer {

  public List<List<Cell>> from(final String representation) {
    throw new RuntimeException("Unimplemented method GameParser#parse");
  }

  public String toRepresentation(final List<List<Cell>> cells) {
    throw new RuntimeException("Unimplemented method GameParser#toRepresentation");
  }
}
