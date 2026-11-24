package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o6b implements q6b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y130 f24725a;

    public o6b(y130 y130Var) {
        this.f24725a = y130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6b) && this.f24725a.equals(((o6b) obj).f24725a);
    }

    public final int hashCode() {
        return this.f24725a.hashCode();
    }

    public final String toString() {
        return "Markets(internalEffect=" + this.f24725a + Separators.RPAREN;
    }
}
