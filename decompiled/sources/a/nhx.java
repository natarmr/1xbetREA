package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nhx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y130 f23557a;

    public nhx(y130 y130Var) {
        this.f23557a = y130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nhx) && this.f23557a.equals(((nhx) obj).f23557a);
    }

    public final int hashCode() {
        return this.f23557a.hashCode();
    }

    public final String toString() {
        return "Markets(internalEffect=" + this.f23557a + Separators.RPAREN;
    }
}
