package id.web.kulgram.keuangan.controller;


import id.web.kulgram.keuangan.model.BelanjaPegawai;
import id.web.kulgram.keuangan.repository.BelanjaPegawaiDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class BelanjaPegawaiController {

    @Autowired
    private BelanjaPegawaiDAO dataPenerimaanDAO;

    @GetMapping("/belanjapegawai")
    public List<BelanjaPegawai> getAll() {
        return dataPenerimaanDAO.findAll();
    }

    @GetMapping("/belanjapegawai/{id}")
    public Optional<BelanjaPegawai> getById(@PathVariable("id") Long id) {
        return dataPenerimaanDAO.findById(id);
    }

    @PostMapping("/belanjapegawai")
    public Optional<BelanjaPegawai> add(@RequestBody BelanjaPegawai dataPenerimaan) {
        dataPenerimaanDAO.save(dataPenerimaan);
        return dataPenerimaanDAO.findById(dataPenerimaan.getId());
    }

    @PutMapping("/belanjapegawai/{id}")
    public Optional<BelanjaPegawai> edit(@RequestBody BelanjaPegawai dataPenerimaan, @PathVariable("id") Long id) {
        dataPenerimaan.setId(id);
        dataPenerimaanDAO.save(dataPenerimaan);
        return dataPenerimaanDAO.findById(id);
    }

    @DeleteMapping("/belanjapegawai/{id}")
    public String delete(@PathVariable("id") Long id) {
        dataPenerimaanDAO.deleteById(id);
        return "SUKSES";
    }
}
