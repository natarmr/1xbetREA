package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yl9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f42829a;
    public final Date b;

    public yl9(Set set, Date date) {
        set.getClass();
        this.f42829a = set;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl9)) {
            return false;
        }
        yl9 yl9Var = (yl9) obj;
        return Intrinsics.d(this.f42829a, yl9Var.f42829a) && Intrinsics.d(this.b, yl9Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f42829a.hashCode() * 31;
        Date date = this.b;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "CalendarStateModel(dates=" + this.f42829a + ", selectedDate=" + this.b + Separators.RPAREN;
    }
}
