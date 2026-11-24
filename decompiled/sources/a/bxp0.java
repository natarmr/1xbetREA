package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bxp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ixp0 f3384a;

    public bxp0(ixp0 ixp0Var) {
        this.f3384a = ixp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxp0) && this.f3384a.equals(((bxp0) obj).f3384a);
    }

    public final int hashCode() {
        return this.f3384a.hashCode();
    }

    public final String toString() {
        return "Header(row=" + this.f3384a + Separators.RPAREN;
    }
}
