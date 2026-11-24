package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lu30 implements cv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f20655a;

    public lu30(ql5 ql5Var) {
        this.f20655a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lu30) && Intrinsics.d(this.f20655a, ((lu30) obj).f20655a);
    }

    public final int hashCode() {
        ql5 ql5Var = this.f20655a;
        if (ql5Var == null) {
            return 0;
        }
        return ql5Var.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f20655a, "OnBalanceSelected(balance=", Separators.RPAREN);
    }
}
