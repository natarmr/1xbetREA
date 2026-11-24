package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21823a;
    public final List b;

    public mi1(long j, List list) {
        list.getClass();
        this.f21823a = j;
        this.b = list;
    }

    public static mi1 a(mi1 mi1Var, ArrayList arrayList) {
        long j = mi1Var.f21823a;
        mi1Var.getClass();
        return new mi1(j, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi1)) {
            return false;
        }
        mi1 mi1Var = (mi1) obj;
        return this.f21823a == mi1Var.f21823a && Intrinsics.d(this.b, mi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f21823a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f21823a, "AggregatorProvidersFiltersModel(partitionId=", ", filtersList=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
