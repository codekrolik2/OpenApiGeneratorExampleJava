package com.flower.service.controller;

import com.flower.service.api.controller.LogicalFilesApi;
import com.flower.service.api.model.LogicalFileInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Controller
public class LogicalFilesApiController implements LogicalFilesApi {

    private final NativeWebRequest request;

    @Autowired
    public LogicalFilesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<LogicalFileInfo>> fiddIdMessagesMessageNumberLogicalFilesGet(
            String fiddId, Long messageNumber) throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<Resource> fiddIdMessageNumberLogicalFilePathGet(String fiddId, Long messageNumber, String logicalFilePath,
            @Nullable String range, @Nullable String _list, @Nullable List<String> filterIn, @Nullable List<String> filterOut,
            String sort, Boolean includeSubfolders) throws Exception {
        throw new UnsupportedOperationException();
    }
}
