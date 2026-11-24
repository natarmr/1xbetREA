package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gyg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12127a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;
    public final List f;

    public gyg(int i, long j, long j2, String str, String str2, List list) {
        list.getClass();
        this.f12127a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = j2;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyg)) {
            return false;
        }
        gyg gygVar = (gyg) obj;
        return this.f12127a == gygVar.f12127a && this.b.equals(gygVar.b) && this.c.equals(gygVar.c) && this.d == gygVar.d && this.e == gygVar.e && Intrinsics.d(this.f, gygVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rw2.b(twn.a(this.d, ua80.b(ua80.b(Long.hashCode(this.f12127a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f12127a, "CyberGamesCSRankingLeaderBoardModel(id=", ", name=", this.b);
        axq.s(this.d, ", logo=", this.c, ", position=", sbO);
        kng0.A(sbO, ", points=", this.e, ", champs=");
        return dw9.r(sbO, this.f, Separators.RPAREN);
    }
}
