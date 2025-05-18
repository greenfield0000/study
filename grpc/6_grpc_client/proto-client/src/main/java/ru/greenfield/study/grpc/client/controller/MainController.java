package ru.greenfield.study.grpc.client.controller;

import java.util.Date;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;

import ru.greenfield.study.grpc.client.service.CommonCalendarService;

@Path(value = "/")
public class MainController {

    private final CommonCalendarService calendarService;

    @Inject
    public MainController(CommonCalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @GET
    @Path(value = "/date")
    public Date getDate() {
        return calendarService.getCurrentDate();
    }

}
