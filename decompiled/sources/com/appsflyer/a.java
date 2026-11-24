package com.appsflyer;

import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45424a;
    public final /* synthetic */ LogTag b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ a(LogTag logTag, String str, boolean z, byte b) {
        this.f45424a = b;
        this.b = logTag;
        this.c = str;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f45424a) {
            case 0:
                return AFLogger.AFKeystoreWrapper(this.b, this.c, this.d, (AFLoggerBase) obj);
            case 1:
                return AFLogger.d(this.b, this.c, this.d, (AFLoggerBase) obj);
            case 2:
                return AFLogger.AFLogger(this.b, this.c, this.d, (AFLoggerBase) obj);
            default:
                return AFLogger.registerClient(this.b, this.c, this.d, (AFLoggerBase) obj);
        }
    }
}
