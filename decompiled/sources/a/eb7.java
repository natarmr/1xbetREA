package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class eb7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7505a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final ArrayList f;
    public final boolean g;
    public final List h;

    public eb7(String str, int i, long j, long j2, long j3, ArrayList arrayList, boolean z, ArrayList arrayList2) {
        str.getClass();
        this.f7505a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = arrayList;
        this.g = z;
        this.h = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb7)) {
            return false;
        }
        eb7 eb7Var = (eb7) obj;
        return Intrinsics.d(this.f7505a, eb7Var.f7505a) && this.b == eb7Var.b && this.c == eb7Var.c && this.d == eb7Var.d && this.e == eb7Var.e && this.f.equals(eb7Var.f) && this.g == eb7Var.g && Intrinsics.d(this.h, eb7Var.h);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(twn.g(this.f, rw2.b(rw2.b(rw2.b(twn.a(this.b, this.f7505a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 961), 31, false), 31, this.g);
        List list = this.h;
        return iE + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "BetInfoHistoryWithSummaryByGlobalChampModel(globalChampId=", this.f7505a, ", coefTypeId=", ", userBonusId=");
        sbP.append(this.c);
        kng0.A(sbP, ", dateFrom=", this.d, ", dateTo=");
        sbP.append(this.e);
        sbP.append(", statusList=");
        sbP.append(this.f);
        esw0.l(sbP, ", lastId=null, betsForSale=false, calculateSummaryInfo=", this.g, ", betTypeList=", this.h);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
