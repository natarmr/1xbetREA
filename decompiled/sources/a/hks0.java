package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hks0 extends iks0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13223a;
    public final mdm b;

    public hks0(long j, mdm mdmVar) {
        this.f13223a = j;
        this.b = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hks0)) {
            return false;
        }
        hks0 hks0Var = (hks0) obj;
        return this.f13223a == hks0Var.f13223a && this.b.equals(hks0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f13223a) * 31);
    }

    public final String toString() {
        return "Error(subSportId=" + this.f13223a + ", errorConfig=" + this.b + Separators.RPAREN;
    }
}
