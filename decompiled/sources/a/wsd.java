package a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class wsd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f39685a;
    public final rwj b;
    public final Executor c;
    public final s2m0 d;
    public final cad e;
    public final std f;

    public wsd(usd usdVar) {
        rwj rwjVar = tvk.f34603a;
        this.f39685a = obb.I(rwjVar.w(Math.max(1, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4))));
        this.b = rwjVar;
        this.c = obb.I(rwjVar);
        this.d = new s2m0();
        this.e = new cad((byte) 12);
        this.f = new std();
    }
}
