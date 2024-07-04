package org.example.daos;

import org.example.models.DeliveryEmployee;
import org.example.models.DeliveryEmployeeRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeliveryEmployeeDao {

    public int createDeliveryEmployee(DeliveryEmployeeRequest deliveryEmployee) throws SQLException {

        Connection c = DatabaseConnector.getConnection();

        String insertStatement = "INSERT INTO employee (name, salary, bankNumber, nationalInsuranceNo) VALUES (?,?,?,?);";

        PreparedStatement st = c.prepareStatement(insertStatement, PreparedStatement.RETURN_GENERATED_KEYS);



        st.setString(1, deliveryEmployee.getName());
        st.setDouble(2, deliveryEmployee.getSalary());
        st.setString(3, deliveryEmployee.getBankNumber());
        st.setString(4, deliveryEmployee.getNationalInsuranceNumber());




        st.executeUpdate();

        ResultSet rs = st.getGeneratedKeys();

        if(rs.next()) {

            return rs.getInt(1);

        }

        return -1;


    }

}
