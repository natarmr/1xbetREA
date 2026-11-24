package a;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.AbstractDoubleTimeSource;

/* JADX INFO: loaded from: classes2.dex */
public final class b2 implements wcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f1831a;
    public final AbstractDoubleTimeSource b;
    public final long c;

    public b2(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
        abstractDoubleTimeSource.getClass();
        this.f1831a = d;
        this.b = abstractDoubleTimeSource;
        this.c = j;
    }

    @Override // kotlin.time.TimeMark
    public final long a() {
        ibc.u0(this.b.b() - this.f1831a, null);
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return ntb.E(this, (wcd) obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b2)) {
            return false;
        }
        if (!this.b.equals(((b2) obj).b)) {
            return false;
        }
        g((wcd) obj);
        wen.b.getClass();
        return wen.d(0L, 0L);
    }

    @Override // a.wcd
    public final long g(wcd wcdVar) {
        wcdVar.getClass();
        if (wcdVar instanceof b2) {
            b2 b2Var = (b2) wcdVar;
            long j = b2Var.c;
            if (this.b.equals(b2Var.b)) {
                long j2 = this.c;
                if (wen.d(j2, j) && wen.i(j2)) {
                    wen.b.getClass();
                    return 0L;
                }
                wen.j(j2, j);
                ibc.u0(this.f1831a - b2Var.f1831a, null);
                throw null;
            }
        }
        itt0.l("Subtracting or comparing time marks from different time sources is not possible: ", this, " and ", wcdVar);
        return 0L;
    }

    @Override // a.wcd
    public final /* bridge */ int h(wcd wcdVar) {
        return ntb.E(this, wcdVar);
    }

    @Override // a.wcd
    public final int hashCode() {
        ibc.u0(this.f1831a, null);
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
