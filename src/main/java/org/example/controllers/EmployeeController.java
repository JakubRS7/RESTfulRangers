package org.example.controllers;

import io.swagger.annotations.Api;
import org.example.models.DeliveryEmployeeRequest;
import org.example.models.Employee;
import org.example.services.DeliveryEmployeeService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.transform.Result;
import java.awt.*;
import java.sql.SQLException;

@Api("Delivery Employee API")
@Path("api/employees")
public class EmployeeController {

    DeliveryEmployeeService deliveryEmployeeService;

    public EmployeeController(DeliveryEmployeeService deliveryEmployeeService) {
        this.deliveryEmployeeService = deliveryEmployeeService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployees() {

        return Response.ok().entity("List of Employees").build();

    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createDeliveryEmployee(DeliveryEmployeeRequest deliveryEmployeeRequest) {

        try {
            return Response
                    .status(Response.Status.CREATED)
                    .entity(deliveryEmployeeService.createDeliveryEmployee(deliveryEmployeeRequest))
                    .build();
        } catch (SQLException e){
            System.out.println(e.getMessage());
            return Response.serverError().build();
        }

    }

}
