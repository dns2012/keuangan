package id.web.kulgram.keuangan.controller;

import id.web.kulgram.keuangan.model.BelanjaModal;
import id.web.kulgram.keuangan.repository.BelanjaModalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class BelanjaModalController {

    @Autowired
    private BelanjaModalDAO dataPenerimaanDAO;

    @GetMapping("/belanjamodal")
    public List<BelanjaModal> getAll() {
        return dataPenerimaanDAO.findAll();
    }

    @GetMapping("/belanjamodal/{id}")
    public Optional<BelanjaModal> getById(@PathVariable("id") Long id) {
        return dataPenerimaanDAO.findById(id);
    }

    @PostMapping("/belanjamodal")
    public Optional<BelanjaModal> add(@RequestBody BelanjaModal dataPenerimaan) {
        dataPenerimaanDAO.save(dataPenerimaan);
        return dataPenerimaanDAO.findById(dataPenerimaan.getId());
    }

    @PutMapping("/belanjamodal/{id}")
    public Optional<BelanjaModal> edit(@RequestBody BelanjaModal dataPenerimaan, @PathVariable("id") Long id) {
        dataPenerimaan.setId(id);
        dataPenerimaanDAO.save(dataPenerimaan);
        return dataPenerimaanDAO.findById(id);
    }

    @DeleteMapping("/belanjamodal/{id}")
    public String delete(@PathVariable("id") Long id) {
        dataPenerimaanDAO.deleteById(id);
        return "SUKSES";
    }
}
