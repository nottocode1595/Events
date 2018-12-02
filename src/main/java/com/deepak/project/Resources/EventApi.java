package com.deepak.project.Resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Path("event")
@Produces(MediaType.APPLICATION_JSON)
public class EventApi {

    @GET
    public List<Event_Item> getEvent_Item(){
        Event_Item event_item = new Event_Item();
        event_item.setId(1L);
        event_item.setDate(new Date());
        event_item.setName("Deepak");
        event_item.setDescription("Just Learning");

        return Collections.singletonList(event_item);
    }
}
