package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class uy30 implements wy30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f36470a;
    public final long b;
    public final long c;

    public uy30(iz30 iz30Var, long j, long j2) {
        this.f36470a = iz30Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy30)) {
            return false;
        }
        uy30 uy30Var = (uy30) obj;
        return this.f36470a == uy30Var.f36470a && this.b == uy30Var.b && this.c == uy30Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(this.f36470a.hashCode() * 31, 31, this.b);
    }

    @Override // a.wy30
    public final iz30 m() {
        return this.f36470a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualClick(menuItemModel=");
        sb.append(this.f36470a);
        sb.append(", id=");
        sb.append(this.b);
        return rw2.n(sb, this.c, ", gameId=", Separators.RPAREN);
    }
}
