package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o8s0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24847a;
    public final zrm b;
    public final boolean c;

    public o8s0(long j, zrm zrmVar, boolean z) {
        this.f24847a = j;
        this.b = zrmVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8s0)) {
            return false;
        }
        o8s0 o8s0Var = (o8s0) obj;
        return this.f24847a == o8s0Var.f24847a && this.b.equals(o8s0Var.b) && this.c == o8s0Var.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return String.valueOf(this.f24847a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.f24847a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentUiItem(id=");
        sb.append(this.f24847a);
        sb.append(", model=");
        sb.append(this.b);
        return f140.n(sb, ", favorite=", this.c, Separators.RPAREN);
    }
}
