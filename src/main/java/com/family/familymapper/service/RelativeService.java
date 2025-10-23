package com.family.familymapper.service;

import com.family.familymapper.entity.Relative;
import com.family.familymapper.repo.RelativeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelativeService {
    private final RelativeRepository repo;

    public RelativeService(RelativeRepository repo) {
        this.repo = repo;
    }

    public List<Relative> getAll() { return repo.findAll(); }
    public Relative get(Long id) { return repo.findById(id).orElse(null); }
    public Relative save(Relative r) { return repo.save(r); }
    public void delete(Long id) { repo.deleteById(id); }
}
