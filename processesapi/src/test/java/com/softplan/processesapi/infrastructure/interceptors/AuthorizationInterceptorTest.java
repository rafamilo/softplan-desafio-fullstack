package com.softplan.processesapi.infrastructure.interceptors;

import com.softplan.processesapi.domain.user.admin.services.aux.CustomHttpServletRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@RunWith(PowerMockRunner.class)
class AuthorizationInterceptorTest {

    @InjectMocks
    private AuthorizationInterceptor authorizationInterceptor;

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Test
    void shouldBeReturnUnauthorizedAndFalseWhenNotHaveAuthorizationHeader() {
        boolean handleResponse = authorizationInterceptor.preHandle(request, response, mock(Object.class));

        assertEquals(401, response.getStatus());
        assertFalse(handleResponse);
    }

    @Test
    void shouldBeReturnTrueWhenHaveAuthorizationHeader() {
        CustomHttpServletRequest customRequest = new CustomHttpServletRequest(request);
        customRequest.putHeader("Authorization", "token");

        boolean handleResponse = authorizationInterceptor.preHandle(customRequest, response, mock(Object.class));

        assertTrue(handleResponse);
    }
}