package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class dhs {
    public static final chs Companion = new chs();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f6105a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;

    public /* synthetic */ dhs(int i, Long l, String str, String str2, Integer num, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3) {
        if ((i & 1) == 0) {
            this.f6105a = null;
        } else {
            this.f6105a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhs)) {
            return false;
        }
        dhs dhsVar = (dhs) obj;
        return Intrinsics.d(this.f6105a, dhsVar.f6105a) && Intrinsics.d(this.b, dhsVar.b) && Intrinsics.d(this.c, dhsVar.c) && Intrinsics.d(this.d, dhsVar.d) && Intrinsics.d(this.e, dhsVar.e) && Intrinsics.d(this.f, dhsVar.f) && Intrinsics.d(this.g, dhsVar.g) && Intrinsics.d(this.h, dhsVar.h) && Intrinsics.d(this.i, dhsVar.i);
    }

    public final int hashCode() {
        Long l = this.f6105a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.i;
        return iHashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f6105a, "GameItemResponse(gameId=", ", name=", this.b, ", img=");
        axq.x(this.d, this.c, ", productId=", ", productName=", sbS);
        f140.v(sbS, this.e, ", productImg=", this.f, ", noLoyalty=");
        defpackage.c.j(sbS, this.g, ", needTransfer=", this.h, ", isDemoAvailable=");
        return defpackage.c.e(sbS, this.i, Separators.RPAREN);
    }
}
