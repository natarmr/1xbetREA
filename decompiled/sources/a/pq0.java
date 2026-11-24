package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pq0 implements rq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27395a;
    public final zo0 b;
    public final oq0 c;

    public pq0(String str, zo0 zo0Var, oq0 oq0Var) {
        this.f27395a = str;
        this.b = zo0Var;
        this.c = oq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq0)) {
            return false;
        }
        pq0 pq0Var = (pq0) obj;
        return this.f27395a.equals(pq0Var.f27395a) && this.b.equals(pq0Var.b) && this.c == pq0Var.c;
    }

    @Override // a.rq0
    public final String getId() {
        return this.f27395a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f27395a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shimmer(id=" + this.f27395a + ", position=" + this.b + ", type=" + this.c + Separators.RPAREN;
    }
}
