package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cjr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjr0 f4474a;
    public final ijr0 b;
    public final boolean c;

    public cjr0(jjr0 jjr0Var, ijr0 ijr0Var, boolean z) {
        this.f4474a = jjr0Var;
        this.b = ijr0Var;
        this.c = z;
    }

    public static cjr0 a(cjr0 cjr0Var, jjr0 jjr0Var, ijr0 ijr0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            jjr0Var = cjr0Var.f4474a;
        }
        if ((i & 2) != 0) {
            ijr0Var = cjr0Var.b;
        }
        if ((i & 4) != 0) {
            z = cjr0Var.c;
        }
        cjr0Var.getClass();
        return new cjr0(jjr0Var, ijr0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjr0)) {
            return false;
        }
        cjr0 cjr0Var = (cjr0) obj;
        return this.f4474a.equals(cjr0Var.f4474a) && this.b.equals(cjr0Var.b) && this.c == cjr0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f4474a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoBetUiState(totoTopBarState=");
        sb.append(this.f4474a);
        sb.append(", totoOutcomesState=");
        sb.append(this.b);
        sb.append(", isScrollToTopRequested=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
