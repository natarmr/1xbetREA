package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yn9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42928a;
    public final int b;
    public final List c;

    public yn9(String str, List list, int i) {
        list.getClass();
        this.f42928a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn9)) {
            return false;
        }
        yn9 yn9Var = (yn9) obj;
        return this.f42928a.equals(yn9Var.f42928a) && this.b == yn9Var.b && Intrinsics.d(this.c, yn9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f42928a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(kng0.p(this.b, "CalendarTournamentRoundSwissModel(name=", this.f42928a, ", index=", ", groups="), this.c, Separators.RPAREN);
    }
}
