package com.openbootcamp.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.openbootcamp.demo.models.Bootcamper;
import com.openbootcamp.demo.repositories.BootcampersRepository;
import com.openbootcamp.demo.repositories.BootcampersRepositoryListMemory;

@Service
public class BootcamperService {
    private BootcampersRepository bootcampers = new BootcampersRepositoryListMemory();

    public List<Bootcamper> getAll() {
        return (List<Bootcamper>) bootcampers.findAll();
    }

    public Bootcamper getOne(int id) {

        return (Bootcamper) bootcampers.findOne(id);
    }

    public boolean add(Bootcamper bootcamper) {
        int newId = newIdGenerator();
        bootcamper.setId(newId);
        return bootcampers.add(bootcamper);
    }

    public boolean delete(int id) {
        return bootcampers.remove(id);
    }

    public boolean update(int id, Bootcamper bootcamper) {
        return bootcampers.update(id, bootcamper);
    }

    public int newIdGenerator(){
        return getAll()
                .stream()
                .map(x -> x.getId())
                .reduce(0, (x, y) -> x > y ? x+1 : y+1);
    }
}