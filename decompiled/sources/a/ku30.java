package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ku30 implements cv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f18895a;

    public ku30(ql5 ql5Var) {
        this.f18895a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku30) && Intrinsics.d(this.f18895a, ((ku30) obj).f18895a);
    }

    public final int hashCode() {
        ql5 ql5Var = this.f18895a;
        if (ql5Var == null) {
            return 0;
        }
        return ql5Var.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f18895a, "OnBalanceComfirmed(balance=", Separators.RPAREN);
    }
}
