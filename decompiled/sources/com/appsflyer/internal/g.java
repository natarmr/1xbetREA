package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45439a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, byte b) {
        this.f45439a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f45439a;
        Object obj = this.b;
        switch (b) {
            case 0:
                AFb1gSDK.registerClient((AFb1gSDK) obj);
                break;
            case 1:
                AFa1tSDK.d((AFc1bSDK) obj);
                break;
            case 2:
                ((AFd1vSDK) obj).unregisterClient();
                break;
            default:
                AFe1wSDK.AFLogger((AFe1wSDK) obj);
                break;
        }
    }
}
