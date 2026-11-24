package com.appsflyer.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45434a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, byte b) {
        this.f45434a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45434a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((AFa1tSDK) obj).registerClient();
            case 1:
                return AFc1gSDK.q_((AFc1gSDK) obj);
            case 2:
                return AFf1uSDK.AFLogger((AFc1bSDK) obj);
            default:
                return AFf1uSDK.d((AFf1uSDK) obj);
        }
    }
}
