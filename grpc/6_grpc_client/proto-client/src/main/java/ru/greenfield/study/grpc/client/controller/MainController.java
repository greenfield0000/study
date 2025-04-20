package ru.greenfield.study.grpc.client.controller;

import java.util.Date;

import jakarta.ws.rs.*;

import com.google.protobuf.*;

import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;
import ru.greenfield.strudy.grpc.genproto.calendar.CalendarService;

@Path(value = "/")
public class MainController {

    @GrpcClient("calendar")
    CalendarService calendar;

    @GET
    @Path(value = "/date")
    public Date getDate() {
        Uni<Timestamp> currentDate = calendar.getCurrentDate(Empty.newBuilder().build());
        System.out.println(currentDate.onItem().toString());
        return new Date();
    }
    
}
