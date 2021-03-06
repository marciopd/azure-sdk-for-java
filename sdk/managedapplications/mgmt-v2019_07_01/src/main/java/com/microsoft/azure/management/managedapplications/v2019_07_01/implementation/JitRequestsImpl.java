/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.managedapplications.v2019_07_01.JitRequests;
import com.microsoft.azure.management.managedapplications.v2019_07_01.JitRequestDefinition;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class JitRequestsImpl extends GroupableResourcesCoreImpl<JitRequestDefinition, JitRequestDefinitionImpl, JitRequestDefinitionInner, JitRequestsInner, ManagedApplicationsManager>  implements JitRequests {
    protected JitRequestsImpl(ManagedApplicationsManager manager) {
        super(manager.inner().jitRequests(), manager);
    }

    @Override
    protected Observable<JitRequestDefinitionInner> getInnerAsync(String resourceGroupName, String name) {
        JitRequestsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        JitRequestsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<JitRequestDefinition> listByResourceGroup(String resourceGroupName) {
        JitRequestsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<JitRequestDefinition> listByResourceGroupAsync(String resourceGroupName) {
        JitRequestsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<JitRequestDefinitionInner>, Observable<JitRequestDefinitionInner>>() {
            @Override
            public Observable<JitRequestDefinitionInner> call(Page<JitRequestDefinitionInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<JitRequestDefinitionInner, JitRequestDefinition>() {
            @Override
            public JitRequestDefinition call(JitRequestDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<JitRequestDefinition> list() {
        JitRequestsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<JitRequestDefinition> listAsync() {
        JitRequestsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<JitRequestDefinitionInner>, Observable<JitRequestDefinitionInner>>() {
            @Override
            public Observable<JitRequestDefinitionInner> call(Page<JitRequestDefinitionInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<JitRequestDefinitionInner, JitRequestDefinition>() {
            @Override
            public JitRequestDefinition call(JitRequestDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public JitRequestDefinitionImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected JitRequestDefinitionImpl wrapModel(JitRequestDefinitionInner inner) {
        return  new JitRequestDefinitionImpl(inner.name(), inner, manager());
    }

    @Override
    protected JitRequestDefinitionImpl wrapModel(String name) {
        return new JitRequestDefinitionImpl(name, new JitRequestDefinitionInner(), this.manager());
    }

}
