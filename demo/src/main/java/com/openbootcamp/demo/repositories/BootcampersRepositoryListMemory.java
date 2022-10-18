package com.openbootcamp.demo.repositories;

import java.util.List;
import java.util.ArrayList;

import com.openbootcamp.demo.models.Bootcamper;

public class BootcampersRepositoryListMemory extends BootcampersRepository {
    private List<Bootcamper> bootcampersList = new ArrayList<Bootcamper>();

    @Override
    public boolean add(Bootcamper bootcamper) {
        Bootcamper bootcamperExists = findOne(bootcamper.getId());
        if (bootcamperExists != null) {
            return false;
        }

        return bootcampersList.add(bootcamper);

    }

    @Override
    public Bootcamper findOne(int id) {

        for (Bootcamper bootcamper : bootcampersList) {
            if (bootcamper.getId() == id) {
                return bootcamper;
            }
        }

        return null;
    }

    @Override
    public ArrayList<Bootcamper> findAll() {
        return (ArrayList<Bootcamper>) bootcampersList;
    }

    @Override
    public boolean remove(int id) {
        Bootcamper bootcamper = findOne(id);
        if (bootcamper == null) {
            return false;
        }

        return bootcampersList.remove(bootcamper);

    }

    @Override
    public boolean update(int id, Bootcamper bootcamper) {
        Bootcamper bootcamperExists = findOne(id);
        if (bootcamperExists == null) {
            return false;
        }

        boolean isDelete = remove(id);
        boolean isCreate = add(bootcamper);

        return isDelete && isCreate;
    }

}
