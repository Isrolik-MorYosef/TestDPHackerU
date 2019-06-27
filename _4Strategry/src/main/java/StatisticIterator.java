public interface StatisticIterator<T> {
    void reset();
    T next();
    boolean hasNext();
}
