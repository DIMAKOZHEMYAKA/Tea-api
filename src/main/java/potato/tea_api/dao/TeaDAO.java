package potato.tea_api.dao;

import potato.tea_api.model.Tea;

import java.util.List;

public interface TeaDAO {
    List<Tea> getAllTeas();
    Tea getTeaById(int id);
    Tea addTea(Tea tea);
    Tea updateTea(Tea tea);
    void deleteTea(int id);
}