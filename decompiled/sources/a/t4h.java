package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class t4h {
    public static final s4h Companion = new s4h();
    public static final a8z[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33319a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final List h;
    public final Integer i;
    public final Float j;
    public final List k;

    static {
        wez wezVar = wez.f39042a;
        l = new a8z[]{maz.a(wezVar, new x3h((byte) 3)), maz.a(wezVar, new x3h((byte) 4)), null, null, null, null, null, maz.a(wezVar, new x3h((byte) 5)), null, null, maz.a(wezVar, new x3h((byte) 6))};
    }

    public /* synthetic */ t4h(int i, List list, List list2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, List list3, Integer num6, Float f, List list4) {
        if ((i & 1) == 0) {
            this.f33319a = null;
        } else {
            this.f33319a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
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
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num6;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = f;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4h)) {
            return false;
        }
        t4h t4hVar = (t4h) obj;
        return Intrinsics.d(this.f33319a, t4hVar.f33319a) && Intrinsics.d(this.b, t4hVar.b) && Intrinsics.d(this.c, t4hVar.c) && Intrinsics.d(this.d, t4hVar.d) && Intrinsics.d(this.e, t4hVar.e) && Intrinsics.d(this.f, t4hVar.f) && Intrinsics.d(this.g, t4hVar.g) && Intrinsics.d(this.h, t4hVar.h) && Intrinsics.d(this.i, t4hVar.i) && Intrinsics.d(this.j, t4hVar.j) && Intrinsics.d(this.k, t4hVar.k);
    }

    public final int hashCode() {
        List list = this.f33319a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.g;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List list3 = this.h;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num6 = this.i;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Float f = this.j;
        int iHashCode10 = (iHashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        List list4 = this.k;
        return iHashCode10 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("CyberLolTeamStatisticResponse(heroesStatistics=", ", heroesBanned=", this.f33319a, ", kills=", this.b);
        rz4.y(sbT, this.c, ", towers=", this.d, ", inhibitors=");
        rz4.y(sbT, this.e, ", barons=", this.f, ", dragons=");
        cs0.z(sbT, this.g, ", dragonsDeadType=", this.h, ", side=");
        sbT.append(this.i);
        sbT.append(", goldCount=");
        sbT.append(this.j);
        sbT.append(", goldHistoryList=");
        return dw9.r(sbT, this.k, Separators.RPAREN);
    }
}
