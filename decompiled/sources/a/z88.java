package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class z88 {
    public static final y88 Companion = new y88();
    public static final a8z[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f43954a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final List e;
    public final String f;
    public final List g;
    public final String h;

    static {
        wez wezVar = wez.f39042a;
        i = new a8z[]{null, null, null, null, maz.a(wezVar, new os7((byte) 20)), null, maz.a(wezVar, new os7((byte) 21)), null};
    }

    public /* synthetic */ z88(int i2, Integer num, String str, Integer num2, Integer num3, List list, String str2, List list2, String str3) {
        if ((i2 & 1) == 0) {
            this.f43954a = null;
        } else {
            this.f43954a = num;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z88)) {
            return false;
        }
        z88 z88Var = (z88) obj;
        return Intrinsics.d(this.f43954a, z88Var.f43954a) && Intrinsics.d(this.b, z88Var.b) && Intrinsics.d(this.c, z88Var.c) && Intrinsics.d(this.d, z88Var.d) && Intrinsics.d(this.e, z88Var.e) && Intrinsics.d(this.f, z88Var.f) && Intrinsics.d(this.g, z88Var.g) && Intrinsics.d(this.h, z88Var.h);
    }

    public final int hashCode() {
        Integer num = this.f43954a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.g;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f43954a, "BlockPrizeResponse(blockCount=", ", buttonText=", this.b, ", clientDistributionType=");
        rz4.y(sbN, this.c, ", clientShowType=", this.d, ", crmItems=");
        h97.y(", description=", this.f, ", items=", sbN, this.e);
        sbN.append(this.g);
        sbN.append(", title=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
