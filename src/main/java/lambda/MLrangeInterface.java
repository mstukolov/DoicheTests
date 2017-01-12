package lambda;

/**
 * Created by Maxim on 12.01.2017.
 */
@FunctionalInterface
public interface MLrangeInterface<T> {
    T apply(T x, T a, T b, T c, T d);
}
