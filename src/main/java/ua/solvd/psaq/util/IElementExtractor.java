package ua.solvd.psaq.util;

@FunctionalInterface
public interface IElementExtractor<T, R> {
    R extract(T element);
}