package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class lo9 {
    public static final ko9 Companion = new ko9();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new mn9(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20380a;
    public final String b;
    public final List c;

    public /* synthetic */ lo9(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f20380a = null;
        } else {
            this.f20380a = str;
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
        if (!(obj instanceof lo9)) {
            return false;
        }
        lo9 lo9Var = (lo9) obj;
        return Intrinsics.d(this.f20380a, lo9Var.f20380a) && Intrinsics.d(this.b, lo9Var.b) && Intrinsics.d(this.c, lo9Var.c);
    }

    public final int hashCode() {
        String str = this.f20380a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(b1j.n("CalendarTournamentStagePlayoffResponse(type=", this.f20380a, ", name=", this.b, ", brackets="), this.c, Separators.RPAREN);
    }
}
