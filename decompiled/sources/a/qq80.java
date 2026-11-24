package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qq80 implements rq80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijl f29153a;
    public final jjl b;

    public qq80(ijl ijlVar, jjl jjlVar) {
        ijlVar.getClass();
        this.f29153a = ijlVar;
        this.b = jjlVar;
    }

    @Override // a.rq80
    public final ijl a() {
        return this.f29153a;
    }

    @Override // a.rq80
    public final jjl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq80)) {
            return false;
        }
        qq80 qq80Var = (qq80) obj;
        return this.f29153a == qq80Var.f29153a && this.b.equals(qq80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29153a.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(style=" + this.f29153a + ", model=" + this.b + Separators.RPAREN;
    }
}
