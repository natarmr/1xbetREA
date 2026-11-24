package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dm9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6311a;
    public final List b;

    public dm9(String str, List list) {
        list.getClass();
        this.f6311a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm9)) {
            return false;
        }
        dm9 dm9Var = (dm9) obj;
        return this.f6311a.equals(dm9Var.f6311a) && Intrinsics.d(this.b, dm9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6311a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CalendarTournamentCategoryGroupModel(name=", this.f6311a, ", rounds=", this.b, Separators.RPAREN);
    }
}
