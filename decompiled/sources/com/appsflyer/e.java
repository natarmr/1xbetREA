package com.appsflyer;

import com.appsflyer.sdk_base.logger.AFLoggerBase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45428a;
    public final /* synthetic */ AFLoggerBase[] b;

    public /* synthetic */ e(AFLoggerBase[] aFLoggerBaseArr, byte b) {
        this.f45428a = b;
        this.b = aFLoggerBaseArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f45428a;
        AFLoggerBase[] aFLoggerBaseArr = this.b;
        switch (b) {
            case 0:
                AFLogger.AFKeystoreWrapper(aFLoggerBaseArr);
                break;
            default:
                AFLogger.AFLogger(aFLoggerBaseArr);
                break;
        }
    }
}
