package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xa7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40538a;
    public final long b;
    public final long c;
    public final long d;
    public final List e;
    public final boolean f;
    public final List g;

    public xa7(int i, long j, long j2, long j3, List list, boolean z, ArrayList arrayList) {
        list.getClass();
        this.f40538a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = list;
        this.f = z;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa7)) {
            return false;
        }
        xa7 xa7Var = (xa7) obj;
        return this.f40538a == xa7Var.f40538a && this.b == xa7Var.b && this.c == xa7Var.c && this.d == xa7Var.d && Intrinsics.d(this.e, xa7Var.e) && this.f == xa7Var.f && Intrinsics.d(this.g, xa7Var.g);
    }

    public final int hashCode() {
        int iE = brm0.e(dw9.a(rw2.b(rw2.b(rw2.b(Integer.hashCode(this.f40538a) * 31, 31, this.b), 31, this.c), 31, this.d), 961, this.e), 31, this.f);
        List list = this.g;
        return iE + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f40538a, this.b, "BetInfoHistoryWithSummaryByDatesModel(coefTypeId=", ", userBonusId=");
        kng0.A(sbQ, ", dateFrom=", this.c, ", dateTo=");
        hne.x(sbQ, this.d, ", statusList=", this.e);
        esw0.l(sbQ, ", lastId=null, calculateSummaryInfo=", this.f, ", betTypeList=", this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
