package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class q3h0 {
    public static final p3h0 Companion = new p3h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f28053a;
    public final Integer b;

    public /* synthetic */ q3h0(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f28053a = null;
        } else {
            this.f28053a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3h0)) {
            return false;
        }
        q3h0 q3h0Var = (q3h0) obj;
        return Intrinsics.d(this.f28053a, q3h0Var.f28053a) && Intrinsics.d(this.b, q3h0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f28053a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("ScorePairResponse(scoreOpp1=", this.f28053a, ", scoreOpp2=", this.b, Separators.RPAREN);
    }
}
