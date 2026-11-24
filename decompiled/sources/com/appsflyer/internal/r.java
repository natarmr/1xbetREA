package com.appsflyer.internal;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45448a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, byte b) {
        this.f45448a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f45448a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                AFe1wSDK.unregisterClient((AFe1ySDK) obj3, (AFd1cSDK) obj2, (AFe1wSDK) obj);
                break;
            case 1:
                AFg1tSDK.AFLogger((AFg1tSDK) obj3, (AFh1pSDK) obj2, (Context) obj);
                break;
            case 2:
                ((AFi1aSDK) obj3).d((ExecutorService) obj2, (Runnable) obj);
                break;
            default:
                ((AFi1aSDK) obj3).AFLogger((AFi1gSDK) obj2, (Runnable) obj);
                break;
        }
    }
}
