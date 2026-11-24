package a;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u1a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34893a;
    public final /* synthetic */ z1a b;

    public /* synthetic */ u1a(z1a z1aVar, rrd rrdVar) {
        this.f34893a = (byte) 1;
        this.b = z1aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f34893a;
        z1a z1aVar = this.b;
        switch (b) {
            case 0:
                Iterator it = z1aVar.k.iterator();
                while (it.hasNext()) {
                    z1aVar.a(((h0a) it.next()).a());
                }
                return;
            case 1:
                Set setP0 = CollectionsKt.P0(z1aVar.k);
                if (setP0.isEmpty()) {
                    return;
                }
                setP0.getClass();
                return;
            default:
                synchronized (z1aVar.d) {
                    try {
                        ScheduledFuture scheduledFuture = z1aVar.e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        l8x.U("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
                        z1aVar.d(3, z1aVar.k);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ u1a(z1a z1aVar, byte b) {
        this.f34893a = b;
        this.b = z1aVar;
    }
}
