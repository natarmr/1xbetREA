package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ziv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44456a;
    public final int b;
    public final long c;
    public final String d;
    public final String e;
    public final Boolean f;

    public ziv(String str, int i, long j, String str2, String str3, Boolean bool) {
        this.f44456a = str;
        this.b = i;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziv)) {
            return false;
        }
        ziv zivVar = (ziv) obj;
        return this.f44456a.equals(zivVar.f44456a) && this.b == zivVar.b && znq0.e(this.c, zivVar.c) && this.d.equals(zivVar.d) && this.e.equals(zivVar.e) && Intrinsics.d(this.f, zivVar.f);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(rw2.b(twn.a(this.b, this.f44456a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        Boolean bool = this.f;
        return iB + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        String strH = znq0.h(this.c);
        StringBuilder sbP = kng0.p(this.b, "GuiltyGearRoundModel(finishType=", this.f44456a, ", round=", ", time=");
        f140.v(sbP, strH, ", winnerName=", this.d, ", typeOfWin=");
        sbP.append(this.e);
        sbP.append(", firstTeamWin=");
        sbP.append(this.f);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
