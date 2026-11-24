package a;

/* JADX INFO: loaded from: classes.dex */
public final class sfu0 extends giv {
    public static final rfu0 c = rfu0.c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rfu0 f32133a = rfu0.e;
    public final lhp b = lhp.c;

    @Override // a.giv
    public final lhp a() {
        return this.b;
    }

    @Override // a.giv
    public final boolean b(n0a n0aVar, rrd rrdVar) {
        int iOrdinal = this.f32133a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return n0aVar.t();
        }
        if (iOrdinal == 3) {
            return n0aVar.M();
        }
        t9f.b();
        return false;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.f32133a.name() + ')';
    }
}
