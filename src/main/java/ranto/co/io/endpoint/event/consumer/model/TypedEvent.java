package ranto.co.io.endpoint.event.consumer.model;

import ranto.co.io.PojaGenerated;
import ranto.co.io.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
