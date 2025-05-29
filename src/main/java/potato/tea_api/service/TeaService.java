package potato.tea_api.service;


import potato.tea_api.model.Tea;

import java.util.List;

public interface TeaService {
    List<Tea> getAllTeas();
    Tea getTeaById(int id);
    Tea addTea(Tea tea);
    Tea updateTea(Tea tea);
    void deleteTea(int id);
    void importFromJson(String jsonPath);
}