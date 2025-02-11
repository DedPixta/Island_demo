package ru.javarush.island.khmelov.abstraction.entity;

import ru.javarush.island.khmelov.entity.map.Cell;

@FunctionalInterface
public interface Reproducible {

    @SuppressWarnings("UnusedReturnValue")
    boolean spawn(Cell currentCell);

}
