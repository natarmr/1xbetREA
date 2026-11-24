package org.xplatform.services.mobile_services.impl.presentation.services;

import a.fr30;
import a.n5d0;
import a.u940;
import a.w940;

/* JADX INFO: loaded from: classes5.dex */
public final class GoogleMessagingService_MembersInjector implements fr30 {
    private final n5d0 messagingServiceCustomerIOHandlerProvider;
    private final n5d0 messagingServiceHandlerProvider;

    private GoogleMessagingService_MembersInjector(n5d0 n5d0Var, n5d0 n5d0Var2) {
        this.messagingServiceHandlerProvider = n5d0Var;
        this.messagingServiceCustomerIOHandlerProvider = n5d0Var2;
    }

    public static fr30 create(n5d0 n5d0Var, n5d0 n5d0Var2) {
        return new GoogleMessagingService_MembersInjector(n5d0Var, n5d0Var2);
    }

    public static void injectMessagingServiceCustomerIOHandler(GoogleMessagingService googleMessagingService, u940 u940Var) {
        googleMessagingService.messagingServiceCustomerIOHandler = u940Var;
    }

    public static void injectMessagingServiceHandler(GoogleMessagingService googleMessagingService, w940 w940Var) {
        googleMessagingService.messagingServiceHandler = w940Var;
    }

    public void injectMembers(GoogleMessagingService googleMessagingService) {
        injectMessagingServiceHandler(googleMessagingService, (w940) this.messagingServiceHandlerProvider.get());
        injectMessagingServiceCustomerIOHandler(googleMessagingService, (u940) this.messagingServiceCustomerIOHandlerProvider.get());
    }
}
