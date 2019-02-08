package id.web.kulgram.keuangan.controller;

import id.web.kulgram.keuangan.model.DataPenerimaan;
import id.web.kulgram.keuangan.repository.DataPenerimaanDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class DataPenerimaanController {

    @Autowired
    private DataPenerimaanDAO dataPenerimaanDAO;

    @GetMapping("/datapenerimaan")
    public List<DataPenerimaan> getAll() {
        return dataPenerimaanDAO.findAll();
    }

    @GetMapping("/datapenerimaan/{id}")
    public Optional<DataPenerimaan> getById(@PathVariable("id") Long id) {
        return dataPenerimaanDAO.findById(id);
    }

    @PostMapping("/datapenerimaan")
    public Optional<DataPenerimaan> add(@RequestBody DataPenerimaan dataPenerimaan) {
        dataPenerimaanDAO.save(dataPenerimaan);
        return dataPenerimaanDAO.findById(dataPenerimaan.getId());
    }

    @PutMapping("/datapenerimaan/{id}")
    public Optional<DataPenerimaan> edit(@RequestBody DataPenerimaan dataPenerimaan, @PathVariable("id") Long id) {
        dataPenerimaan.setId(id);
        dataPenerimaanDAO.save(dataPenerimaan);
        return dataPenerimaanDAO.findById(id);
    }

    @DeleteMapping("/datapenerimaan/{id}")
    public String delete(@PathVariable("id") Long id) {
        dataPenerimaanDAO.deleteById(id);
        return "SUKSES";
    }
}
