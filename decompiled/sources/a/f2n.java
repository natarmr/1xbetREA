package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f2n implements h2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2n f8819a;
    public final m2n b;
    public final y1m c;
    public final String d;
    public final boolean e;

    public f2n(m2n m2nVar, m2n m2nVar2, y1m y1mVar, String str, boolean z) {
        this.f8819a = m2nVar;
        this.b = m2nVar2;
        this.c = y1mVar;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2n)) {
            return false;
        }
        f2n f2nVar = (f2n) obj;
        return this.f8819a.equals(f2nVar.f8819a) && this.b.equals(f2nVar.b) && this.c.equals(f2nVar.c) && this.d.equals(f2nVar.d) && this.e == f2nVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f8819a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V3(firstOpponent=");
        sb.append(this.f8819a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", gameLabel=");
        sb.append(this.d);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
