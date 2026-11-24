package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ua2 implements va2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f35310a;
    public final long b;
    public final long c;

    public ua2(Date date, long j, long j2) {
        this.f35310a = date;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua2)) {
            return false;
        }
        ua2 ua2Var = (ua2) obj;
        return Intrinsics.d(this.f35310a, ua2Var.f35310a) && this.b == ua2Var.b && this.c == ua2Var.c;
    }

    public final int hashCode() {
        Date date = this.f35310a;
        return Long.hashCode(this.c) + rw2.b((date == null ? 0 : date.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowCalendarChooser(date=");
        sb.append(this.f35310a);
        sb.append(", minDate=");
        sb.append(this.b);
        return rw2.n(sb, this.c, ", currentTime=", Separators.RPAREN);
    }
}
