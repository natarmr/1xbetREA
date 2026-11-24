package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ikg0 {
    public static final hkg0 Companion = new hkg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f14924a;
    public final Integer b;

    public /* synthetic */ ikg0(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f14924a = null;
        } else {
            this.f14924a = num;
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
        if (!(obj instanceof ikg0)) {
            return false;
        }
        ikg0 ikg0Var = (ikg0) obj;
        return Intrinsics.d(this.f14924a, ikg0Var.f14924a) && Intrinsics.d(this.b, ikg0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f14924a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("RpsRoundResultResponse(figure=", this.f14924a, ", result=", this.b, Separators.RPAREN);
    }
}
