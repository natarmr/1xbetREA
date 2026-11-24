package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bz1 implements cz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3443a;
    public final String b;
    public final String c;

    public bz1(String str, String str2, String str3) {
        n12 n12Var = n12.f22727a;
        brm0.B(str, str2, str3);
        this.f3443a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz1)) {
            return false;
        }
        bz1 bz1Var = (bz1) obj;
        if (!Intrinsics.d(this.f3443a, bz1Var.f3443a) || !Intrinsics.d(this.b, bz1Var.b) || !Intrinsics.d(this.c, bz1Var.c)) {
            return false;
        }
        n12 n12Var = n12.f22727a;
        return true;
    }

    public final int hashCode() {
        return n12.b.hashCode() + ua80.b(ua80.b(this.f3443a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        n12 n12Var = n12.b;
        StringBuilder sbN = b1j.n("ShowDialog(title=", this.f3443a, ", message=", this.b, ", positiveButtonText=");
        sbN.append(this.c);
        sbN.append(", alertType=");
        sbN.append(n12Var);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
