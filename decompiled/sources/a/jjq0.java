package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class jjq0 {
    public static final djq0 Companion = new djq0();
    public static final a8z[] k = {null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new ozp0(26)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16631a;
    public final Boolean b;
    public final String c;
    public final Long d;
    public final Double e;
    public final Boolean f;
    public final Long g;
    public final Long h;
    public final List i;
    public final u8r j;

    public /* synthetic */ jjq0(int i, Integer num, Boolean bool, String str, Long l, Double d, Boolean bool2, Long l2, Long l3, List list, u8r u8rVar) {
        if ((i & 1) == 0) {
            this.f16631a = null;
        } else {
            this.f16631a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = u8rVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjq0)) {
            return false;
        }
        jjq0 jjq0Var = (jjq0) obj;
        return Intrinsics.d(this.f16631a, jjq0Var.f16631a) && Intrinsics.d(this.b, jjq0Var.b) && Intrinsics.d(this.c, jjq0Var.c) && Intrinsics.d(this.d, jjq0Var.d) && Intrinsics.d(this.e, jjq0Var.e) && Intrinsics.d(this.f, jjq0Var.f) && Intrinsics.d(this.g, jjq0Var.g) && Intrinsics.d(this.h, jjq0Var.h) && Intrinsics.d(this.i, jjq0Var.i) && Intrinsics.d(this.j, jjq0Var.j);
    }

    public final int hashCode() {
        Integer num = this.f16631a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.e;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list = this.i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        u8r u8rVar = this.j;
        return iHashCode9 + (u8rVar != null ? u8rVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimitResponse(limitType=");
        sb.append(this.f16631a);
        sb.append(", freeValue=");
        sb.append(this.b);
        sb.append(", limitState=");
        h97.w(this.d, this.c, ", endsAt=", ", limitValue=", sb);
        sb.append(this.e);
        sb.append(", needApprove=");
        sb.append(this.f);
        sb.append(", pendingValue=");
        cs0.A(sb, this.g, ", pendingEndsAt=", this.h, ", availableValues=");
        sb.append(this.i);
        sb.append(", freeValueConfiguration=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
