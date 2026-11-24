package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c0v0 implements i0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f3542a;

    public c0v0(ql5 ql5Var) {
        this.f3542a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0v0) && this.f3542a.equals(((c0v0) obj).f3542a);
    }

    public final int hashCode() {
        return this.f3542a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f3542a, "ShowAccountActionsDialog(balance=", Separators.RPAREN);
    }
}
