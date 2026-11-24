package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class fbc0 {
    public static final ebc0 Companion = new ebc0();
    public static final a8z[] g = {null, null, null, maz.a(wez.f39042a, new cbc0(0)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9250a;
    public final Long b;
    public final Integer c;
    public final List d;
    public final Integer e;
    public final Integer f;

    public /* synthetic */ fbc0(int i, Integer num, Long l, Integer num2, List list, Integer num3, Integer num4) {
        if ((i & 1) == 0) {
            this.f9250a = null;
        } else {
            this.f9250a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbc0)) {
            return false;
        }
        fbc0 fbc0Var = (fbc0) obj;
        return Intrinsics.d(this.f9250a, fbc0Var.f9250a) && Intrinsics.d(this.b, fbc0Var.b) && Intrinsics.d(this.c, fbc0Var.c) && Intrinsics.d(this.d, fbc0Var.d) && Intrinsics.d(this.e, fbc0Var.e) && Intrinsics.d(this.f, fbc0Var.f);
    }

    public final int hashCode() {
        Integer num = this.f9250a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f9250a, this.b, "PromoCmsGetPromotionDrawResponse(drawId=", ", date=", ", unitId=");
        cs0.z(sbM, this.c, ", unitTypeIds=", this.d, ", isRating=");
        return ua80.l(sbM, this.e, ", isResultDraw=", this.f, Separators.RPAREN);
    }
}
