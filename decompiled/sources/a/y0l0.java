package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class y0l0 implements a1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41812a;
    public final rqm b;

    public y0l0(long j, rqm rqmVar) {
        this.f41812a = j;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0l0)) {
            return false;
        }
        y0l0 y0l0Var = (y0l0) obj;
        return this.f41812a == y0l0Var.f41812a && this.b.equals(y0l0Var.b);
    }

    @Override // a.a1l0
    public final Object getId() {
        return Long.valueOf(this.f41812a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f41812a) * 31);
    }

    public final String toString() {
        return "DataItem(id=" + this.f41812a + ", value=" + this.b + Separators.RPAREN;
    }
}
