package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kt80 implements mt80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijl f18851a;
    public final jjl b;

    public kt80(ijl ijlVar, jjl jjlVar) {
        ijlVar.getClass();
        this.f18851a = ijlVar;
        this.b = jjlVar;
    }

    @Override // a.mt80
    public final ijl a() {
        return this.f18851a;
    }

    @Override // a.mt80
    public final jjl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt80)) {
            return false;
        }
        kt80 kt80Var = (kt80) obj;
        return this.f18851a == kt80Var.f18851a && this.b.equals(kt80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18851a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(style=" + this.f18851a + ", model=" + this.b + Separators.RPAREN;
    }
}
