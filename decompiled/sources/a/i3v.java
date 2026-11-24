package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i3v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14115a;
    public final Object b;
    public final Object c;

    public i3v(Object obj, Object obj2, Object obj3) {
        this.f14115a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3v)) {
            return false;
        }
        i3v i3vVar = (i3v) obj;
        Object obj2 = i3vVar.f14115a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f14115a, obj2) && Intrinsics.d(this.b, i3vVar.b) && Intrinsics.d(this.c, i3vVar.c);
    }

    public final int hashCode() {
        return j0g0.b(this.c) + twn.c(j0g0.b(this.f14115a) * 31, 31, this.b);
    }

    public final String toString() {
        String strD = j0g0.d(this.f14115a);
        String strD2 = j0g0.d(this.b);
        return axq.n(b1j.n("InternalScenarioModel(liveChampEvent=", strD, ", lineChampEvent=", strD2, ", tournamentFeedStatistic="), j0g0.d(this.c), Separators.RPAREN);
    }
}
