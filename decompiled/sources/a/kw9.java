package a;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class kw9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18990a;
    public final /* synthetic */ lw9 b;

    public /* synthetic */ kw9(lw9 lw9Var, byte b) {
        this.f18990a = b;
        this.b = lw9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objP0;
        Object objP1;
        byte b = this.f18990a;
        boolean z = false;
        lw9 lw9Var = this.b;
        switch (b) {
            case 0:
                String str = ((Object) g0a.b(lw9Var.f20754a)) + "#availableCaptureRequestKeys";
                try {
                    try {
                        Trace.beginSection(str);
                        if (Build.VERSION.SDK_INT >= 33) {
                            Set availableCaptureRequestKeys = lw9Var.c.getAvailableCaptureRequestKeys(lw9Var.b);
                            availableCaptureRequestKeys.getClass();
                            objP0 = CollectionsKt.P0(availableCaptureRequestKeys);
                        } else {
                            objP0 = xun.f41520a;
                        }
                        if (objP0 == null) {
                            objP0 = xun.f41520a;
                            break;
                        }
                        return objP0;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    Log.w("CXCP", "Failed to get " + str + "! Caching {} and ignoring exception.", th);
                    return xun.f41520a;
                }
            case 1:
                String str2 = ((Object) g0a.b(lw9Var.f20754a)) + "#availableCaptureResultKeys";
                try {
                    try {
                        Trace.beginSection(str2);
                        if (Build.VERSION.SDK_INT >= 33) {
                            Set availableCaptureResultKeys = lw9Var.c.getAvailableCaptureResultKeys(lw9Var.b);
                            availableCaptureResultKeys.getClass();
                            objP1 = CollectionsKt.P0(availableCaptureResultKeys);
                        } else {
                            objP1 = xun.f41520a;
                        }
                        if (objP1 == null) {
                            objP1 = xun.f41520a;
                            break;
                        }
                        return objP1;
                    } catch (Throwable th2) {
                        Log.w("CXCP", "Failed to get " + str2 + "! Caching {} and ignoring exception.", th2);
                        return xun.f41520a;
                    }
                } finally {
                    Trace.endSection();
                }
            case 2:
                String str3 = ((Object) g0a.b(lw9Var.f20754a)) + "#isPostviewSupported";
                try {
                    try {
                        Trace.beginSection(str3);
                        boolean zIsPostviewAvailable = Build.VERSION.SDK_INT >= 34 ? lw9Var.c.isPostviewAvailable(lw9Var.b) : false;
                        Trace.endSection();
                        z = zIsPostviewAvailable;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                    break;
                } catch (Throwable th4) {
                    Log.w("CXCP", "Failed to get " + str3 + "! Caching false and ignoring exception.", th4);
                }
                return Boolean.valueOf(z);
            default:
                String str4 = ((Object) g0a.b(lw9Var.f20754a)) + "#isCaptureProgressSupported";
                try {
                    try {
                        Trace.beginSection(str4);
                        boolean zIsCaptureProcessProgressAvailable = Build.VERSION.SDK_INT >= 34 ? lw9Var.c.isCaptureProcessProgressAvailable(lw9Var.b) : false;
                        Trace.endSection();
                        z = zIsCaptureProcessProgressAvailable;
                        break;
                    } catch (Throwable th5) {
                        Log.w("CXCP", "Failed to get " + str4 + "! Caching false and ignoring exception.", th5);
                    }
                    return Boolean.valueOf(z);
                } catch (Throwable th6) {
                    Trace.endSection();
                    throw th6;
                }
        }
    }
}
