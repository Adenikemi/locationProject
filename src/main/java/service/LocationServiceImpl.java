package service;

import entities.Location;
import org.springframework.beans.factory.annotation.Autowired;
import repos.LocationRepository;

import java.util.List;

public class LocationServiceImpl implements LocationService{
    @Autowired
    private LocationRepository Repository;

    @Override
    public Location saveLocation(Location location) {
        return Repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return Repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        Repository.delete(location);
    }

    @Override
    public Location getLocationById(int id) {
        return Repository.findById(id).get();
    }

    @Override
    public List<Location> getAllLocations() {
        return Repository.findAll();
    }
}
