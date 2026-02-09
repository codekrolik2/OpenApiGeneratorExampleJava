package com.flower.service.api.controller;

import com.flower.service.api.invoker.ApiResponse;
import com.flower.service.api.model.FiddFileMetadata;
import io.vertx.core.Future;

import java.util.Collections;
import java.util.List;

public class MessagesApiCustomImpl implements MessagesApi {
    @Override
    public Future<ApiResponse<FiddFileMetadata>> getFiddFileMetadata(String fiddId, Long messageNumber) {
        // TODO: Replace with real lookup logic.
        return Future.succeededFuture(new ApiResponse<>(204));
    }

    @Override
    public Future<ApiResponse<List<Long>>> getMessageNumbersBefore(String fiddId, Long messageNumber, Integer count, Boolean inclusive) {
        return Future.succeededFuture(new ApiResponse<>(Collections.emptyList()));
    }

    @Override
    public Future<ApiResponse<List<Long>>> getMessageNumbersBetween(String fiddId, Long latestMessage, Boolean inclusiveLatest, Long earliestMessage, Boolean inclusiveEarliest, Integer count, Boolean getLatest) {
        return Future.succeededFuture(new ApiResponse<>(Collections.emptyList()));
    }

    @Override
    public Future<ApiResponse<List<Long>>> getMessageNumbersTail(String fiddId, Integer count) {
        return Future.succeededFuture(new ApiResponse<>(Collections.emptyList()));
    }
}

