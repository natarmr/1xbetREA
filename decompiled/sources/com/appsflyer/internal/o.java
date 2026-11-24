package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;
import com.appsflyer.sdk_base.referrer.Referrer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45445a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(Object obj, Object obj2, byte b) {
        this.f45445a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f45445a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                AFe1fSDK.unregisterClient((Referrer) obj2, (AFe1fSDK) obj);
                break;
            case 1:
                ((AFi1aSDK) obj2).AFKeystoreWrapper((Runnable) obj);
                break;
            case 2:
                AFi1bSDK.AFKeystoreWrapper((AFi1bSDK) obj2, (Context) obj);
                break;
            case 3:
                ((AFi1dSDK) obj2).P_((SensorEvent) obj);
                break;
            case 4:
                ((AFi1gSDK) obj2).registerClient((Context) obj);
                break;
            default:
                AFi1iSDK.d((AFi1iSDK) obj2, (Context) obj);
                break;
        }
    }
}
