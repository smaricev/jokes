package me.marichely.comparators;

import me.marichely.entity.Joke;

import java.util.Comparator;

/**
 * Created by stjep on 17/09/2017.
 */
public class JokeDifferenceComparator implements Comparator<Joke> {
    @Override
    public int compare(Joke a, Joke b) {
        return a.difference() < b.difference() ? 1 : a.difference() == b.difference() ? 0 : -1;
    }
}