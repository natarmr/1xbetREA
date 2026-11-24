package com.appsflyer.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45441a;
    public final /* synthetic */ AFc1aSDK b;

    public /* synthetic */ i(AFc1aSDK aFc1aSDK, byte b) {
        this.f45441a = b;
        this.b = aFc1aSDK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45441a;
        AFc1aSDK aFc1aSDK = this.b;
        switch (b) {
            case 0:
                return aFc1aSDK.t_();
            case 1:
                return aFc1aSDK.AFLogger();
            case 2:
                return aFc1aSDK.enableTCFDataCollection();
            default:
                return aFc1aSDK.setAdditionalData();
        }
    }
}
