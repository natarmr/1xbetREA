package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ogl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pfl0 f25226a;
    public final hn8 b;

    public ogl0(pfl0 pfl0Var, hn8 hn8Var) {
        this.f25226a = pfl0Var;
        this.b = hn8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogl0)) {
            return false;
        }
        ogl0 ogl0Var = (ogl0) obj;
        return this.f25226a.equals(ogl0Var.f25226a) && this.b.equals(ogl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25226a.hashCode() * 31);
    }

    public final String toString() {
        return "SportItemsUiState(contentState=" + this.f25226a + ", bottomBarState=" + this.b + Separators.RPAREN;
    }
}
