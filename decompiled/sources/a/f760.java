package a;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class f760 extends p4 {
    public CharSequence c;

    @Override // a.p4
    public final void m0(z220 z220Var) {
        new Notification.BigTextStyle((Notification.Builder) z220Var.c).setBigContentTitle(null).bigText(this.c);
    }

    @Override // a.p4
    public final String x0() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
