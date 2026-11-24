package org.xplatform.services.mobile_services.impl.presentation.services;

import a.fr30;
import a.n5d0;
import a.w940;

/* JADX INFO: loaded from: classes5.dex */
public final class HuaweiMessagingService_MembersInjector implements fr30 {
    private final n5d0 messagingServiceHandlerProvider;

    private HuaweiMessagingService_MembersInjector(n5d0 n5d0Var) {
        this.messagingServiceHandlerProvider = n5d0Var;
    }

    public static fr30 create(n5d0 n5d0Var) {
        return new HuaweiMessagingService_MembersInjector(n5d0Var);
    }

    public static void injectMessagingServiceHandler(HuaweiMessagingService huaweiMessagingService, w940 w940Var) {
        huaweiMessagingService.messagingServiceHandler = w940Var;
    }

    public void injectMembers(HuaweiMessagingService huaweiMessagingService) {
        injectMessagingServiceHandler(huaweiMessagingService, (w940) this.messagingServiceHandlerProvider.get());
    }
}
