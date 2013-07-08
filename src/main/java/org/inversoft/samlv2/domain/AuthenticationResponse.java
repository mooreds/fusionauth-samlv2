/*
 * Copyright (c) 2013, Inversoft Inc., All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.inversoft.samlv2.domain;

import java.util.Map;

import org.joda.time.DateTime;

/**
 * @author Brian Pontarelli
 */
public class AuthenticationResponse {
  public Map<String, String> attributes;

  public UserConfirmation confirmation;

  public String destination;

  public String id;

  public DateTime instant;

  public String issuer;

  public ResponseStatus status;

  public User user;

  public AuthenticationResponse() {
  }
}
