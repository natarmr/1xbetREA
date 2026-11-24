package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w6a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y130 f38616a;

    public w6a0(y130 y130Var) {
        this.f38616a = y130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6a0) && this.f38616a.equals(((w6a0) obj).f38616a);
    }

    public final int hashCode() {
        return this.f38616a.hashCode();
    }

    public final String toString() {
        return "Markets(internalEffect=" + this.f38616a + Separators.RPAREN;
    }
}
