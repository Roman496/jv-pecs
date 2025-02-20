package core.mate.academy.service;

import java.util.List;

public interface MachineProducer<T> {
    int LENGTH_LIST = 5;

    List<? extends T> get();
}
