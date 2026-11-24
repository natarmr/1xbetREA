package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n1f {
    public static final k1f Companion = new k1f();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f22748a;
    public final Double b;
    public final String c;
    public final Double d;
    public final Integer e;
    public final List f;
    public final bc9 g;

    static {
        ac9 ac9Var = bc9.Companion;
        h = new a8z[]{null, null, null, null, null, maz.a(wez.f39042a, new yld((byte) 25)), null};
    }

    public /* synthetic */ n1f(int i, Long l, Double d, String str, Double d2, Integer num, List list, bc9 bc9Var) {
        if ((i & 1) == 0) {
            this.f22748a = null;
        } else {
            this.f22748a = l;
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
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bc9Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1f)) {
            return false;
        }
        n1f n1fVar = (n1f) obj;
        return Intrinsics.d(this.f22748a, n1fVar.f22748a) && Intrinsics.d(this.b, n1fVar.b) && Intrinsics.d(this.c, n1fVar.c) && Intrinsics.d(this.d, n1fVar.d) && Intrinsics.d(this.e, n1fVar.e) && Intrinsics.d(this.f, n1fVar.f) && Intrinsics.d(this.g, n1fVar.g);
    }

    public final int hashCode() {
        Long l = this.f22748a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.d;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        bc9 bc9Var = this.g;
        return iHashCode6 + (bc9Var != null ? bc9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CouponResponse(walletId=");
        sb.append(this.f22748a);
        sb.append(", coef=");
        sb.append(this.b);
        sb.append(", coefView=");
        sb.append(this.c);
        sb.append(", summ=");
        sb.append(this.d);
        sb.append(", couponType=");
        cs0.z(sb, this.e, ", events=", this.f, ", builderCoupon=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
