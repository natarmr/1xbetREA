package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kb7 implements r47 {
    public static final jb7 Companion = new jb7();
    public static final a8z[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17998a;
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
    public final List l;

    static {
        wez wezVar = wez.f39042a;
        m = new a8z[]{null, null, null, null, maz.a(wezVar, new t07((byte) 15)), null, null, null, null, null, null, maz.a(wezVar, new t07((byte) 16))};
    }

    public /* synthetic */ kb7(int i, String str, int i2, long j, int i3, List list, Long l, boolean z, boolean z2, int i4, boolean z3, String str2, List list2) {
        if (3807 != (i & 3807)) {
            m2x.I(i, 3807, ib7.f14472a.getDescriptor());
            throw null;
        }
        this.f17998a = str;
        this.b = i2;
        this.c = j;
        this.d = i3;
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
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
        this.l = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb7)) {
            return false;
        }
        kb7 kb7Var = (kb7) obj;
        return Intrinsics.d(this.f17998a, kb7Var.f17998a) && this.b == kb7Var.b && this.c == kb7Var.c && this.d == kb7Var.d && Intrinsics.d(this.e, kb7Var.e) && Intrinsics.d(this.f, kb7Var.f) && this.g == kb7Var.g && this.h == kb7Var.h && this.i == kb7Var.i && this.j == kb7Var.j && Intrinsics.d(this.k, kb7Var.k) && Intrinsics.d(this.l, kb7Var.l);
    }

    public final int hashCode() {
        int iA = dw9.a(twn.a(this.d, rw2.b(twn.a(this.b, this.f17998a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e);
        Long l = this.f;
        return this.l.hashCode() + ua80.b(brm0.e(twn.a(this.i, brm0.e(brm0.e((iA + (l == null ? 0 : l.hashCode())) * 31, 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "BetInfoHistoryWithSummaryByGlobalChampWithBetTypesRequest(language=", this.f17998a, ", cfView=", ", userBonusId=");
        ua80.v(sbP, this.c, ", count=", this.d);
        sbP.append(", statusList=");
        sbP.append(this.e);
        sbP.append(", lastId=");
        sbP.append(this.f);
        w6x.A(", needSaleInfo=", ", betsForSale=", sbP, this.g, this.h);
        dw9.v(this.i, ", partnerId=", ", calculateSummaryInfo=", sbP, this.j);
        ua80.t(", globalChampId=", this.k, ", betTypeList=", sbP, this.l);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }

    public kb7(String str, int i, long j, int i2, ArrayList arrayList, Long l, boolean z, String str2, List list) {
        str2.getClass();
        list.getClass();
        this.f17998a = str;
        this.b = i;
        this.c = j;
        this.d = i2;
        this.e = arrayList;
        this.f = l;
        this.g = true;
        this.h = false;
        this.i = 0;
        this.j = z;
        this.k = str2;
        this.l = list;
    }
}
