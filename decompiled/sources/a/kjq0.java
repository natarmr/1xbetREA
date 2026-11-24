package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class kjq0 {
    public static final ejq0 Companion = new ejq0();
    public static final a8z[] l = {null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new ozp0(27)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18400a;
    public final Long b;
    public final Double c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final String h;
    public final List i;
    public final zl j;
    public final Boolean k;

    public /* synthetic */ kjq0(int i, Integer num, Long l2, Double d, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, List list, zl zlVar, Boolean bool5) {
        if ((i & 1) == 0) {
            this.f18400a = null;
        } else {
            this.f18400a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
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
            this.g = bool4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = zlVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjq0)) {
            return false;
        }
        kjq0 kjq0Var = (kjq0) obj;
        return Intrinsics.d(this.f18400a, kjq0Var.f18400a) && Intrinsics.d(this.b, kjq0Var.b) && Intrinsics.d(this.c, kjq0Var.c) && Intrinsics.d(this.d, kjq0Var.d) && Intrinsics.d(this.e, kjq0Var.e) && Intrinsics.d(this.f, kjq0Var.f) && Intrinsics.d(this.g, kjq0Var.g) && Intrinsics.d(this.h, kjq0Var.h) && Intrinsics.d(this.i, kjq0Var.i) && Intrinsics.d(this.j, kjq0Var.j) && Intrinsics.d(this.k, kjq0Var.k);
    }

    public final int hashCode() {
        Integer num = this.f18400a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.g;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str = this.h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        zl zlVar = this.j;
        int iHashCode10 = (iHashCode9 + (zlVar == null ? 0 : zlVar.hashCode())) * 31;
        Boolean bool5 = this.k;
        return iHashCode10 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f18400a, this.b, "TimeLimitResponse(limitType=", ", endsAt=", ", limitValue=");
        sbM.append(this.c);
        sbM.append(", needApprove=");
        sbM.append(this.d);
        sbM.append(", freeValue=");
        defpackage.c.j(sbM, this.e, ", changeAvailable=", this.f, ", deleteAvailable=");
        defpackage.c.h(this.g, ", limitState=", this.h, ", availableValues=", sbM);
        sbM.append(this.i);
        sbM.append(", activeLimitValue=");
        sbM.append(this.j);
        sbM.append(", setWithoutValue=");
        return defpackage.c.e(sbM, this.k, Separators.RPAREN);
    }
}
