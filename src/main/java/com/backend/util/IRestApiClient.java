package com.backend.util;

import com.backend.exception.ApiException;

public interface IRestApiClient {

    IRestApiClient addHeader(String headerName, String headerValue);

    IRestApiClient queryParam(String key, String value);

    <T> T build(Class<T> clazz) throws ApiException;

    IRestApiClient body(String field, String value);

}
