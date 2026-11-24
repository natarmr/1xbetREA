package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class t0e0 {
    public static final s0e0 Companion = new s0e0();
    public static final a8z[] h = {null, null, null, null, null, null, maz.a(wez.f39042a, new etd0(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33115a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final List g;

    public /* synthetic */ t0e0(int i, Integer num, Long l, String str, String str2, String str3, Boolean bool, List list) {
        if ((i & 1) == 0) {
            this.f33115a = null;
        } else {
            this.f33115a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0e0)) {
            return false;
        }
        t0e0 t0e0Var = (t0e0) obj;
        return Intrinsics.d(this.f33115a, t0e0Var.f33115a) && Intrinsics.d(this.b, t0e0Var.b) && Intrinsics.d(this.c, t0e0Var.c) && Intrinsics.d(this.d, t0e0Var.d) && Intrinsics.d(this.e, t0e0Var.e) && Intrinsics.d(this.f, t0e0Var.f) && Intrinsics.d(this.g, t0e0Var.g);
    }

    public final int hashCode() {
        Integer num = this.f33115a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f33115a, this.b, "RainbowStatisticMatchesTeamResponse(id=", ", feedId=", ", name=");
        f140.v(sbM, this.c, ", country=", this.d, ", image=");
        h97.v(this.f, this.e, ", isPartner=", ", players=", sbM);
        return dw9.r(sbM, this.g, Separators.RPAREN);
    }
}
