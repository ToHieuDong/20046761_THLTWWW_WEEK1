package com.example.demoweek1.resources;

import com.example.demoweek1.entities.Account;
import com.example.demoweek1.services.AccountServices;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/account")
public class AccountResources {


//    @GET
//    @Produces("application/json")
//    @Consumes("application/json")
//    public String hello() {
//        return "Ngu ngu";
//    }
//}
    private AccountServices accountServices;

    public AccountResources() {
        this.accountServices = new AccountServices();
    }

//    @GET
//    @Path(("/{id}"))
//    @Produces("application/json")
//    public Response getAcc(@PathParam("id") long id) {
//        Account account = accountServices.findById(id);
//        if (account==null)
//            return Response.status(Response.Status.BAD_REQUEST).build();
//        return Response.ok(account).build();
//    }

    @GET
    @Produces("application/json")
    public Response getAll() {
        List<Account> list = accountServices.getAll();
        return Response.ok(list).build();
    }
}
