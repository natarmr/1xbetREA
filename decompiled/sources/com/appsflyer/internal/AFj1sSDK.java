package com.appsflyer.internal;

import a.e0g0;
import a.g0g0;
import a.j0g0;
import a.kng0;
import a.sgy;
import a.sre0;
import a.tre0;
import a.tx3;
import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.ConcurrentModificationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1sSDK {
    private final Intent AFKeystoreWrapper;

    public AFj1sSDK(Intent intent) {
        intent.getClass();
        this.AFKeystoreWrapper = intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AFKeystoreWrapper(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.getStringExtra(str);
    }

    private final <T> T AFLogger(Function0<? extends T> function0, String str, T t, boolean z) {
        Object g0g0Var;
        Object obj;
        Object g0g0Var2;
        Object obj2;
        Object obj3;
        synchronized (this.AFKeystoreWrapper) {
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = function0.invoke();
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            tre0 tre0Var = sre0.f32672a;
            sgy[] sgyVarArr = {tre0Var.b(ConcurrentModificationException.class), tre0Var.b(ArrayIndexOutOfBoundsException.class)};
            Throwable thA = j0g0.a(g0g0Var);
            if (thA == null) {
                obj2 = t;
                g0g0Var2 = g0g0Var;
            } else {
                try {
                    try {
                        if (!tx3.u(tre0Var.b(thA.getClass()), sgyVarArr)) {
                            throw thA;
                        }
                        if (z) {
                            T t2 = t;
                            g0g0Var2 = AFLogger(function0, str, t2, false);
                            obj2 = t2;
                        } else {
                            T t3 = t;
                            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, str, thA, false, false, false, false, 72, null);
                            g0g0Var2 = t3;
                            obj2 = t3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = tre0Var;
                        e0g0 e0g0Var3 = j0g0.b;
                        g0g0Var2 = new g0g0(th);
                        obj2 = obj;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = t;
                }
            }
            Throwable thA2 = j0g0.a(g0g0Var2);
            if (thA2 == null) {
                obj3 = g0g0Var2;
            } else {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, str, thA2, false, false, false, false, 72, null);
                obj3 = (T) obj2;
            }
        }
        return (T) obj3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Parcelable U_(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.getParcelableExtra(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent V_(AFj1sSDK aFj1sSDK, String str, long j) {
        return aFj1sSDK.AFKeystoreWrapper.putExtra(str, j);
    }

    public final <T extends Parcelable> T S_(String str) {
        str.getClass();
        return (T) AFLogger(new c0(this, str, (byte) 0), kng0.l("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final Intent T_(final String str, final long j) {
        str.getClass();
        return (Intent) AFLogger(new Function0() { // from class: com.appsflyer.internal.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFj1sSDK.V_(this.f45435a, str, j);
            }
        }, kng0.l("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final String registerClient(String str) {
        str.getClass();
        return (String) AFLogger(new c0(this, str, (byte) 1), kng0.l("Error while trying to read ", str, " extra from intent"), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerClient(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.hasExtra(str);
    }

    public final boolean AFLogger(String str) {
        str.getClass();
        Boolean bool = (Boolean) AFLogger(new c0(this, str, (byte) 2), kng0.l("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
