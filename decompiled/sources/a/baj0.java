package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class baj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f2260a;
    public final String b;
    public final boolean c;

    public baj0(double d, String str, boolean z) {
        str.getClass();
        this.f2260a = d;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baj0)) {
            return false;
        }
        baj0 baj0Var = (baj0) obj;
        return Double.compare(this.f2260a, baj0Var.f2260a) == 0 && Intrinsics.d(this.b, baj0Var.b) && this.c == baj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Double.hashCode(this.f2260a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(vqd.s("OneClickBetModel(prefsBetValue=", this.f2260a, ", currencySymbol=", this.b), ", quickBetEnabled=", this.c, Separators.RPAREN);
    }
}
