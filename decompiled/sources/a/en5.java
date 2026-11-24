package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class en5 implements gn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f8075a;

    public en5(ql5 ql5Var) {
        ql5Var.getClass();
        this.f8075a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof en5) && Intrinsics.d(this.f8075a, ((en5) obj).f8075a);
    }

    public final int hashCode() {
        return this.f8075a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f8075a, "Content(balance=", Separators.RPAREN);
    }
}
