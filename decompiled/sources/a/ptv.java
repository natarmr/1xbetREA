package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ptv implements ttv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3a0 f27583a;
    public final lgp0 b;
    public final boolean c;

    public ptv(z3a0 z3a0Var, lgp0 lgp0Var, boolean z) {
        this.f27583a = z3a0Var;
        this.b = lgp0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptv)) {
            return false;
        }
        ptv ptvVar = (ptv) obj;
        return this.f27583a.equals(ptvVar.f27583a) && this.b == ptvVar.b && this.c == ptvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f27583a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnPlayerClick(player=");
        sb.append(this.f27583a);
        sb.append(", pagerModel=");
        sb.append(this.b);
        sb.append(", isChecked=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
