package main.dao.technician;

import main.model.Technician;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryTechnicianDao implements TechnicianDao {
    private HashMap<String, Technician> technicians = new HashMap<>();

    @Override
    public void save(Technician technician) {
        technicians.put(technician.getId(), technician);
    }

    @Override
    public void delete(Technician technician) {
        technicians.remove(technician.getId());
    }

    @Override
    public void update(Technician technician) {
        technicians.replace(technician.getId(), technician);
    }

    @Override
    public Technician findById(int id) {
        return technicians.get(id);
    }

    @Override
    public List<Technician> getAll() {
        return new ArrayList<>(technicians.values());
    }
}
