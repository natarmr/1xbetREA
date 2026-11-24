package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class km9 {
    public static final jm9 Companion = new jm9();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new ej8(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18527a;
    public final List b;

    public /* synthetic */ km9(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f18527a = null;
        } else {
            this.f18527a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km9)) {
            return false;
        }
        km9 km9Var = (km9) obj;
        return Intrinsics.d(this.f18527a, km9Var.f18527a) && Intrinsics.d(this.b, km9Var.b);
    }

    public final int hashCode() {
        String str = this.f18527a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("CalendarTournamentCategoryPlayoffResponse(name=", this.f18527a, ", rounds=", this.b, Separators.RPAREN);
    }
}
