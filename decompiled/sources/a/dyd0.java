package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class dyd0 {
    public static final cyd0 Companion = new cyd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6886a;
    public final Integer b;
    public final Integer c;
    public final gyd0 d;
    public final Integer e;

    public /* synthetic */ dyd0(int i, String str, Integer num, Integer num2, gyd0 gyd0Var, Integer num3) {
        if ((i & 1) == 0) {
            this.f6886a = null;
        } else {
            this.f6886a = str;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = gyd0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyd0)) {
            return false;
        }
        dyd0 dyd0Var = (dyd0) obj;
        return Intrinsics.d(this.f6886a, dyd0Var.f6886a) && Intrinsics.d(this.b, dyd0Var.b) && Intrinsics.d(this.c, dyd0Var.c) && this.d == dyd0Var.d && Intrinsics.d(this.e, dyd0Var.e);
    }

    public final int hashCode() {
        String str = this.f6886a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        gyd0 gyd0Var = this.d;
        int iHashCode4 = (iHashCode3 + (gyd0Var == null ? 0 : gyd0Var.hashCode())) * 31;
        Integer num3 = this.e;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "RainbowSixStatisticMapDraftResponse(name=", this.f6886a, ", chosenTeam=", ", number=");
        sbP.append(this.c);
        sbP.append(", draftType=");
        sbP.append(this.d);
        sbP.append(", mapWinner=");
        return dw9.q(sbP, this.e, Separators.RPAREN);
    }
}
