package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class izl0 {
    public static final hzl0 Companion = new hzl0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z88 f15640a;
    public final Integer b;
    public final Long c;

    static {
        y88 y88Var = z88.Companion;
    }

    public /* synthetic */ izl0(int i, z88 z88Var, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f15640a = null;
        } else {
            this.f15640a = z88Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izl0)) {
            return false;
        }
        izl0 izl0Var = (izl0) obj;
        return Intrinsics.d(this.f15640a, izl0Var.f15640a) && Intrinsics.d(this.b, izl0Var.b) && Intrinsics.d(this.c, izl0Var.c);
    }

    public final int hashCode() {
        z88 z88Var = this.f15640a;
        int iHashCode = (z88Var == null ? 0 : z88Var.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StageItemResponse(blockPrize=");
        sb.append(this.f15640a);
        sb.append(", crmNecessaryPoints=");
        sb.append(this.b);
        sb.append(", crmStageId=");
        return ohs0.r(sb, this.c, Separators.RPAREN);
    }
}
