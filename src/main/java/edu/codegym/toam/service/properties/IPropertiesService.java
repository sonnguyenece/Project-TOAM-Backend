package edu.codegym.toam.service.properties;

import edu.codegym.toam.model.Properties;

public interface IPropertiesService {
    Iterable<Properties> findAll();

    Properties findById(Long id);

    Properties update(Properties properties);

    void removeById(Long id);

    Properties create(Properties properties);

    Iterable<Properties> findAllPropertiesByHostId(Long id);

    Iterable<Properties> findPropertiesByHostIdAndType(Long hostId, Long propertyTypeId);

    Iterable<Properties> filterProperties(String key);


    Iterable<Properties> findAllByPropertiesTypes(String name);

    Iterable<Properties> findPropertiesByType(Long propertyTypeId);

    Iterable<Properties> filterPropertiesAdvance(String address, int bathroom, int bedroom,float priceSelection);
}
