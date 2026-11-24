package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6933a;
    public final String b;
    public final hds c;
    public final double d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public dza(long j, String str, hds hdsVar, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f6933a = j;
        this.b = str;
        this.c = hdsVar;
        this.d = d;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dza)) {
            return false;
        }
        dza dzaVar = (dza) obj;
        return this.f6933a == dzaVar.f6933a && this.b.equals(dzaVar.b) && this.c.equals(dzaVar.c) && Double.compare(this.d, dzaVar.d) == 0 && this.e == dzaVar.e && this.f == dzaVar.f && this.g == dzaVar.g && this.h == dzaVar.h && this.i == dzaVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.d(this.d, (this.c.hashCode() + ua80.b(Long.hashCode(this.f6933a) * 31, 31, this.b)) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f6933a, "CashbackGameState(gameId=", ", gameName=", this.b);
        sbO.append(", imageInfo=");
        sbO.append(this.c);
        sbO.append(", percent=");
        rz4.x(sbO, this.d, ", isUpperCashBack=", this.e);
        w6x.A(", isSelected=", ", isAvailable=", sbO, this.f, this.g);
        w6x.A(", isWeb=", ", underMaintenance=", sbO, this.h, this.i);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
