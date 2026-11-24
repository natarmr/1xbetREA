package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class s9v0 {
    public static final r9v0 Companion = new r9v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f31867a;
    public final Integer b;
    public final Long c;
    public final String d;
    public final Double e;

    public /* synthetic */ s9v0(int i, Long l, Integer num, Long l2, String str, Double d) {
        if ((i & 1) == 0) {
            this.f31867a = null;
        } else {
            this.f31867a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9v0)) {
            return false;
        }
        s9v0 s9v0Var = (s9v0) obj;
        return Intrinsics.d(this.f31867a, s9v0Var.f31867a) && Intrinsics.d(this.b, s9v0Var.b) && Intrinsics.d(this.c, s9v0Var.c) && Intrinsics.d(this.d, s9v0Var.d) && Intrinsics.d(this.e, s9v0Var.e);
    }

    public final int hashCode() {
        Long l = this.f31867a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.e;
        return iHashCode4 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f31867a, "WheelBonusResponse(bonusId=", ", bonusType=", ", gameTypeId=");
        rz4.v(this.c, ", bonusDescription=", this.d, ", freeBetSum=", sbQ);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
