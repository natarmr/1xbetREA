package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class pht implements muw {
    public static final oht Companion = new oht();
    public static final a8z[] n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f27013a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;
    public final int h;
    public final double i;
    public final int j;
    public final long k;
    public final long l;
    public final int m;

    static {
        wez wezVar = wez.f39042a;
        n = new a8z[]{null, null, maz.a(wezVar, new tet((byte) 9)), maz.a(wezVar, new tet((byte) 10)), maz.a(wezVar, new tet((byte) 11)), maz.a(wezVar, new tet((byte) 12)), null, null, null, null, null, null, null};
    }

    public /* synthetic */ pht(int i, double d, int i2, List list, List list2, List list3, List list4, String str, int i3, double d2, int i4, long j, long j2, int i5) {
        if (8191 != (i & 8191)) {
            m2x.I(i, 8191, nht.f23551a.getDescriptor());
            throw null;
        }
        this.f27013a = d;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = str;
        this.h = i3;
        this.i = d2;
        this.j = i4;
        this.k = j;
        this.l = j2;
        this.m = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pht)) {
            return false;
        }
        pht phtVar = (pht) obj;
        return Double.compare(this.f27013a, phtVar.f27013a) == 0 && this.b == phtVar.b && Intrinsics.d(this.c, phtVar.c) && Intrinsics.d(this.d, phtVar.d) && Intrinsics.d(this.e, phtVar.e) && Intrinsics.d(this.f, phtVar.f) && Intrinsics.d(this.g, phtVar.g) && this.h == phtVar.h && Double.compare(this.i, phtVar.i) == 0 && this.j == phtVar.j && this.k == phtVar.k && this.l == phtVar.l && this.m == phtVar.m;
    }

    public final int hashCode() {
        int iA = dw9.a(dw9.a(dw9.a(dw9.a(twn.a(this.b, Double.hashCode(this.f27013a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return Integer.hashCode(this.m) + rw2.b(rw2.b(twn.a(this.j, brm0.d(this.i, twn.a(this.h, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenerateCouponRequestTeams(betSize=");
        sb.append(this.f27013a);
        sb.append(", cfView=");
        sb.append(this.b);
        hne.v(", couponTypes=", ", eventTypes=", sb, this.c, this.d);
        hne.v(", sports=", ", teamsList=", sb, this.e, this.f);
        axq.s(this.h, ", lng=", this.g, ", partner=", sb);
        ohs0.A(sb, this.i, ", payout=", ", timeFilter=");
        sb.append(this.j);
        sb.append(", userId=");
        sb.append(this.k);
        kng0.A(sb, ", userIdBonus=", this.l, ", countryId=");
        return rz4.j(this.m, Separators.RPAREN, sb);
    }

    public pht(double d, int i, List list, ArrayList arrayList, ArrayList arrayList2, List list2, String str, double d2, int i2, long j, long j2, int i3) {
        list.getClass();
        list2.getClass();
        this.f27013a = d;
        this.b = i;
        this.c = list;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = list2;
        this.g = str;
        this.h = 1;
        this.i = d2;
        this.j = i2;
        this.k = j;
        this.l = j2;
        this.m = i3;
    }
}
