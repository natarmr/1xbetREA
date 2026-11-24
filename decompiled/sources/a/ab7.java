package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ab7 implements z47 {
    public static final za7 Companion = new za7();
    public static final a8z[] l = {null, null, null, null, null, null, maz.a(wez.f39042a, new t07(11)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f565a;
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

    public /* synthetic */ ab7(int i, String str, int i2, long j, long j2, long j3, int i3, List list, Long l2, boolean z, boolean z2, boolean z3) {
        if (1919 != (i & 1919)) {
            m2x.I(i, 1919, ya7.f42280a.getDescriptor());
            throw null;
        }
        this.f565a = str;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i3;
        this.g = list;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l2;
        }
        this.i = z;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab7)) {
            return false;
        }
        ab7 ab7Var = (ab7) obj;
        return Intrinsics.d(this.f565a, ab7Var.f565a) && this.b == ab7Var.b && this.c == ab7Var.c && this.d == ab7Var.d && this.e == ab7Var.e && this.f == ab7Var.f && Intrinsics.d(this.g, ab7Var.g) && Intrinsics.d(this.h, ab7Var.h) && this.i == ab7Var.i && this.j == ab7Var.j && this.k == ab7Var.k;
    }

    public final int hashCode() {
        int iA = dw9.a(twn.a(this.f, rw2.b(rw2.b(rw2.b(twn.a(this.b, this.f565a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
        Long l2 = this.h;
        return Boolean.hashCode(this.k) + brm0.e(brm0.e((iA + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "BetInfoHistoryWithSummaryByDatesRequest(language=", this.f565a, ", cfView=", ", userBonusId=");
        sbP.append(this.c);
        kng0.A(sbP, ", dateFrom=", this.d, ", dateTo=");
        ua80.v(sbP, this.e, ", count=", this.f);
        sbP.append(", statusList=");
        sbP.append(this.g);
        sbP.append(", lastId=");
        sbP.append(this.h);
        w6x.A(", needSaleInfo=", ", betsForSale=", sbP, this.i, this.j);
        return f140.n(sbP, ", calculateSummaryInfo=", this.k, Separators.RPAREN);
    }

    public ab7(String str, int i, long j, long j2, long j3, int i2, List list, Long l2, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f565a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = list;
        this.h = l2;
        this.i = z;
        this.j = z2;
        this.k = z3;
    }
}
