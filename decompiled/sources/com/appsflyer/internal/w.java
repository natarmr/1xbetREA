package com.appsflyer.internal;

import com.appsflyer.sdk_base.referrer.ReferrerProp;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45450a;
    public final /* synthetic */ AFi1aSDK b;
    public final /* synthetic */ ReferrerProp c;

    public /* synthetic */ w(AFi1aSDK aFi1aSDK, ReferrerProp referrerProp, byte b) {
        this.f45450a = b;
        this.b = aFi1aSDK;
        this.c = referrerProp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f45450a;
        ReferrerProp referrerProp = this.c;
        AFi1aSDK aFi1aSDK = this.b;
        switch (b) {
            case 0:
                aFi1aSDK.AFLogger(referrerProp);
                break;
            default:
                aFi1aSDK.registerClient(referrerProp);
                break;
        }
    }
}
