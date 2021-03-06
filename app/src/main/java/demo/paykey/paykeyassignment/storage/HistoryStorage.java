package demo.paykey.paykeyassignment.storage;

import java.util.List;

/**
 * Created by alexy on 07.01.2017.
 */

public interface HistoryStorage<T> {
    void addHistoryItem(T item) throws StorageException;
    List<T> getHistory() throws StorageException;
}
