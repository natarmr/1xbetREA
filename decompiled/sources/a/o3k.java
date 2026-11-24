package a;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class o3k extends y4 implements ScheduledFuture {
    public final ScheduledFuture h;

    public o3k(n3k n3kVar) {
        this.h = n3kVar.a(new prc((Object) this, (byte) 25));
    }

    @Override // a.y4
    public final void c() {
        ScheduledFuture scheduledFuture = this.h;
        Object obj = this.f41976a;
        scheduledFuture.cancel((obj instanceof r4) && ((r4) obj).f29810a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.h.getDelay(timeUnit);
    }
}
