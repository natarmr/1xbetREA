package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e170 implements j170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f7025a;

    public e170(ql5 ql5Var) {
        this.f7025a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e170) && this.f7025a.equals(((e170) obj).f7025a);
    }

    public final int hashCode() {
        return this.f7025a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f7025a, "OnNewBalanceSelect(balance=", Separators.RPAREN);
    }
}
