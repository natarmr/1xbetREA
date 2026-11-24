package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class byg0 {
    public static final ayg0 Companion = new ayg0();
    public static final a8z[] n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3416a;
    public final String b;
    public final List c;
    public final Integer d;
    public final Integer e;
    public final Long f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Double j;
    public final Boolean k;
    public final List l;
    public final List m;

    static {
        wez wezVar = wez.f39042a;
        n = new a8z[]{null, null, maz.a(wezVar, new j6g0((byte) 28)), null, null, null, null, null, null, null, null, maz.a(wezVar, new j6g0((byte) 29)), maz.a(wezVar, new yxg0((byte) 0))};
    }

    public /* synthetic */ byg0(int i, String str, String str2, List list, Integer num, Integer num2, Long l, Integer num3, Integer num4, Integer num5, Double d, Boolean bool, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f3416a = null;
        } else {
            this.f3416a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = d;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byg0)) {
            return false;
        }
        byg0 byg0Var = (byg0) obj;
        return Intrinsics.d(this.f3416a, byg0Var.f3416a) && Intrinsics.d(this.b, byg0Var.b) && Intrinsics.d(this.c, byg0Var.c) && Intrinsics.d(this.d, byg0Var.d) && Intrinsics.d(this.e, byg0Var.e) && Intrinsics.d(this.f, byg0Var.f) && Intrinsics.d(this.g, byg0Var.g) && Intrinsics.d(this.h, byg0Var.h) && Intrinsics.d(this.i, byg0Var.i) && Intrinsics.d(this.j, byg0Var.j) && Intrinsics.d(this.k, byg0Var.k) && Intrinsics.d(this.l, byg0Var.l) && Intrinsics.d(this.m, byg0Var.m);
    }

    public final int hashCode() {
        String str = this.f3416a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.i;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d = this.j;
        int iHashCode10 = (iHashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.k;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list2 = this.l;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.m;
        return iHashCode12 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SaveCouponWithoutUserIdRequest(appGuid=", this.f3416a, ", lng=", this.b, ", events=");
        sbN.append(this.c);
        sbN.append(", partner=");
        sbN.append(this.d);
        sbN.append(", source=");
        cs0.w(this.e, this.f, ", expressNum=", ", vid=", sbN);
        rz4.y(sbN, this.g, ", cfView=", this.h, ", checkCf=");
        hne.z(sbN, this.i, ", antiExpressCoef=", this.j, ", withLobby=");
        sbN.append(this.k);
        sbN.append(", eventsIndexes=");
        sbN.append(this.l);
        sbN.append(", minBetSystems=");
        return dw9.r(sbN, this.m, Separators.RPAREN);
    }

    public byg0(String str, String str2, ArrayList arrayList, Integer num, Integer num2, Long l, Integer num3, Integer num4, Integer num5, Double d, Boolean bool, List list, ArrayList arrayList2) {
        this.f3416a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = num;
        this.e = num2;
        this.f = l;
        this.g = num3;
        this.h = num4;
        this.i = num5;
        this.j = d;
        this.k = bool;
        this.l = list;
        this.m = arrayList2;
    }
}
