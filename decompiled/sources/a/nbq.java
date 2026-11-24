package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class nbq {
    public static final mbq Companion = new mbq();
    public static final a8z[] q = {null, maz.a(wez.f39042a, new v9q(2)), null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f23254a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final Integer g;
    public final String h;
    public final Long i;
    public final Long j;
    public final String k;
    public final Integer l;
    public final Boolean m;
    public final Boolean n;
    public final int o;
    public final int p;

    public /* synthetic */ nbq(int i, Double d, List list, Integer num, Integer num2, Integer num3, String str, Integer num4, String str2, Long l, Long l2, String str3, Integer num5, Boolean bool, Boolean bool2, int i2, int i3) {
        if (65535 != (i & 65535)) {
            m2x.I(i, 65535, lbq.f19763a.getDescriptor());
            throw null;
        }
        this.f23254a = d;
        this.b = list;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = str;
        this.g = num4;
        this.h = str2;
        this.i = l;
        this.j = l2;
        this.k = str3;
        this.l = num5;
        this.m = bool;
        this.n = bool2;
        this.o = i2;
        this.p = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbq)) {
            return false;
        }
        nbq nbqVar = (nbq) obj;
        return Intrinsics.d(this.f23254a, nbqVar.f23254a) && Intrinsics.d(this.b, nbqVar.b) && Intrinsics.d(this.c, nbqVar.c) && Intrinsics.d(this.d, nbqVar.d) && Intrinsics.d(this.e, nbqVar.e) && Intrinsics.d(this.f, nbqVar.f) && Intrinsics.d(this.g, nbqVar.g) && Intrinsics.d(this.h, nbqVar.h) && Intrinsics.d(this.i, nbqVar.i) && Intrinsics.d(this.j, nbqVar.j) && Intrinsics.d(this.k, nbqVar.k) && Intrinsics.d(this.l, nbqVar.l) && Intrinsics.d(this.m, nbqVar.m) && Intrinsics.d(this.n, nbqVar.n) && this.o == nbqVar.o && this.p == nbqVar.p;
    }

    public final int hashCode() {
        Double d = this.f23254a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.i;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.j;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num5 = this.l;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n;
        return Integer.hashCode(this.p) + twn.a(this.o, (iHashCode13 + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinanceBetRequest(sum=");
        sb.append(this.f23254a);
        sb.append(", betEvents=");
        sb.append(this.b);
        sb.append(", source=");
        rz4.y(sb, this.c, ", partner=", this.d, ", vid=");
        b1j.u(this.e, ", lng=", this.f, ", checkCF=", sb);
        b1j.u(this.g, ", promoCode=", this.h, ", userId=", sb);
        cs0.A(sb, this.i, ", userBonusId=", this.j, ", appGUID=");
        axq.x(this.l, this.k, ", cfView=", ", approvedBet=", sb);
        defpackage.c.j(sb, this.m, ", notWait=", this.n, ", oneClickBet=");
        return w6x.o(this.o, this.p, ", specialTypes=", Separators.RPAREN, sb);
    }

    public nbq(Double d, List list, Integer num, Integer num2, String str, Integer num3, String str2, Long l, Long l2, String str3, Integer num4, Boolean bool, int i, int i2) {
        Boolean bool2 = Boolean.TRUE;
        this.f23254a = d;
        this.b = list;
        this.c = num;
        this.d = num2;
        this.e = 0;
        this.f = str;
        this.g = num3;
        this.h = str2;
        this.i = l;
        this.j = l2;
        this.k = str3;
        this.l = num4;
        this.m = bool;
        this.n = bool2;
        this.o = i;
        this.p = i2;
    }
}
