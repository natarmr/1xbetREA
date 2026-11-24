package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cn7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4640a;
    public final long b;
    public final long c;
    public final long d;
    public final ArrayList e;
    public final String f;
    public final List g;

    public cn7(int i, long j, long j2, long j3, ArrayList arrayList, String str, ArrayList arrayList2) {
        str.getClass();
        this.f4640a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = arrayList;
        this.f = str;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn7)) {
            return false;
        }
        cn7 cn7Var = (cn7) obj;
        return this.f4640a == cn7Var.f4640a && this.b == cn7Var.b && this.c == cn7Var.c && this.d == cn7Var.d && this.e.equals(cn7Var.e) && Intrinsics.d(this.f, cn7Var.f) && Intrinsics.d(this.g, cn7Var.g);
    }

    public final int hashCode() {
        int iB = ua80.b(twn.g(this.e, rw2.b(rw2.b(rw2.b(Integer.hashCode(this.f4640a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
        List list = this.g;
        return iB + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f4640a, this.b, "BetSummaryInfoByDatesModel(coefTypeId=", ", userBonusId=");
        kng0.A(sbQ, ", dateFrom=", this.c, ", dateTo=");
        sbQ.append(this.d);
        sbQ.append(", statusList=");
        sbQ.append(this.e);
        ua80.t(", globalChampId=", this.f, ", betTypeList=", sbQ, this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
