package com.example.test.endpoint.event.consumer.model;

import com.example.test.PojaGenerated;
import com.example.test.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
