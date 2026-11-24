package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x0y implements d1y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f40094a;

    public x0y(a8q0 a8q0Var) {
        this.f40094a = a8q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0y) && this.f40094a.equals(((x0y) obj).f40094a);
    }

    public final int hashCode() {
        return this.f40094a.hashCode();
    }

    public final String toString() {
        return "OnBetFieldValueChange(inputValue=" + this.f40094a + Separators.RPAREN;
    }
}
