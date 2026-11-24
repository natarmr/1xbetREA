package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class azm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1723a;
    public final String b;
    public final String c;

    public azm(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f1723a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azm)) {
            return false;
        }
        azm azmVar = (azm) obj;
        return Intrinsics.d(this.f1723a, azmVar.f1723a) && Intrinsics.d(this.b, azmVar.b) && Intrinsics.d(this.c, azmVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(ua80.b(ua80.b(this.f1723a.hashCode() * 31, 31, this.b), 31, this.c), 31, false);
    }

    public final String toString() {
        return axq.n(b1j.n("DsSportEventCardTennisStatisticsScore(title=", this.f1723a, ", firstScore=", this.b, ", secondScore="), this.c, ", isFirstScoreChange=false, isSecondScoreChange=false)");
    }
}
