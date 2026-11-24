package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class lyd0 {
    public static final kyd0 Companion = new kyd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20857a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ lyd0(int i, Integer num, Integer num2, String str) {
        if ((i & 1) == 0) {
            this.f20857a = null;
        } else {
            this.f20857a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyd0)) {
            return false;
        }
        lyd0 lyd0Var = (lyd0) obj;
        return Intrinsics.d(this.f20857a, lyd0Var.f20857a) && Intrinsics.d(this.b, lyd0Var.b) && Intrinsics.d(this.c, lyd0Var.c);
    }

    public final int hashCode() {
        String str = this.f20857a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(axq.p(this.b, "RainbowSixStatisticMapResponse(name=", this.f20857a, ", firstTeamScore=", ", secondTeamScore="), this.c, Separators.RPAREN);
    }
}
