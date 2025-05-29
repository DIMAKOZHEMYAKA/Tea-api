package potato.tea_api.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import potato.tea_api.dao.TeaDAO;
import potato.tea_api.model.Tea;

import java.io.InputStream;
import java.util.List;

@Service
public class TeaServiceImpl implements TeaService {

    private final TeaDAO teaDAO;

    public TeaServiceImpl(TeaDAO teaDAO) {
        this.teaDAO = teaDAO;
    }

    @Override
    public List<Tea> getAllTeas() {
        return teaDAO.getAllTeas();
    }

    @Override
    public Tea getTeaById(int id) {
        return teaDAO.getTeaById(id);
    }

    @Override
    public Tea addTea(Tea tea) {
        return teaDAO.addTea(tea);
    }

    @Override
    public Tea updateTea(Tea tea) {
        return teaDAO.updateTea(tea);
    }

    @Override
    public void deleteTea(int id) {
        teaDAO.deleteTea(id);
    }

    @Override
    public void importFromJson(String jsonPath) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream(jsonPath);
            List<Tea> teas = mapper.readValue(inputStream, new TypeReference<List<Tea>>() {});
            for (Tea tea : teas) {
                teaDAO.addTea(tea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}