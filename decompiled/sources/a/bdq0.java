package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class bdq0 {
    public static final adq0 Companion = new adq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2412a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final vcq0 e;

    public /* synthetic */ bdq0(int i, Integer num, Integer num2, Integer num3, Integer num4, vcq0 vcq0Var) {
        if ((i & 1) == 0) {
            this.f2412a = null;
        } else {
            this.f2412a = num;
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
            this.d = num4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = vcq0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdq0)) {
            return false;
        }
        bdq0 bdq0Var = (bdq0) obj;
        return Intrinsics.d(this.f2412a, bdq0Var.f2412a) && Intrinsics.d(this.b, bdq0Var.b) && Intrinsics.d(this.c, bdq0Var.c) && Intrinsics.d(this.d, bdq0Var.d) && this.e == bdq0Var.e;
    }

    public final int hashCode() {
        Integer num = this.f2412a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        vcq0 vcq0Var = this.e;
        return iHashCode4 + (vcq0Var != null ? vcq0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("ThrowResponse(x=", this.f2412a, ", y=", this.b, ", sectorValue=");
        rz4.y(sbQ, this.c, ", throwValue=", this.d, ", throwFactor=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
