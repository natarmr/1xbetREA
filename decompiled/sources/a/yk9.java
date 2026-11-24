package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yk9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42776a;
    public final int b;
    public final boolean c;

    public yk9(int i, long j, boolean z) {
        this.f42776a = j;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk9)) {
            return false;
        }
        yk9 yk9Var = (yk9) obj;
        return this.f42776a == yk9Var.f42776a && this.b == yk9Var.b && this.c == yk9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, Long.hashCode(this.f42776a) * 31, 31);
    }

    public final String toString() {
        return f140.n(brm0.q(this.b, this.f42776a, "CalendarDayModel(timeInMillis=", ", dayOfMonth="), ", isFromCurrentMonth=", this.c, Separators.RPAREN);
    }
}
