package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jrm implements lrm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8k0 f17009a;
    public final g8k0 b;

    public jrm(g8k0 g8k0Var, g8k0 g8k0Var2) {
        this.f17009a = g8k0Var;
        this.b = g8k0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrm)) {
            return false;
        }
        jrm jrmVar = (jrm) obj;
        return this.f17009a.equals(jrmVar.f17009a) && this.b.equals(jrmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17009a.hashCode() * 31);
    }

    public final String toString() {
        return "Shown(startLabel=" + this.f17009a + ", endLabel=" + this.b + Separators.RPAREN;
    }
}
