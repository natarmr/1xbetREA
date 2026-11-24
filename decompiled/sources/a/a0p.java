package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0p extends b0p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f35a;

    public a0p(ql5 ql5Var) {
        ql5Var.getClass();
        this.f35a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0p) && Intrinsics.d(this.f35a, ((a0p) obj).f35a);
    }

    public final int hashCode() {
        return this.f35a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f35a, "UpdateBalance(balance=", Separators.RPAREN);
    }
}
