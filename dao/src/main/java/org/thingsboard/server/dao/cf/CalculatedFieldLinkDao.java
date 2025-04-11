/**
 * Copyright © 2016-2025 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.dao.cf;

import org.thingsboard.server.common.data.cf.CalculatedFieldLink;
import org.thingsboard.server.common.data.id.CalculatedFieldId;
import org.thingsboard.server.common.data.id.EntityId;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.common.data.page.PageData;
import org.thingsboard.server.common.data.page.PageLink;
import org.thingsboard.server.dao.Dao;

import java.util.List;

public interface CalculatedFieldLinkDao extends Dao<CalculatedFieldLink> {

    List<CalculatedFieldLink> findCalculatedFieldLinksByCalculatedFieldId(TenantId tenantId, CalculatedFieldId calculatedFieldId);

    List<CalculatedFieldLink> findCalculatedFieldLinksByEntityId(TenantId tenantId, EntityId entityId);

    List<CalculatedFieldLink> findCalculatedFieldLinksByTenantId(TenantId tenantId);

    List<CalculatedFieldLink> findAll();

    PageData<CalculatedFieldLink> findAll(PageLink pageLink);

    PageData<CalculatedFieldLink> findAllByTenantId(TenantId tenantId, PageLink pageLink);

}
