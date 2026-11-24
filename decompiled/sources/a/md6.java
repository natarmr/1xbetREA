package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class md6 {
    public static final ld6 Companion = new ld6();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21582a;
    public final String b;
    public final List c;
    public final String d;
    public final List e;
    public final String f;
    public final Boolean g;
    public final String h;
    public final Integer i;
    public final Integer j;

    static {
        wez wezVar = wez.f39042a;
        k = new a8z[]{null, null, maz.a(wezVar, new o85((byte) 24)), null, maz.a(wezVar, new o85((byte) 25)), null, null, null, null, null};
    }

    public /* synthetic */ md6(int i, Long l, String str, List list, String str2, List list2, String str3, Boolean bool, String str4, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f21582a = null;
        } else {
            this.f21582a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md6)) {
            return false;
        }
        md6 md6Var = (md6) obj;
        return Intrinsics.d(this.f21582a, md6Var.f21582a) && Intrinsics.d(this.b, md6Var.b) && Intrinsics.d(this.c, md6Var.c) && Intrinsics.d(this.d, md6Var.d) && Intrinsics.d(this.e, md6Var.e) && Intrinsics.d(this.f, md6Var.f) && Intrinsics.d(this.g, md6Var.g) && Intrinsics.d(this.h, md6Var.h) && Intrinsics.d(this.i, md6Var.i) && Intrinsics.d(this.j, md6Var.j);
    }

    public final int hashCode() {
        Long l = this.f21582a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        return iHashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f21582a, "BetAdditionalInfoResponse(sport=", ", champName=", this.b, ", opp1Images=");
        h97.y(", opp1Name=", this.d, ", opp2Images=", sbS, this.c);
        h97.y(", opp2Name=", this.f, ", isFinished=", sbS, this.e);
        defpackage.c.h(this.g, ", score=", this.h, ", teamNumber=", sbS);
        return ua80.l(sbS, this.i, ", oppNumber=", this.j, Separators.RPAREN);
    }
}
