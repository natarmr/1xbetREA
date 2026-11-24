package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c7s0 implements d7s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3880a;
    public final String b;
    public final String c;

    public c7s0(String str, String str2, String str3) {
        n12 n12Var = n12.f22727a;
        brm0.B(str, str2, str3);
        this.f3880a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7s0)) {
            return false;
        }
        c7s0 c7s0Var = (c7s0) obj;
        if (!Intrinsics.d(this.f3880a, c7s0Var.f3880a) || !Intrinsics.d(this.b, c7s0Var.b) || !Intrinsics.d(this.c, c7s0Var.c)) {
            return false;
        }
        n12 n12Var = n12.f22727a;
        return true;
    }

    public final int hashCode() {
        return n12.b.hashCode() + ua80.b(ua80.b(this.f3880a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        n12 n12Var = n12.b;
        StringBuilder sbN = b1j.n("ShowDialog(title=", this.f3880a, ", text=", this.b, ", positiveButtonText=");
        sbN.append(this.c);
        sbN.append(", alertType=");
        sbN.append(n12Var);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
