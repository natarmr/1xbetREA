package a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class mfq extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21706a;

    public mfq(Context context) {
        this.f21706a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (nfq.k) {
            try {
                Iterator it = ((ex3) nfq.l.values()).iterator();
                while (it.hasNext()) {
                    ((nfq) it.next()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21706a.unregisterReceiver(this);
    }
}
