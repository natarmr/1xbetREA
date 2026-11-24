package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xf90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40781a;
    public final String b;
    public final List c;

    public xf90(long j, String str, List list) {
        str.getClass();
        list.getClass();
        this.f40781a = j;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf90)) {
            return false;
        }
        xf90 xf90Var = (xf90) obj;
        return this.f40781a == xf90Var.f40781a && Intrinsics.d(this.b, xf90Var.b) && Intrinsics.d(this.c, xf90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f40781a) * 31, 31, this.b);
    }

    public final String toString() {
        return ohs0.s(axq.o(this.f40781a, "PeriodSubscriptionSettingsModel(id=", ", name=", this.b), ", eventsSettings=", this.c, Separators.RPAREN);
    }
}
