package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o670 implements y670 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f24720a;

    public o670(ql5 ql5Var) {
        this.f24720a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o670) && this.f24720a.equals(((o670) obj).f24720a);
    }

    public final int hashCode() {
        return this.f24720a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f24720a, "OnAccountChange(balanceModel=", Separators.RPAREN);
    }
}
