package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f5y implements k5y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f8984a;

    public f5y(a8q0 a8q0Var) {
        this.f8984a = a8q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5y) && this.f8984a.equals(((f5y) obj).f8984a);
    }

    public final int hashCode() {
        return this.f8984a.hashCode();
    }

    public final String toString() {
        return "OnBetFieldValueChange(inputValue=" + this.f8984a + Separators.RPAREN;
    }
}
