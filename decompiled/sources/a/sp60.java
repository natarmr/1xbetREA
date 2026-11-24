package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sp60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f32576a;

    public sp60(ql5 ql5Var) {
        this.f32576a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sp60) && this.f32576a.equals(((sp60) obj).f32576a);
    }

    public final int hashCode() {
        return this.f32576a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f32576a, "OnSelectBalanceClicked(balance=", Separators.RPAREN);
    }
}
