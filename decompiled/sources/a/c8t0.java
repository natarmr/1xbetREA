package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c8t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3932a;
    public final Object b;

    public c8t0(Object obj, Object obj2) {
        this.f3932a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8t0)) {
            return false;
        }
        c8t0 c8t0Var = (c8t0) obj;
        Object obj2 = c8t0Var.f3932a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f3932a, obj2) && Intrinsics.d(this.b, c8t0Var.b);
    }

    public final int hashCode() {
        return j0g0.b(this.b) + (j0g0.b(this.f3932a) * 31);
    }

    public final String toString() {
        return b1j.k("UniversalCalendarResultsMapModel(calendarDates=", j0g0.d(this.f3932a), ", universalChampResults=", j0g0.d(this.b), Separators.RPAREN);
    }
}
