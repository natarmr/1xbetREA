package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class u7c0 {
    public static final s7c0 Companion = new s7c0();
    public static final a8z[] k = {null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new npa0(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35178a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final String g;
    public final String h;
    public final Integer i;
    public final List j;

    public /* synthetic */ u7c0(int i, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Integer num3, List list) {
        if ((i & 1) == 0) {
            this.f35178a = null;
        } else {
            this.f35178a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7c0)) {
            return false;
        }
        u7c0 u7c0Var = (u7c0) obj;
        return Intrinsics.d(this.f35178a, u7c0Var.f35178a) && Intrinsics.d(this.b, u7c0Var.b) && Intrinsics.d(this.c, u7c0Var.c) && Intrinsics.d(this.d, u7c0Var.d) && Intrinsics.d(this.e, u7c0Var.e) && Intrinsics.d(this.f, u7c0Var.f) && Intrinsics.d(this.g, u7c0Var.g) && Intrinsics.d(this.h, u7c0Var.h) && Intrinsics.d(this.i, u7c0Var.i) && Intrinsics.d(this.j, u7c0Var.j);
    }

    public final int hashCode() {
        String str = this.f35178a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.j;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PromoBrandResponse(imgPathDefault=", this.f35178a, ", imgPathDarkTheme=", this.b, ", imgPathLightTheme=");
        f140.v(sbN, this.c, ", imgBanner=", this.d, ", error=");
        rz4.y(sbN, this.e, ", brandId=", this.f, ", brandName=");
        f140.v(sbN, this.g, ", description=", this.h, ", viewType=");
        sbN.append(this.i);
        sbN.append(", partitions=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
