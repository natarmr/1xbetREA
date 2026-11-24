package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45437a;
    public final /* synthetic */ AFj1vSDK b;

    public /* synthetic */ e0(AFj1vSDK aFj1vSDK, byte b) {
        this.f45437a = b;
        this.b = aFj1vSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f45437a;
        AFj1vSDK aFj1vSDK = this.b;
        switch (b) {
            case 0:
                aFj1vSDK.w();
                break;
            case 1:
                aFj1vSDK.v();
                break;
            default:
                aFj1vSDK.force();
                break;
        }
    }
}
