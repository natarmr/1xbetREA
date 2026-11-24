package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45447a;
    public final /* synthetic */ AFe1wSDK b;
    public final /* synthetic */ AFe1ySDK c;

    public /* synthetic */ q(AFe1wSDK aFe1wSDK, AFe1ySDK aFe1ySDK, byte b) {
        this.f45447a = b;
        this.b = aFe1wSDK;
        this.c = aFe1ySDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f45447a;
        AFe1ySDK aFe1ySDK = this.c;
        AFe1wSDK aFe1wSDK = this.b;
        switch (b) {
            case 0:
                AFe1wSDK.unregisterClient(aFe1wSDK, aFe1ySDK);
                break;
            default:
                AFe1wSDK.AFKeystoreWrapper(aFe1wSDK, aFe1ySDK);
                break;
        }
    }
}
