package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tm9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34183a;
    public final String b;
    public final int c;
    public final List d;
    public final List e;
    public final List f;

    public tm9(int i, String str, String str2, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f34183a = str;
        this.b = str2;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm9)) {
            return false;
        }
        tm9 tm9Var = (tm9) obj;
        return this.f34183a.equals(tm9Var.f34183a) && this.b.equals(tm9Var.b) && this.c == tm9Var.c && Intrinsics.d(this.d, tm9Var.d) && Intrinsics.d(this.e, tm9Var.e) && Intrinsics.d(this.f, tm9Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(dw9.a(twn.a(this.c, ua80.b(this.f34183a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CalendarTournamentGroupSwissModel(id=", this.f34183a, ", record=", this.b, ", index=");
        ohs0.v(this.c, ", fromGroupWinners=", ", fromGroupLosers=", sbN, this.d);
        return kng0.n(", matches=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
