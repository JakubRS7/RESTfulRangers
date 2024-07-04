package org.example.services;

import org.example.daos.DeliveryEmployeeDao;
import org.example.models.DeliveryEmployeeRequest;

import java.sql.SQLException;

public class DeliveryEmployeeService {

    private DeliveryEmployeeDao delEmpDao;

    public DeliveryEmployeeService(DeliveryEmployeeDao delEmpDao) {
        this.delEmpDao = delEmpDao;
    }

    public int createDeliveryEmployee(DeliveryEmployeeRequest deliveryEmployeeRequest) throws SQLException {

        int id  = delEmpDao.createDeliveryEmployee(deliveryEmployeeRequest);

        return id;

    }
}
