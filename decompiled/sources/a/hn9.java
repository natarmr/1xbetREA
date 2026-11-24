package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hn9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13339a;
    public final long b;
    public final List c;

    public hn9(long j, String str, List list) {
        list.getClass();
        this.f13339a = str;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn9)) {
            return false;
        }
        hn9 hn9Var = (hn9) obj;
        return this.f13339a.equals(hn9Var.f13339a) && this.b == hn9Var.b && Intrinsics.d(this.c, hn9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f13339a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ohs0.s(f140.o(this.b, "CalendarTournamentPrizeDistributionModel(place=", this.f13339a, ", prize="), ", teams=", this.c, Separators.RPAREN);
    }
}
