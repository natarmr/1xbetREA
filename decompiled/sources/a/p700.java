package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p700 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26481a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;

    public p700(String str, String str2, String str3, String str4, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f26481a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = list2;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p700)) {
            return false;
        }
        p700 p700Var = (p700) obj;
        return this.f26481a.equals(p700Var.f26481a) && this.b.equals(p700Var.b) && this.c.equals(p700Var.c) && this.d.equals(p700Var.d) && Intrinsics.d(this.e, p700Var.e) && Intrinsics.d(this.f, p700Var.f) && Intrinsics.d(this.g, p700Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(this.f26481a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LineStatisticModel(teamOneId=", this.f26481a, ", teamTwoId=", this.b, ", teamOneName=");
        f140.v(sbN, this.c, ", teamTwoName=", this.d, ", previousGames=");
        b1j.y(", lastGameTeamOne=", ", lastGameTeamTwo=", sbN, this.e, this.f);
        return dw9.r(sbN, this.g, Separators.RPAREN);
    }
}
