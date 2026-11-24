package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28259a;
    public final Date b;
    public final Long c;
    public final mnl d;

    public q7n(String str, Date date, Long l, mnl mnlVar) {
        str.getClass();
        this.f28259a = str;
        this.b = date;
        this.c = l;
        this.d = mnlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7n)) {
            return false;
        }
        q7n q7nVar = (q7n) obj;
        return Intrinsics.d(this.f28259a, q7nVar.f28259a) && this.b.equals(q7nVar.b) && this.c.equals(q7nVar.c) && this.d.equals(q7nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + brm0.i(this.b, this.f28259a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "DsTimerCellUiModel(timerTitle=" + this.f28259a + ", dateExpired=" + this.b + ", timeToExpire=" + this.c + ", timeSignaturesUiModel=" + this.d + Separators.RPAREN;
    }
}
