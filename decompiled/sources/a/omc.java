package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class omc implements xmc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mw70 f25495a;

    public omc(mw70 mw70Var) {
        this.f25495a = mw70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omc) && this.f25495a.equals(((omc) obj).f25495a);
    }

    public final int hashCode() {
        return this.f25495a.hashCode();
    }

    public final String toString() {
        return "OnChangeOpenTab(state=" + this.f25495a + Separators.RPAREN;
    }
}
