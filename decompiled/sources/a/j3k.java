package a;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j3k implements n3k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15838a;
    public final /* synthetic */ m3k b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ j3k(m3k m3kVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, byte b) {
        this.f15838a = b;
        this.b = m3kVar;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // a.n3k
    public final ScheduledFuture a(prc prcVar) {
        byte b = this.f15838a;
        Runnable runnable = this.c;
        m3k m3kVar = this.b;
        switch (b) {
            case 0:
                return m3kVar.b.scheduleAtFixedRate(new k3k(m3kVar, runnable, prcVar, (byte) 0), this.d, this.e, this.f);
            default:
                return m3kVar.b.scheduleWithFixedDelay(new k3k(m3kVar, runnable, prcVar, (byte) 2), this.d, this.e, this.f);
        }
    }
}
