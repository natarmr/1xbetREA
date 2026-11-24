package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v1h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36629a;
    public final int b;
    public final int c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;

    public v1h(int i, int i2, int i3, List list, List list2, List list3, List list4, List list5) {
        rz4.B(list, list2, list3, list4, list5);
        this.f36629a = i;
        this.b = i2;
        this.c = i3;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
        this.h = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1h)) {
            return false;
        }
        v1h v1hVar = (v1h) obj;
        return this.f36629a == v1hVar.f36629a && this.b == v1hVar.b && this.c == v1hVar.c && Intrinsics.d(this.d, v1hVar.d) && Intrinsics.d(this.e, v1hVar.e) && Intrinsics.d(this.f, v1hVar.f) && Intrinsics.d(this.g, v1hVar.g) && Intrinsics.d(this.h, v1hVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f36629a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CyberLastMatchesInfoModel(firstTeamWinCount=", this.f36629a, ", secondTeamWinCount=", ", overTimesCount=", this.b);
        ohs0.v(this.c, ", headToHeadGames=", ", firstTeamGames=", sbT, this.d);
        b1j.y(", secondTeamGames=", ", firstTeamFutureGames=", sbT, this.e, this.f);
        return kng0.n(", secondTeamFutureGames=", Separators.RPAREN, sbT, this.g, this.h);
    }
}
