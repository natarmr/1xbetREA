package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pq80 implements rq80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijl f27403a;
    public final jjl b;

    public pq80(ijl ijlVar, jjl jjlVar) {
        ijlVar.getClass();
        this.f27403a = ijlVar;
        this.b = jjlVar;
    }

    @Override // a.rq80
    public final ijl a() {
        return this.f27403a;
    }

    @Override // a.rq80
    public final jjl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq80)) {
            return false;
        }
        pq80 pq80Var = (pq80) obj;
        return this.f27403a == pq80Var.f27403a && this.b.equals(pq80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27403a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(style=" + this.f27403a + ", model=" + this.b + Separators.RPAREN;
    }
}
