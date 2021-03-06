/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package eu.doppel_helix.github.action.apache_commit_info.icla;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Structure mapping for the ICLA signee list for people being committers.
 *
 * @see <a href="https://whimsy.apache.org/public/icla-info.json">https://whimsy.apache.org/public/icla-info.json</a>
 */
public class ICLAInfo {
    @JsonProperty(value = "last_updated")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss z")
    private Date lastUpdated;
    private Map<String,String> committers = new HashMap<>();

    public ICLAInfo() {
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Map<String, String> getCommitters() {
        return committers;
    }

    @Override
    public String toString() {
        return "ICLAInfo{" + "lastUpdated=" + lastUpdated + ", committers=" + committers + '}';
    }
}
