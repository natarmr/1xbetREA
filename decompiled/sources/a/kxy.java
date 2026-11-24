package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kxy implements oxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19082a;
    public final js0 b;

    public kxy(long j, js0 js0Var) {
        this.f19082a = j;
        this.b = js0Var;
    }

    @Override // a.oxy
    public final long a() {
        return this.b.f17026a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxy)) {
            return false;
        }
        kxy kxyVar = (kxy) obj;
        return this.f19082a == kxyVar.f19082a && this.b.equals(kxyVar.b);
    }

    @Override // a.oxy
    public final long getDate() {
        return this.f19082a;
    }

    public final int hashCode() {
        return Long.hashCode(this.b.f17026a) + (Long.hashCode(this.f19082a) * 31);
    }

    public final String toString() {
        return "AggregatorGame(date=" + this.f19082a + ", game=" + this.b + Separators.RPAREN;
    }
}
