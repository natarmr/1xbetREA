package a;

/* JADX INFO: loaded from: classes2.dex */
public final class plq0 implements wcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27198a;

    public static long b(long j) {
        rq40.f30914a.getClass();
        return (1 | (j - 1)) == Long.MAX_VALUE ? wen.n(xvw.Q(j)) : xvw.W(rq40.b(), j, bfn.NANOSECONDS);
    }

    @Override // kotlin.time.TimeMark
    public final long a() {
        return b(this.f27198a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return ntb.E(this, (wcd) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof plq0) {
            return this.f27198a == ((plq0) obj).f27198a;
        }
        return false;
    }

    @Override // a.wcd
    public final long g(wcd wcdVar) {
        wcdVar.getClass();
        boolean z = wcdVar instanceof plq0;
        long j = this.f27198a;
        if (z) {
            long j2 = ((plq0) wcdVar).f27198a;
            rq40.f30914a.getClass();
            return xvw.X(j, j2, bfn.NANOSECONDS);
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + wcdVar);
    }

    @Override // a.wcd
    public final /* bridge */ int h(wcd wcdVar) {
        return ntb.E(this, wcdVar);
    }

    @Override // a.wcd
    public final int hashCode() {
        return Long.hashCode(this.f27198a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f27198a + ')';
    }
}
