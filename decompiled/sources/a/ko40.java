package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class ko40 {
    public static final eo40 Companion = new eo40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18613a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final Long e;
    public final Double f;
    public final Boolean g;
    public final Long h;
    public final Long i;
    public final o8r j;

    public /* synthetic */ ko40(int i, Integer num, String str, Boolean bool, String str2, Long l, Double d, Boolean bool2, Long l2, Long l3, o8r o8rVar) {
        if ((i & 1) == 0) {
            this.f18613a = null;
        } else {
            this.f18613a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = o8rVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko40)) {
            return false;
        }
        ko40 ko40Var = (ko40) obj;
        return Intrinsics.d(this.f18613a, ko40Var.f18613a) && Intrinsics.d(this.b, ko40Var.b) && Intrinsics.d(this.c, ko40Var.c) && Intrinsics.d(this.d, ko40Var.d) && Intrinsics.d(this.e, ko40Var.e) && Intrinsics.d(this.f, ko40Var.f) && Intrinsics.d(this.g, ko40Var.g) && Intrinsics.d(this.h, ko40Var.h) && Intrinsics.d(this.i, ko40Var.i) && Intrinsics.d(this.j, ko40Var.j);
    }

    public final int hashCode() {
        Integer num = this.f18613a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.f;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.i;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        o8r o8rVar = this.j;
        return iHashCode9 + (o8rVar != null ? o8rVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f18613a, "MoneyLimitResponse(limitType=", ", currency=", this.b, ", freeValue=");
        defpackage.c.h(this.c, ", limitState=", this.d, ", endsAt=", sbN);
        sbN.append(this.e);
        sbN.append(", limitValue=");
        sbN.append(this.f);
        sbN.append(", needApprove=");
        sbN.append(this.g);
        sbN.append(", pendingValue=");
        sbN.append(this.h);
        sbN.append(", pendingEndsAt=");
        sbN.append(this.i);
        sbN.append(", freeValueConfiguration=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
