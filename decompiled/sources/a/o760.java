package a;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class o760 {
    public static String d;
    public static n760 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24771a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public o760(Context context) {
        this.f24771a = context;
        this.b = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    public final void a(int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.b.notify(null, i, notification);
            return;
        }
        k760 k760Var = new k760(this.f24771a.getPackageName(), i, notification);
        synchronized (f) {
            try {
                n760 n760Var = g;
                if (n760Var == null) {
                    n760Var = new n760(this.f24771a.getApplicationContext());
                    g = n760Var;
                }
                n760Var.b.obtainMessage(0, k760Var).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.cancel(null, i);
    }
}
