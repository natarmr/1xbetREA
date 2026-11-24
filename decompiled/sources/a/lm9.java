package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lm9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20287a;
    public final List b;

    public lm9(String str, List list) {
        list.getClass();
        this.f20287a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm9)) {
            return false;
        }
        lm9 lm9Var = (lm9) obj;
        return this.f20287a.equals(lm9Var.f20287a) && Intrinsics.d(this.b, lm9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20287a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CalendarTournamentCategorySwissModel(name=", this.f20287a, ", rounds=", this.b, Separators.RPAREN);
    }
}
