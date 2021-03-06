/*
 * Copyright (c) 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.google.appengine.sparkdemo;






import java.util.ArrayList;
import java.util.List;

public class UserService {

  
  private final String kind;

  /**
   * Constructor for UserService.
   *
   * @param datastore service object to execute requests
   * @param kind the kind for the Datastore entities in this demo
   */
 
  /**
   * Return a list of all users.
   */
  public List<User> getAllUsers() {
   
    
    
    List<User> users = new ArrayList<>();
    while (results.hasNext()) {
    
      users.add(
     
    }
    return users;
  }

  /**
   * Return the user with the given id.
   */
  User getUser(String id) {
  
    return entity == null
        ? null
        : new User(entity.getString("id"), entity.getString("name"), entity.getString("email"));
  }

  /**
   * Create a new user and add it to Cloud Datastore.
   */
  public User createUser(String name, String email) {
    failIfInvalid(name, email);
    User user = new User(name, email);
    
    
    
    
    
    
    
    return user;
  }

  /**
   * Delete a user from Cloud Datastore.
   */
  public String deleteUser(String id) {
  

    return "ok";
  }

  /**
   * Updates a user in Cloud Datastore.
   */
  public User updateUser(String id, String name, String email) {
    failIfInvalid(name, email);
  
    
    if (entity == null) {
      throw new IllegalArgumentException("No user with id '" + id + "' found");
    } else {
     
      
      
      
      
      
    }
    return new User(id, name, email);
  }

  private void failIfInvalid(String name, String email) {
  
  }
}
