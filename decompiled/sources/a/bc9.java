package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bc9 {
    public static final ac9 Companion = new ac9();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f2344a;
    public final List b;
    public final List c;
    public final Long d;
    public final Boolean e;
    public final String f;
    public final Integer g;

    static {
        wez wezVar = wez.f39042a;
        h = new a8z[]{null, maz.a(wezVar, new ej8((byte) 15)), maz.a(wezVar, new ej8((byte) 16)), null, null, null, null};
    }

    public /* synthetic */ bc9(int i, Long l, List list, List list2, Long l2, Boolean bool, String str, Integer num) {
        if ((i & 1) == 0) {
            this.f2344a = null;
        } else {
            this.f2344a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc9)) {
            return false;
        }
        bc9 bc9Var = (bc9) obj;
        return Intrinsics.d(this.f2344a, bc9Var.f2344a) && Intrinsics.d(this.b, bc9Var.b) && Intrinsics.d(this.c, bc9Var.c) && Intrinsics.d(this.d, bc9Var.d) && Intrinsics.d(this.e, bc9Var.e) && Intrinsics.d(this.f, bc9Var.f) && Intrinsics.d(this.g, bc9Var.g);
    }

    public final int hashCode() {
        Long l = this.f2344a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuilderCouponResponse(id=");
        sb.append(this.f2344a);
        sb.append(", events=");
        sb.append(this.b);
        sb.append(", games=");
        sb.append(this.c);
        sb.append(", sportId=");
        sb.append(this.d);
        sb.append(", block=");
        defpackage.c.h(this.e, ", exceptionText=", this.f, ", exceptionId=", sb);
        return dw9.q(sb, this.g, Separators.RPAREN);
    }
}
