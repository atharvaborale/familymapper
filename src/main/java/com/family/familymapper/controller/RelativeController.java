package com.family.familymapper.controller;

import com.family.familymapper.entity.Relative;
import com.family.familymapper.service.RelativeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/relatives")
@CrossOrigin(origins = "*") // restrict in production
public class RelativeController {
    private final RelativeService service;

    public RelativeController(RelativeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Relative> list() { return service.getAll(); }

    @PostMapping
    public Relative create(@RequestBody Relative r) { return service.save(r); }

    @PutMapping("/{id}")
    public Relative update(@PathVariable Long id, @RequestBody Relative r) {
        r.setId(id);
        return service.save(r);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
