package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vaj0 implements kbj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f37091a;

    public final boolean equals(Object obj) {
        if (obj instanceof vaj0) {
            return Intrinsics.d(this.f37091a, ((vaj0) obj).f37091a);
        }
        return false;
    }

    public final int hashCode() {
        ql5 ql5Var = this.f37091a;
        if (ql5Var == null) {
            return 0;
        }
        return ql5Var.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f37091a, "OnBalanceSelected(value=", Separators.RPAREN);
    }
}
