package com.flower.service.controller;

import com.flower.service.api.controller.MessagesApi;
import com.flower.service.api.model.FiddFileMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Controller
public class MessageApiController implements MessagesApi {

    private final NativeWebRequest request;

    @Autowired
    public MessageApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<Long>> fiddIdMessagesTailGet(String fiddId, Integer count) throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<List<Long>> fiddIdMessagesMessageNumberBeforeGet(
            String fiddId, Long messageNumber, Integer count, Boolean inclusive) throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<FiddFileMetadata> fiddIdMessagesMessageNumberMetadataGet(String fiddId, Long messageNumber) throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<List<Long>> fiddIdMessagesRangeGet(String fiddId, Long latestMessage, Boolean inclusiveLatest,
                                                             Long earliestMessage, Boolean inclusiveEarliest, Integer count,
                                                             Boolean getLatest) throws Exception {
        throw new UnsupportedOperationException();
    }
}
