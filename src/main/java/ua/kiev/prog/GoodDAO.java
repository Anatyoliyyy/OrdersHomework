package ua.kiev.prog;

import java.util.List;

public interface GoodDAO {
    void init();
    void addGood(String title, int price);
    void deleteGood(int id);
    List<Good> getAll();
    long count();
}
