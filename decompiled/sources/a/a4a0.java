package a;

import android.media.metrics.LogSessionId;
import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes.dex */
public final class a4a0 {
    public static final a4a0 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214a;
    public final yox b;

    static {
        new a4a0("");
        c = new a4a0(Payload.TYPE_PRELOAD);
    }

    public a4a0(String str) {
        yox yoxVar;
        this.f214a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            yoxVar = new yox();
            yoxVar.f43005a = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            yoxVar = null;
        }
        this.b = yoxVar;
    }

    public final synchronized LogSessionId a() {
        yox yoxVar;
        yoxVar = this.b;
        yoxVar.getClass();
        return (LogSessionId) yoxVar.f43005a;
    }
}
