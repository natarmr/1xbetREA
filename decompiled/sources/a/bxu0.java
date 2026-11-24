package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class bxu0 implements dxu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f3393a;
    public final String b;

    public bxu0(String str, double d) {
        str.getClass();
        this.f3393a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxu0)) {
            return false;
        }
        bxu0 bxu0Var = (bxu0) obj;
        return Double.compare(this.f3393a, bxu0Var.f3393a) == 0 && Intrinsics.d(this.b, bxu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f3393a) * 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("MinInputAmount(amount=", this.f3393a, ", currency=", this.b);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
