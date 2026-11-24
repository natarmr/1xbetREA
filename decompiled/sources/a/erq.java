package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes7.dex */
public final class erq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final brq f8294a;
    public final wxv b;
    public final boolean c;
    public final le60 d;
    public final wqq e;

    public erq(brq brqVar, wxv wxvVar, boolean z, le60 le60Var, wqq wqqVar) {
        this.f8294a = brqVar;
        this.b = wxvVar;
        this.c = z;
        this.d = le60Var;
        this.e = wqqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erq)) {
            return false;
        }
        erq erqVar = (erq) obj;
        return this.f8294a == erqVar.f8294a && this.b == erqVar.b && this.c == erqVar.c && this.d == erqVar.d && this.e.equals(erqVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f8294a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "FoldingFeature(state=" + this.f8294a + ", hingeOrientation=" + this.b + ", isSeparating=" + this.c + ", occlusionType=" + this.d + ", bounds=" + this.e + Separators.RPAREN;
    }
}
