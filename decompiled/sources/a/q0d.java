package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vi9 f27891a;
    public final vi9 b;
    public final vi9 c;

    public q0d(vi9 vi9Var, vi9 vi9Var2, vi9 vi9Var3) {
        this.f27891a = vi9Var;
        this.b = vi9Var2;
        this.c = vi9Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0d)) {
            return false;
        }
        q0d q0dVar = (q0d) obj;
        return this.f27891a == q0dVar.f27891a && this.b == q0dVar.b && this.c == q0dVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f27891a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CoilCachePolicies(disk=" + this.f27891a + ", memory=" + this.b + ", network=" + this.c + Separators.RPAREN;
    }
}
