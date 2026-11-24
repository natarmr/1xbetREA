package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jx30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17283a;
    public final xdk0 b;

    public jx30(String str, xdk0 xdk0Var) {
        this.f17283a = str;
        this.b = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx30)) {
            return false;
        }
        jx30 jx30Var = (jx30) obj;
        return this.f17283a.equals(jx30Var.f17283a) && this.b.equals(jx30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17283a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnackBar(betId=" + this.f17283a + ", snackBarModel=" + this.b + Separators.RPAREN;
    }
}
