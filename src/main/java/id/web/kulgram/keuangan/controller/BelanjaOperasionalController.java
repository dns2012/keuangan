package id.web.kulgram.keuangan.controller;

import id.web.kulgram.keuangan.model.BelanjaOperasional;
import id.web.kulgram.keuangan.repository.BelanjaOperasionalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class BelanjaOperasionalController {

    @Autowired
    private BelanjaOperasionalDAO dataPenerimaanDAO;

    @GetMapping("/belanjaoperasional")
    public List<BelanjaOperasional> getAll() {
        return dataPenerimaanDAO.findAll();
    }

    @GetMapping("/belanjaoperasional/{id}")
    public Optional<BelanjaOperasional> getById(@PathVariable("id") Long id) {
        return dataPenerimaanDAO.findById(id);
    }

    @PostMapping("/belanjaoperasional")
    public Optional<BelanjaOperasional> add(@RequestBody BelanjaOperasional dataPenerimaan) {
        dataPenerimaanDAO.save(dataPenerimaan);
        return dataPenerimaanDAO.findById(dataPenerimaan.getId());
    }

    @PutMapping("/belanjaoperasional/{id}")
    public Optional<BelanjaOperasional> edit(@RequestBody BelanjaOperasional dataPenerimaan, @PathVariable("id") Long id) {
        dataPenerimaan.setId(id);
        dataPenerimaanDAO.save(dataPenerimaan);
        return dataPenerimaanDAO.findById(id);
    }

    @DeleteMapping("/belanjaoperasional/{id}")
    public String delete(@PathVariable("id") Long id) {
        dataPenerimaanDAO.deleteById(id);
        return "SUKSES";
    }
}
