package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xzm0 implements d0n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0n0 f41760a;

    public xzm0(g0n0 g0n0Var) {
        this.f41760a = g0n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzm0) && this.f41760a.equals(((xzm0) obj).f41760a);
    }

    public final int hashCode() {
        return this.f41760a.hashCode();
    }

    public final String toString() {
        return "OnButtonClick(subSectionButtonItem=" + this.f41760a + Separators.RPAREN;
    }
}
