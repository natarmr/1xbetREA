package com.appsflyer.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45433a;
    public final /* synthetic */ AFj1sSDK b;
    public final /* synthetic */ String c;

    public /* synthetic */ c0(AFj1sSDK aFj1sSDK, String str, byte b) {
        this.f45433a = b;
        this.b = aFj1sSDK;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45433a;
        String str = this.c;
        AFj1sSDK aFj1sSDK = this.b;
        switch (b) {
            case 0:
                return AFj1sSDK.U_(aFj1sSDK, str);
            case 1:
                return AFj1sSDK.AFKeystoreWrapper(aFj1sSDK, str);
            default:
                return Boolean.valueOf(AFj1sSDK.registerClient(aFj1sSDK, str));
        }
    }
}
