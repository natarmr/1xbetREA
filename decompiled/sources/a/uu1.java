package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uu1 implements xu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36281a;
    public final String b;
    public final String c;

    public uu1(String str, String str2, String str3) {
        n12 n12Var = n12.f22727a;
        brm0.B(str, str2, str3);
        this.f36281a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu1)) {
            return false;
        }
        uu1 uu1Var = (uu1) obj;
        if (!Intrinsics.d(this.f36281a, uu1Var.f36281a) || !Intrinsics.d(this.b, uu1Var.b) || !Intrinsics.d(this.c, uu1Var.c)) {
            return false;
        }
        n12 n12Var = n12.f22727a;
        return true;
    }

    public final int hashCode() {
        return n12.b.hashCode() + ua80.b(ua80.b(this.f36281a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        n12 n12Var = n12.b;
        StringBuilder sbN = b1j.n("ShowDialog(title=", this.f36281a, ", message=", this.b, ", positiveButtonText=");
        sbN.append(this.c);
        sbN.append(", alertType=");
        sbN.append(n12Var);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
