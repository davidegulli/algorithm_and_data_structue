package it.dg.uni.datastructure.trees;

import java.util.Collection;
import java.util.Iterator;

public interface Tree<E> extends Iterable<E> {

    Position<E> root();

    Position<E> parent(Position<E> position);

    Collection<Position<E>> children(Position<E> position);

    int numberOfChildren(Position<E> position);

    boolean isInternal(Position<E> position);

    boolean isExternal(Position<E> position);

    boolean isRoot(Position<E> position);

    int size();

    boolean isEmpty();

    @Override
    Iterator<E> iterator();

    Iterable<Position<E>> positions();

    Iterable<E> elements();
 }
