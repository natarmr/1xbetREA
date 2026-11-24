package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class oo9 {
    public static final no9 Companion = new no9();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new mn9(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25584a;
    public final String b;
    public final List c;

    public /* synthetic */ oo9(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f25584a = null;
        } else {
            this.f25584a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo9)) {
            return false;
        }
        oo9 oo9Var = (oo9) obj;
        return Intrinsics.d(this.f25584a, oo9Var.f25584a) && Intrinsics.d(this.b, oo9Var.b) && Intrinsics.d(this.c, oo9Var.c);
    }

    public final int hashCode() {
        String str = this.f25584a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(b1j.n("CalendarTournamentStageSwissResponse(type=", this.f25584a, ", name=", this.b, ", brackets="), this.c, Separators.RPAREN);
    }
}
