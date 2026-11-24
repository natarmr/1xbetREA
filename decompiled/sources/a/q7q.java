package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q7q implements r7q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f28264a;

    public q7q(ql5 ql5Var) {
        ql5Var.getClass();
        this.f28264a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7q) && Intrinsics.d(this.f28264a, ((q7q) obj).f28264a);
    }

    public final int hashCode() {
        return this.f28264a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f28264a, "UpdatedBalance(balance=", Separators.RPAREN);
    }
}
