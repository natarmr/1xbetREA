package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bdn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y130 f2406a;

    public bdn(y130 y130Var) {
        this.f2406a = y130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdn) && this.f2406a.equals(((bdn) obj).f2406a);
    }

    public final int hashCode() {
        return this.f2406a.hashCode();
    }

    public final String toString() {
        return "Markets(internalEffect=" + this.f2406a + Separators.RPAREN;
    }
}
