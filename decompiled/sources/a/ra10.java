package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ra10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30112a;
    public final int b;
    public final int c;
    public final Function0 d;
    public final long e;

    public ra10(int i, int i2, int i3, Function0 function0, long j) {
        this.f30112a = i;
        this.b = i2;
        this.c = i3;
        this.d = function0;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra10)) {
            return false;
        }
        ra10 ra10Var = (ra10) obj;
        return this.f30112a == ra10Var.f30112a && this.b == ra10Var.b && this.c == ra10Var.c && Intrinsics.d(this.d, ra10Var.d) && this.e == ra10Var.e;
    }

    public final int hashCode() {
        int iA = twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f30112a) * 31, 31), 31);
        Function0 function0 = this.d;
        return Long.hashCode(this.e) + ((iA + (function0 == null ? 0 : function0.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("LottieConfig(lottie=", this.f30112a, ", message=", ", buttonMessage=", this.b);
        sbT.append(this.c);
        sbT.append(", onButtonClick=");
        sbT.append(this.d);
        sbT.append(", countDownTimeMillis=");
        return brm0.k(this.e, Separators.RPAREN, sbT);
    }
}
