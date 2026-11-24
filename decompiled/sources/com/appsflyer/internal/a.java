package com.appsflyer.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45430a;

    public /* synthetic */ a(byte b) {
        this.f45430a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f45430a) {
            case 0:
                return AFa1mSDK.registerClient(obj);
            case 1:
                return AFa1mSDK.d(obj);
            case 2:
                return AFa1mSDK.AFKeystoreWrapper(obj);
            case 3:
                return AFa1mSDK.AFLogger(obj);
            case 4:
                return AFa1mSDK.unregisterClient(obj);
            case 5:
                return AFa1mSDK.i(obj);
            default:
                return AFc1aSDK.AFKeystoreWrapper((String) obj);
        }
    }
}
