package com.rah.feign.repository;

import com.fasterxml.jackson.databind.JsonNode;
import feign.Headers;
import feign.RequestLine;

import java.io.IOException;

public interface IFeignClientRepository {

    @RequestLine("GET /get")
    @Headers({"Content-Type: application/x-www-form-urlencoded", "Accept: */*"})
    JsonNode healthCheck() throws IOException;
}
