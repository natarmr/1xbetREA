package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w040 implements c140 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38332a;
    public final ql5 b;

    public w040(ql5 ql5Var, String str) {
        str.getClass();
        ql5Var.getClass();
        this.f38332a = str;
        this.b = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w040)) {
            return false;
        }
        w040 w040Var = (w040) obj;
        return Intrinsics.d(this.f38332a, w040Var.f38332a) && Intrinsics.d(this.b, w040Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38332a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowChangeBalanceConfirmDialog(dialogMessage=" + this.f38332a + ", balance=" + this.b + Separators.RPAREN;
    }
}
