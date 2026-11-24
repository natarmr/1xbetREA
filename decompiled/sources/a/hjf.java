package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hjf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13156a;
    public final int b;
    public final List c;

    public hjf(String str, List list, int i) {
        list.getClass();
        this.f13156a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjf)) {
            return false;
        }
        hjf hjfVar = (hjf) obj;
        return this.f13156a.equals(hjfVar.f13156a) && this.b == hjfVar.b && Intrinsics.d(this.c, hjfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f13156a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(kng0.p(this.b, "Cs2CompositionStatisticModel(teamId=", this.f13156a, ", rank=", ", playersStatistics="), this.c, Separators.RPAREN);
    }
}
