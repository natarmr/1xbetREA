package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class otc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25822a;
    public final String b;
    public final lho c;
    public final long d;
    public final String e;
    public final ufp0 f;
    public final ufp0 g;
    public final String h;
    public final long i;

    static {
        lho lhoVar = lho.UNKNOWN;
        iun iunVar = iun.f15405a;
        new otc(0L, "", lhoVar, 0L, "", new ufp0(0, "", "", "", iunVar), new ufp0(0, "", "", "", iunVar), "", 0L);
    }

    public otc(long j, String str, lho lhoVar, long j2, String str2, ufp0 ufp0Var, ufp0 ufp0Var2, String str3, long j3) {
        str.getClass();
        lhoVar.getClass();
        str2.getClass();
        str3.getClass();
        this.f25822a = j;
        this.b = str;
        this.c = lhoVar;
        this.d = j2;
        this.e = str2;
        this.f = ufp0Var;
        this.g = ufp0Var2;
        this.h = str3;
        this.i = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otc)) {
            return false;
        }
        otc otcVar = (otc) obj;
        return this.f25822a == otcVar.f25822a && Intrinsics.d(this.b, otcVar.b) && this.c == otcVar.c && this.d == otcVar.d && Intrinsics.d(this.e, otcVar.e) && this.f.equals(otcVar.f) && this.g.equals(otcVar.g) && Intrinsics.d(this.h, otcVar.h) && this.i == otcVar.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + ua80.b(twn.f(this.g, twn.f(this.f, ua80.b(rw2.b((this.c.hashCode() + ua80.b(Long.hashCode(this.f25822a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f25822a, "ClickedGameModel(feedGameId=", ", statisticGameId=", this.b);
        sbO.append(", gameStatus=");
        sbO.append(this.c);
        sbO.append(", eventDateInSecondsUnixTime=");
        kng0.z(sbO, this.d, ", score=", this.e);
        sbO.append(", teamOne=");
        sbO.append(this.f);
        sbO.append(", teamTwo=");
        sbO.append(this.g);
        hne.B(sbO, ", tournamentTitle=", this.h, ", sportId=");
        return brm0.k(this.i, Separators.RPAREN, sbO);
    }
}
