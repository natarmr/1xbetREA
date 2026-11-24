package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i1m0 implements j1m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1m0 f14006a;

    public i1m0(a1m0 a1m0Var) {
        this.f14006a = a1m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1m0) && this.f14006a.equals(((i1m0) obj).f14006a);
    }

    public final int hashCode() {
        return this.f14006a.hashCode();
    }

    public final String toString() {
        return "Single(model=" + this.f14006a + Separators.RPAREN;
    }
}
