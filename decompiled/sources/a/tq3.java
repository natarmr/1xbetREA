package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tq3 {
    public static final sq3 Companion = new sq3();
    public static final a8z[] h = {null, null, null, null, null, null, maz.a(wez.f39042a, new f33(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f34361a;
    public final bg8 b;
    public final Long c;
    public final Double d;
    public final Integer e;
    public final String f;
    public final List g;

    public /* synthetic */ tq3(int i, Long l, bg8 bg8Var, Long l2, Double d, Integer num, String str, List list) {
        if (117 != (i & 117)) {
            m2x.I(i, 117, rq3.f30911a.getDescriptor());
            throw null;
        }
        this.f34361a = l;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bg8Var;
        }
        this.c = l2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        this.e = num;
        this.f = str;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq3)) {
            return false;
        }
        tq3 tq3Var = (tq3) obj;
        return Intrinsics.d(this.f34361a, tq3Var.f34361a) && Intrinsics.d(this.b, tq3Var.b) && Intrinsics.d(this.c, tq3Var.c) && Intrinsics.d(this.d, tq3Var.d) && Intrinsics.d(this.e, tq3Var.e) && Intrinsics.d(this.f, tq3Var.f) && Intrinsics.d(this.g, tq3Var.g);
    }

    public final int hashCode() {
        Long l = this.f34361a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        bg8 bg8Var = this.b;
        int iHashCode2 = (iHashCode + (bg8Var == null ? 0 : bg8Var.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppleFortuneRequest(userId=");
        sb.append(this.f34361a);
        sb.append(", bonusRequest=");
        sb.append(this.b);
        sb.append(", walletId=");
        sb.append(this.c);
        sb.append(", betSum=");
        sb.append(this.d);
        sb.append(", whence=");
        b1j.u(this.e, ", lng=", this.f, ", gameType=", sb);
        return dw9.r(sb, this.g, Separators.RPAREN);
    }

    public tq3(Long l, bg8 bg8Var, Long l2, Double d, Integer num, String str, List list) {
        this.f34361a = l;
        this.b = bg8Var;
        this.c = l2;
        this.d = d;
        this.e = num;
        this.f = str;
        this.g = list;
    }
}
