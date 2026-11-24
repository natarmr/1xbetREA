package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k4g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17668a;
    public final long b;
    public final List c;

    public k4g(long j, long j2, List list) {
        list.getClass();
        this.f17668a = j;
        this.b = j2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4g)) {
            return false;
        }
        k4g k4gVar = (k4g) obj;
        return this.f17668a == k4gVar.f17668a && this.b == k4gVar.b && Intrinsics.d(this.c, k4gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Long.hashCode(this.f17668a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f17668a, "CyberCalendarAvailableDatesModel(subSportId=", ", tourType=");
        hne.x(sbQ, this.b, ", dates=", this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
