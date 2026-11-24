package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class mht implements muw {
    public static final lht Companion = new lht();
    public static final a8z[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f21812a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final int g;
    public final double h;
    public final int i;
    public final long j;
    public final long k;
    public final int l;

    static {
        wez wezVar = wez.f39042a;
        m = new a8z[]{null, null, maz.a(wezVar, new tet((byte) 6)), maz.a(wezVar, new tet((byte) 7)), maz.a(wezVar, new tet((byte) 8)), null, null, null, null, null, null, null};
    }

    public /* synthetic */ mht(int i, double d, int i2, List list, List list2, List list3, String str, int i3, double d2, int i4, long j, long j2, int i5) {
        if (4095 != (i & 4095)) {
            m2x.I(i, 4095, kht.f18307a.getDescriptor());
            throw null;
        }
        this.f21812a = d;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = str;
        this.g = i3;
        this.h = d2;
        this.i = i4;
        this.j = j;
        this.k = j2;
        this.l = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mht)) {
            return false;
        }
        mht mhtVar = (mht) obj;
        return Double.compare(this.f21812a, mhtVar.f21812a) == 0 && this.b == mhtVar.b && Intrinsics.d(this.c, mhtVar.c) && Intrinsics.d(this.d, mhtVar.d) && Intrinsics.d(this.e, mhtVar.e) && Intrinsics.d(this.f, mhtVar.f) && this.g == mhtVar.g && Double.compare(this.h, mhtVar.h) == 0 && this.i == mhtVar.i && this.j == mhtVar.j && this.k == mhtVar.k && this.l == mhtVar.l;
    }

    public final int hashCode() {
        int iA = dw9.a(dw9.a(dw9.a(twn.a(this.b, Double.hashCode(this.f21812a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return Integer.hashCode(this.l) + rw2.b(rw2.b(twn.a(this.i, brm0.d(this.h, twn.a(this.g, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenerateCouponRequest(betSize=");
        sb.append(this.f21812a);
        sb.append(", cfView=");
        sb.append(this.b);
        hne.v(", couponTypes=", ", eventTypes=", sb, this.c, this.d);
        sb.append(", sports=");
        sb.append(this.e);
        sb.append(", lng=");
        sb.append(this.f);
        rw2.x(sb, ", partner=", this.g, ", payout=");
        rz4.w(sb, this.h, ", timeFilter=", this.i);
        kng0.A(sb, ", userId=", this.j, ", userIdBonus=");
        ua80.v(sb, this.k, ", countryId=", this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public mht(double d, int i, List list, ArrayList arrayList, ArrayList arrayList2, String str, double d2, int i2, long j, long j2, int i3) {
        list.getClass();
        this.f21812a = d;
        this.b = i;
        this.c = list;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = str;
        this.g = 1;
        this.h = d2;
        this.i = i2;
        this.j = j;
        this.k = j2;
        this.l = i3;
    }
}
