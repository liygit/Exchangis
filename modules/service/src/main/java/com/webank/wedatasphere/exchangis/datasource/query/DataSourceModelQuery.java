/*
 *
 *  Copyright 2020 WeBank
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.exchangis.datasource.query;

import com.webank.wedatasphere.exchangis.common.util.page.PageQuery;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author  devendeng on 2018/8/23.
 */
public class DataSourceModelQuery extends PageQuery {
    private int id;
    private String modelName;
    /**
     * For exact query
     */
    private String modelExactName;
    private String sourceType;
    private Date createTimeBegin;
    private Date createTimeEnd;
    private String createUser;
    private String createOwner;
    private Set<String> userDataAuth = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public Date getCreateTimeBegin() {
        return createTimeBegin;
    }

    public void setCreateTimeBegin(Date createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public String getCreateUser() {
        if(StringUtils.isNotBlank(createOwner)){
            return null;
        }
        return createUser;
    }

    public String getCreateOwner() {
        return createOwner;
    }

    public void setCreateOwner(String createOwner) {
        this.createOwner = createOwner;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Set<String> getUserDataAuth() {
        if(StringUtils.isNotBlank(createOwner)){
            HashSet<String> dataAuthSet = new HashSet<>();
            dataAuthSet.add("");
            dataAuthSet.add(createOwner);
            return dataAuthSet;
        }
        return userDataAuth;
    }

    public void setUserDataAuth(Set<String> userDataAuth) {

        this.userDataAuth = userDataAuth;
    }

    public String getModelExactName() {
        return modelExactName;
    }

    public void setModelExactName(String modelExactName) {
        this.modelExactName = modelExactName;
    }

}
