package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y3s0 implements z3s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41968a;
    public final String b;
    public final String c;

    public y3s0(String str, String str2, String str3) {
        n12 n12Var = n12.f22727a;
        brm0.B(str, str2, str3);
        this.f41968a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3s0)) {
            return false;
        }
        y3s0 y3s0Var = (y3s0) obj;
        if (!Intrinsics.d(this.f41968a, y3s0Var.f41968a) || !Intrinsics.d(this.b, y3s0Var.b) || !Intrinsics.d(this.c, y3s0Var.c)) {
            return false;
        }
        n12 n12Var = n12.f22727a;
        return true;
    }

    public final int hashCode() {
        return n12.b.hashCode() + ua80.b(ua80.b(this.f41968a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        n12 n12Var = n12.b;
        StringBuilder sbN = b1j.n("ShowDialog(title=", this.f41968a, ", text=", this.b, ", positiveButtonText=");
        sbN.append(this.c);
        sbN.append(", alertType=");
        sbN.append(n12Var);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
