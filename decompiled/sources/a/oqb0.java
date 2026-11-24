package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class oqb0 {
    public static final nqb0 Companion = new nqb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f25681a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final String h;

    public /* synthetic */ oqb0(int i, Integer num, Integer num2, Integer num3, String str, Integer num4, Integer num5, Integer num6, String str2) {
        if ((i & 1) == 0) {
            this.f25681a = null;
        } else {
            this.f25681a = num;
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
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqb0)) {
            return false;
        }
        oqb0 oqb0Var = (oqb0) obj;
        return Intrinsics.d(this.f25681a, oqb0Var.f25681a) && Intrinsics.d(this.b, oqb0Var.b) && Intrinsics.d(this.c, oqb0Var.c) && Intrinsics.d(this.d, oqb0Var.d) && Intrinsics.d(this.e, oqb0Var.e) && Intrinsics.d(this.f, oqb0Var.f) && Intrinsics.d(this.g, oqb0Var.g) && Intrinsics.d(this.h, oqb0Var.h);
    }

    public final int hashCode() {
        Integer num = this.f25681a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.g;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str2 = this.h;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("PowerOfPowerTableResponse(baseDestroyed=", this.f25681a, ", deaths=", this.b, ", kills=");
        b1j.u(this.c, ", playerName=", this.d, ", place=", sbQ);
        rz4.y(sbQ, this.e, ", planted=", this.f, ", defused=");
        sbQ.append(this.g);
        sbQ.append(", lifetime=");
        sbQ.append(this.h);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
