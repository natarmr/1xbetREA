package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class wdq0 {
    public static final vdq0 Companion = new vdq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f38986a;
    public final Integer b;
    public final Integer c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;

    public /* synthetic */ wdq0(int i, Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Boolean bool3) {
        if ((i & 1) == 0) {
            this.f38986a = null;
        } else {
            this.f38986a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdq0)) {
            return false;
        }
        wdq0 wdq0Var = (wdq0) obj;
        return Intrinsics.d(this.f38986a, wdq0Var.f38986a) && Intrinsics.d(this.b, wdq0Var.b) && Intrinsics.d(this.c, wdq0Var.c) && Intrinsics.d(this.d, wdq0Var.d) && Intrinsics.d(this.e, wdq0Var.e) && Intrinsics.d(this.f, wdq0Var.f);
    }

    public final int hashCode() {
        Integer num = this.f38986a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("TieBreakResponse(scoreOne=", this.f38986a, ", scoreTwo=", this.b, ", server=");
        brm0.z(this.d, this.c, ", isLostServer=", ", isSetPoint=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", isMatchPoint=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
