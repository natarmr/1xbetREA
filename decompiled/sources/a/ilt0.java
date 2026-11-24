package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ilt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrd f14996a;

    public ilt0(rrd rrdVar) {
        this.f14996a = rrdVar;
    }

    public final void a(double d, long j) {
        tg5 tg5Var = (tg5) this.f14996a.b;
        ql5 ql5Var = (ql5) tg5Var.f33892a.get(Long.valueOf(j));
        if (ql5Var != null) {
            tg5Var.c(ql5.a(ql5Var, d, null, 0, 8189));
        }
    }
}
