package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class xhg0 {
    public static final whg0 Companion = new whg0();
    public static final a8z[] j = {maz.a(wez.f39042a, new j6g0(14)), null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40890a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final String g;
    public final String h;
    public final Integer i;

    public /* synthetic */ xhg0(int i, List list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, Integer num6) {
        if ((i & 1) == 0) {
            this.f40890a = null;
        } else {
            this.f40890a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
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
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhg0)) {
            return false;
        }
        xhg0 xhg0Var = (xhg0) obj;
        return Intrinsics.d(this.f40890a, xhg0Var.f40890a) && Intrinsics.d(this.b, xhg0Var.b) && Intrinsics.d(this.c, xhg0Var.c) && Intrinsics.d(this.d, xhg0Var.d) && Intrinsics.d(this.e, xhg0Var.e) && Intrinsics.d(this.f, xhg0Var.f) && Intrinsics.d(this.g, xhg0Var.g) && Intrinsics.d(this.h, xhg0Var.h) && Intrinsics.d(this.i, xhg0Var.i);
    }

    public final int hashCode() {
        List list = this.f40890a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str = this.g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num6 = this.i;
        return iHashCode8 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = cs0.r(this.b, "RowResponse(chessCells=", ", color=", ", draws=", this.f40890a);
        rz4.y(sbR, this.c, ", losses=", this.d, ", numberOfGames=");
        rz4.y(sbR, this.e, ", points=", this.f, ", scoredMissed=");
        f140.v(sbR, this.g, ", team=", this.h, ", wins=");
        return dw9.q(sbR, this.i, Separators.RPAREN);
    }
}
