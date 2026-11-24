package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class j7n0 {
    public static final i7n0 Companion = new i7n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f16050a;
    public final Boolean b;
    public final g7n0 c;
    public final Double d;
    public final Double e;
    public final String f;
    public final Boolean g;
    public final d7n0 h;

    public /* synthetic */ j7n0(int i, Long l, Boolean bool, g7n0 g7n0Var, Double d, Double d2, String str, Boolean bool2, d7n0 d7n0Var) {
        if ((i & 1) == 0) {
            this.f16050a = null;
        } else {
            this.f16050a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = g7n0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d7n0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7n0)) {
            return false;
        }
        j7n0 j7n0Var = (j7n0) obj;
        return Intrinsics.d(this.f16050a, j7n0Var.f16050a) && Intrinsics.d(this.b, j7n0Var.b) && Intrinsics.d(this.c, j7n0Var.c) && Intrinsics.d(this.d, j7n0Var.d) && Intrinsics.d(this.e, j7n0Var.e) && Intrinsics.d(this.f, j7n0Var.f) && Intrinsics.d(this.g, j7n0Var.g) && Intrinsics.d(this.h, j7n0Var.h);
    }

    public final int hashCode() {
        Long l = this.f16050a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        g7n0 g7n0Var = this.c;
        int iHashCode3 = (iHashCode2 + (g7n0Var == null ? 0 : g7n0Var.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        d7n0 d7n0Var = this.h;
        return iHashCode7 + (d7n0Var != null ? d7n0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionEventResponse(type=");
        sb.append(this.f16050a);
        sb.append(", blocked=");
        sb.append(this.b);
        sb.append(", player=");
        sb.append(this.c);
        sb.append(", parameter=");
        sb.append(this.d);
        sb.append(", cf=");
        ua80.w(sb, this.e, ", cfView=", this.f, ", isCenter=");
        sb.append(this.g);
        sb.append(", eventParamsResponse=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
