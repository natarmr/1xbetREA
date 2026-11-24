package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class db7 implements z47 {
    public static final cb7 Companion = new cb7();
    public static final a8z[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5788a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final List g;
    public final Long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final List l;

    static {
        wez wezVar = wez.f39042a;
        m = new a8z[]{null, null, null, null, null, null, maz.a(wezVar, new t07((byte) 12)), null, null, null, null, maz.a(wezVar, new t07((byte) 13))};
    }

    public /* synthetic */ db7(int i, String str, int i2, long j, long j2, long j3, int i3, List list, Long l, boolean z, boolean z2, boolean z3, List list2) {
        if (3967 != (i & 3967)) {
            m2x.I(i, 3967, bb7.f2294a.getDescriptor());
            throw null;
        }
        this.f5788a = str;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i3;
        this.g = list;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l;
        }
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db7)) {
            return false;
        }
        db7 db7Var = (db7) obj;
        return Intrinsics.d(this.f5788a, db7Var.f5788a) && this.b == db7Var.b && this.c == db7Var.c && this.d == db7Var.d && this.e == db7Var.e && this.f == db7Var.f && Intrinsics.d(this.g, db7Var.g) && Intrinsics.d(this.h, db7Var.h) && this.i == db7Var.i && this.j == db7Var.j && this.k == db7Var.k && Intrinsics.d(this.l, db7Var.l);
    }

    public final int hashCode() {
        int iA = dw9.a(twn.a(this.f, rw2.b(rw2.b(rw2.b(twn.a(this.b, this.f5788a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
        Long l = this.h;
        return this.l.hashCode() + brm0.e(brm0.e(brm0.e((iA + (l == null ? 0 : l.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "BetInfoHistoryWithSummaryByDatesWithBetTypesRequest(language=", this.f5788a, ", cfView=", ", userBonusId=");
        sbP.append(this.c);
        kng0.A(sbP, ", dateFrom=", this.d, ", dateTo=");
        ua80.v(sbP, this.e, ", count=", this.f);
        sbP.append(", statusList=");
        sbP.append(this.g);
        sbP.append(", lastId=");
        sbP.append(this.h);
        w6x.A(", needSaleInfo=", ", betsForSale=", sbP, this.i, this.j);
        esw0.l(sbP, ", calculateSummaryInfo=", this.k, ", betTypeList=", this.l);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }

    public db7(String str, int i, long j, long j2, long j3, int i2, List list, Long l, boolean z, List list2) {
        list.getClass();
        list2.getClass();
        this.f5788a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = list;
        this.h = l;
        this.i = true;
        this.j = false;
        this.k = z;
        this.l = list2;
    }
}
