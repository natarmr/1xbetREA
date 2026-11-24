package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class h0g0 extends fww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0s0 f12234a;

    public h0g0(y0s0 y0s0Var) {
        this.f12234a = y0s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0g0) && this.f12234a.equals(((h0g0) obj).f12234a);
    }

    public final int hashCode() {
        return this.f12234a.hashCode();
    }

    public final String toString() {
        return "Success(successValue=" + this.f12234a + Separators.RPAREN;
    }
}
