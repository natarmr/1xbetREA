package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gt60 implements tt60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f11866a;

    public gt60(ql5 ql5Var) {
        this.f11866a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt60) && this.f11866a.equals(((gt60) obj).f11866a);
    }

    public final int hashCode() {
        return this.f11866a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f11866a, "OnBalanceSelected(balance=", Separators.RPAREN);
    }
}
