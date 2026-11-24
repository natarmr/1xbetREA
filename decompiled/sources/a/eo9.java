package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class eo9 {
    public static final do9 Companion = new do9();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new mn9(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8128a;
    public final String b;
    public final List c;

    public /* synthetic */ eo9(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f8128a = null;
        } else {
            this.f8128a = str;
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
        if (!(obj instanceof eo9)) {
            return false;
        }
        eo9 eo9Var = (eo9) obj;
        return Intrinsics.d(this.f8128a, eo9Var.f8128a) && Intrinsics.d(this.b, eo9Var.b) && Intrinsics.d(this.c, eo9Var.c);
    }

    public final int hashCode() {
        String str = this.f8128a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(b1j.n("CalendarTournamentStageGroupResponse(name=", this.f8128a, ", type=", this.b, ", brackets="), this.c, Separators.RPAREN);
    }
}
