package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j3y implements m3y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f15858a;

    public j3y(a8q0 a8q0Var) {
        this.f15858a = a8q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3y) && this.f15858a.equals(((j3y) obj).f15858a);
    }

    public final int hashCode() {
        return this.f15858a.hashCode();
    }

    public final String toString() {
        return "ValueChange(inputValue=" + this.f15858a + Separators.RPAREN;
    }
}
