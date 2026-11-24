package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jpl0 implements kpl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16908a;
    public final dnf0 b;

    public jpl0(boolean z, dnf0 dnf0Var) {
        this.f16908a = z;
        this.b = dnf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpl0)) {
            return false;
        }
        jpl0 jpl0Var = (jpl0) obj;
        return this.f16908a == jpl0Var.f16908a && this.b.equals(jpl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f16908a) * 31);
    }

    public final String toString() {
        return "ShowHints(refresh=" + this.f16908a + ", hintState=" + this.b + Separators.RPAREN;
    }
}
