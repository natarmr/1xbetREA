package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j4y implements m4y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f15907a;

    public j4y(a8q0 a8q0Var) {
        this.f15907a = a8q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j4y) && this.f15907a.equals(((j4y) obj).f15907a);
    }

    public final int hashCode() {
        return this.f15907a.hashCode();
    }

    public final String toString() {
        return "ValueChange(inputValue=" + this.f15907a + Separators.RPAREN;
    }
}
