package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class jb9 {
    public static final ib9 Companion = new ib9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f16227a;
    public final Double b;
    public final String c;
    public final Long d;
    public final String e;
    public final Boolean f;

    public /* synthetic */ jb9(int i, Long l, Double d, String str, Long l2, String str2, Boolean bool) {
        if ((i & 1) == 0) {
            this.f16227a = null;
        } else {
            this.f16227a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb9)) {
            return false;
        }
        jb9 jb9Var = (jb9) obj;
        return Intrinsics.d(this.f16227a, jb9Var.f16227a) && Intrinsics.d(this.b, jb9Var.b) && Intrinsics.d(this.c, jb9Var.c) && Intrinsics.d(this.d, jb9Var.d) && Intrinsics.d(this.e, jb9Var.e) && Intrinsics.d(this.f, jb9Var.f);
    }

    public final int hashCode() {
        Long l = this.f16227a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuilderCouponEventResponse(type=");
        sb.append(this.f16227a);
        sb.append(", param=");
        sb.append(this.b);
        sb.append(", coef=");
        h97.w(this.d, this.c, ", player=", ", playerName=", sb);
        sb.append(this.e);
        sb.append(", blocked=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
