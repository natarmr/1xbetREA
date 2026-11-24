package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nua0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kra0 f24140a;
    public final hn8 b;
    public final qim c;
    public final iua0 d;

    public nua0(kra0 kra0Var, hn8 hn8Var, qim qimVar, iua0 iua0Var) {
        this.f24140a = kra0Var;
        this.b = hn8Var;
        this.c = qimVar;
        this.d = iua0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nua0)) {
            return false;
        }
        nua0 nua0Var = (nua0) obj;
        return this.f24140a.equals(nua0Var.f24140a) && this.b.equals(nua0Var.b) && this.c.equals(nua0Var.c) && this.d.equals(nua0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f24140a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PolybetUiState(contentState=" + this.f24140a + ", bottomBarState=" + this.b + ", headerModel=" + this.c + ", timeFilterChipsUiState=" + this.d + Separators.RPAREN;
    }
}
