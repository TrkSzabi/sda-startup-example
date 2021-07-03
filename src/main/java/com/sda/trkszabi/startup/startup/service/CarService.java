package com.sda.trkszabi.startup.startup.service;

import com.sda.trkszabi.startup.startup.service.dto.CarDTO;

public interface CarService {

    /**
     * Create a new car for the given carDTO.
     *
     * @param carDTO, details of the new car
     * @return id of the new created car
     */
    Long addCar(CarDTO carDTO);

}
