package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class ijq0 {
    public static final cjq0 Companion = new cjq0();
    public static final a8z[] j = {null, null, null, null, null, null, null, maz.a(wez.f39042a, new ozp0(25)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f14888a;
    public final Long b;
    public final Integer c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final String g;
    public final List h;
    public final Boolean i;

    public /* synthetic */ ijq0(int i, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str, List list, Boolean bool4) {
        if ((i & 1) == 0) {
            this.f14888a = null;
        } else {
            this.f14888a = num;
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
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijq0)) {
            return false;
        }
        ijq0 ijq0Var = (ijq0) obj;
        return Intrinsics.d(this.f14888a, ijq0Var.f14888a) && Intrinsics.d(this.b, ijq0Var.b) && Intrinsics.d(this.c, ijq0Var.c) && Intrinsics.d(this.d, ijq0Var.d) && Intrinsics.d(this.e, ijq0Var.e) && Intrinsics.d(this.f, ijq0Var.f) && Intrinsics.d(this.g, ijq0Var.g) && Intrinsics.d(this.h, ijq0Var.h) && Intrinsics.d(this.i, ijq0Var.i);
    }

    public final int hashCode() {
        Integer num = this.f14888a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool4 = this.i;
        return iHashCode8 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f14888a, this.b, "TimeLimitResponse(limitType=", ", endsAt=", ", limitValue=");
        brm0.z(this.d, this.c, ", freeValue=", ", changeAvailable=", sbM);
        defpackage.c.j(sbM, this.e, ", deleteAvailable=", this.f, ", limitState=");
        cs0.y(this.g, ", availableValues=", ", setWithoutValue=", sbM, this.h);
        return defpackage.c.e(sbM, this.i, Separators.RPAREN);
    }
}
