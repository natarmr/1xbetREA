package com.appsflyer.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45440a;
    public final /* synthetic */ AFb1gSDK b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ h(AFb1gSDK aFb1gSDK, Intent intent, byte b) {
        this.f45440a = b;
        this.b = aFb1gSDK;
        this.c = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f45440a;
        Intent intent = this.c;
        AFb1gSDK aFb1gSDK = this.b;
        switch (b) {
            case 0:
                AFb1gSDK.i_(aFb1gSDK, intent);
                break;
            default:
                AFb1gSDK.j_(aFb1gSDK, intent);
                break;
        }
    }
}
