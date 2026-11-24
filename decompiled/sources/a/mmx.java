package a;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class mmx extends nav {
    public static final yzn0 l = new yzn0("IdentityCredentials.API", new kmx(0), new qek0());
    public static final yzn0 m = new yzn0("ClientNotification.API", new kmx(3), new qek0());
    public static final yzn0 n = new yzn0("ClientTelemetry.API", new kmx(4), new qek0());
    public static final qek0 o = new qek0();
    public static final kmx p = new kmx(8);
    public static final yzn0 q = new yzn0("CloudMessaging.API", new kmx(9), new qek0());
    public static byte r = 1;

    public Task c(TelemetryData telemetryData) {
        euo0 euo0VarA = s9w0.a();
        euo0VarA.d = new Feature[]{ro4.h};
        euo0VarA.c = true;
        euo0VarA.b = false;
        euo0VarA.f8431a = new drm0(telemetryData);
        return b(2, euo0VarA.a());
    }

    public synchronized int d() {
        byte b;
        try {
            b = r;
            if (b == 1) {
                Context context = this.f23210a;
                oav oavVar = oav.e;
                int iC = oavVar.c(context, 12451000);
                if (iC == 0) {
                    b = 4;
                    r = (byte) 4;
                } else if (oavVar.a(context, iC, null) != null || ogn.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    b = 2;
                    r = (byte) 2;
                } else {
                    b = 3;
                    r = (byte) 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }
}
