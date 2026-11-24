package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class j0u0 {
    public static final i0u0 Companion = new i0u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f15699a;
    public final Integer b;

    public /* synthetic */ j0u0(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f15699a = null;
        } else {
            this.f15699a = num;
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
        if (!(obj instanceof j0u0)) {
            return false;
        }
        j0u0 j0u0Var = (j0u0) obj;
        return Intrinsics.d(this.f15699a, j0u0Var.f15699a) && Intrinsics.d(this.b, j0u0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f15699a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("ValorantStatisticMatchesEconomyGraphResponse(gold=", this.f15699a, ", round=", this.b, Separators.RPAREN);
    }
}
