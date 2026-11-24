package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hb7 implements r47 {
    public static final gb7 Companion = new gb7();
    public static final a8z[] l = {null, null, null, null, maz.a(wez.f39042a, new t07(14)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12756a;
    public final int b;
    public final long c;
    public final int d;
    public final List e;
    public final Long f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final String k;

    public /* synthetic */ hb7(int i, String str, int i2, long j, int i3, List list, Long l2, boolean z, boolean z2, int i4, boolean z3, String str2) {
        if (1759 != (i & 1759)) {
            m2x.I(i, 1759, fb7.f9242a.getDescriptor());
            throw null;
        }
        this.f12756a = str;
        this.b = i2;
        this.c = j;
        this.d = i3;
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        this.g = z;
        this.h = z2;
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i4;
        }
        this.j = z3;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb7)) {
            return false;
        }
        hb7 hb7Var = (hb7) obj;
        return Intrinsics.d(this.f12756a, hb7Var.f12756a) && this.b == hb7Var.b && this.c == hb7Var.c && this.d == hb7Var.d && Intrinsics.d(this.e, hb7Var.e) && Intrinsics.d(this.f, hb7Var.f) && this.g == hb7Var.g && this.h == hb7Var.h && this.i == hb7Var.i && this.j == hb7Var.j && Intrinsics.d(this.k, hb7Var.k);
    }

    public final int hashCode() {
        int iA = dw9.a(twn.a(this.d, rw2.b(twn.a(this.b, this.f12756a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e);
        Long l2 = this.f;
        return this.k.hashCode() + brm0.e(twn.a(this.i, brm0.e(brm0.e((iA + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.g), 31, this.h), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "BetInfoHistoryWithSummaryByGlobalChampRequest(language=", this.f12756a, ", cfView=", ", userBonusId=");
        ua80.v(sbP, this.c, ", count=", this.d);
        sbP.append(", statusList=");
        sbP.append(this.e);
        sbP.append(", lastId=");
        sbP.append(this.f);
        w6x.A(", needSaleInfo=", ", betsForSale=", sbP, this.g, this.h);
        dw9.v(this.i, ", partnerId=", ", calculateSummaryInfo=", sbP, this.j);
        return rw2.o(sbP, ", globalChampId=", this.k, Separators.RPAREN);
    }

    public hb7(String str, int i, long j, int i2, List list, Long l2, boolean z, boolean z2, boolean z3, String str2) {
        list.getClass();
        str2.getClass();
        this.f12756a = str;
        this.b = i;
        this.c = j;
        this.d = i2;
        this.e = list;
        this.f = l2;
        this.g = z;
        this.h = z2;
        this.i = 0;
        this.j = z3;
        this.k = str2;
    }
}
