package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e0v0 implements i0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f7008a;

    public e0v0(ql5 ql5Var) {
        this.f7008a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0v0) && this.f7008a.equals(((e0v0) obj).f7008a);
    }

    public final int hashCode() {
        return this.f7008a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f7008a, "ShowChangeBalanceDialog(balance=", Separators.RPAREN);
    }
}
