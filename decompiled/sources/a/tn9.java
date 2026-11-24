package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tn9 {
    public static final sn9 Companion = new sn9();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new mn9(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34222a;
    public final List b;

    public /* synthetic */ tn9(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f34222a = null;
        } else {
            this.f34222a = str;
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
        if (!(obj instanceof tn9)) {
            return false;
        }
        tn9 tn9Var = (tn9) obj;
        return Intrinsics.d(this.f34222a, tn9Var.f34222a) && Intrinsics.d(this.b, tn9Var.b);
    }

    public final int hashCode() {
        String str = this.f34222a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("CalendarTournamentRoundGroupResponse(name=", this.f34222a, ", matches=", this.b, Separators.RPAREN);
    }
}
