package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gcj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11065a;
    public final ql5 b;

    public gcj0(ql5 ql5Var, String str) {
        str.getClass();
        ql5Var.getClass();
        this.f11065a = str;
        this.b = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcj0)) {
            return false;
        }
        gcj0 gcj0Var = (gcj0) obj;
        return Intrinsics.d(this.f11065a, gcj0Var.f11065a) && Intrinsics.d(this.b, gcj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11065a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowChangeBalanceConfirmDialog(dialogMessage=" + this.f11065a + ", balance=" + this.b + Separators.RPAREN;
    }
}
