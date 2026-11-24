package a;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class mwk implements nwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f22507a;

    public mwk(ScheduledFuture scheduledFuture) {
        this.f22507a = scheduledFuture;
    }

    @Override // a.nwk
    public final void a() {
        this.f22507a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f22507a + ']';
    }
}
