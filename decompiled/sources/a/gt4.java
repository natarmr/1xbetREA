package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gt4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11863a;
    public final int b;
    public final double c;
    public final String d;

    public gt4(double d, int i, String str, String str2) {
        str.getClass();
        this.f11863a = str;
        this.b = i;
        this.c = d;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt4)) {
            return false;
        }
        gt4 gt4Var = (gt4) obj;
        return Intrinsics.d(this.f11863a, gt4Var.f11863a) && this.b == gt4Var.b && Double.compare(this.c, gt4Var.c) == 0 && this.d.equals(gt4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.d(this.c, twn.a(this.b, this.f11863a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "AuthenticatorTimer(timerId=", this.f11863a, ", timeLeft=", ", timerRatio=");
        hne.w(sbP, this.c, ", timeText=", this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
