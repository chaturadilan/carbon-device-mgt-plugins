/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *
 */

package org.wso2.carbon.device.mgt.output.adapter.websocket.authentication;

import java.util.List;
import java.util.Map;

/**
 * This interface is used to authenticate a websocket session
 */
public interface Authenticator {

    /**
     * This is used to initialize the authenticator
     * @param globalProperties related to the output adapter
     */
    void init(Map<String, String> globalProperties);

    /**
     * Check whether the client is authenticated to connect.
     * @return AuthenticationInfo which contains authentication client information.
     */
    AuthenticationInfo isAuthenticated(Map<String, List<String>> webSocketConnectionProperties);
}
