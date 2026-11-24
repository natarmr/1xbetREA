package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jtq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2m0 f17112a;
    public final String b;

    public jtq(t2m0 t2m0Var, String str) {
        this.f17112a = t2m0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtq)) {
            return false;
        }
        jtq jtqVar = (jtq) obj;
        return this.f17112a == jtqVar.f17112a && this.b.equals(jtqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17112a.hashCode() * 31);
    }

    public final String toString() {
        return "FooterModel(color=" + this.f17112a + ", title=" + this.b + Separators.RPAREN;
    }
}
