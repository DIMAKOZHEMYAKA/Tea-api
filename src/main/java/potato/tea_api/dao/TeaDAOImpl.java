package potato.tea_api.dao;

import org.springframework.stereotype.Repository;
import potato.tea_api.model.Tea;
import potato.tea_api.repository.TeaRepository;

import java.util.List;

@Repository
public class TeaDAOImpl implements TeaDAO {

    private final TeaRepository teaRepository;

    public TeaDAOImpl(TeaRepository teaRepository) {
        this.teaRepository = teaRepository;
    }

    @Override
    public List<Tea> getAllTeas() {
        return teaRepository.findAll();
    }

    @Override
    public Tea getTeaById(int id) {
        return teaRepository.findById(id).orElse(null);
    }

    @Override
    public Tea addTea(Tea tea) {
        return teaRepository.save(tea);
    }

    @Override
    public Tea updateTea(Tea tea) {
        return teaRepository.save(tea);
    }

    @Override
    public void deleteTea(int id) {
        teaRepository.deleteById(id);
    }
}