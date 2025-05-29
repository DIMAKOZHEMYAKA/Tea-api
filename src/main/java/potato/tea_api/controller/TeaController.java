package potato.tea_api.controller;

import org.springframework.web.bind.annotation.*;
import potato.tea_api.model.Tea;
import potato.tea_api.service.TeaService;

import java.util.List;

@RestController
@RequestMapping("/api/teas")
public class TeaController {

    private final TeaService teaService;

    public TeaController(TeaService teaService) {
        this.teaService = teaService;
    }

    @GetMapping
    public List<Tea> getAllTeas() {
        return teaService.getAllTeas();
    }

    @GetMapping("/{id}")
    public Tea getTeaById(@PathVariable int id) {
        return teaService.getTeaById(id);
    }

    @PostMapping
    public Tea addTea(@RequestBody Tea tea) {
        return teaService.addTea(tea);
    }

    @PutMapping("/{id}")
    public Tea updateTea(@RequestBody Tea tea) {
        return teaService.updateTea(tea);
    }

    @DeleteMapping("/{id}")
    public void deleteTea(@PathVariable int id) {
        teaService.deleteTea(id);
    }

    @PostMapping("/import")
    public void importTeaData() {
        teaService.importFromJson("/tea_data.json");
    }
}