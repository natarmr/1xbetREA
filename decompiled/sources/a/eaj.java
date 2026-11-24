package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class eaj implements faj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7467a;
    public final boolean b;
    public final long c;
    public final long d;
    public final qal0 e;

    public eaj(long j, boolean z, long j2, long j3, qal0 qal0Var) {
        this.f7467a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = qal0Var;
    }

    @Override // a.faj
    public final long a() {
        return this.f7467a;
    }

    @Override // a.faj
    public final long c() {
        return this.c;
    }

    @Override // a.faj
    public final long d() {
        return this.d;
    }

    @Override // a.faj
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaj)) {
            return false;
        }
        eaj eajVar = (eaj) obj;
        return this.f7467a == eajVar.f7467a && this.b == eajVar.b && this.c == eajVar.c && this.d == eajVar.d && Intrinsics.d(this.e, eajVar.e);
    }

    @Override // a.faj
    public final qal0 f() {
        return this.e;
    }

    @Override // a.haj
    public final jaj getType() {
        return jaj.SIMULATION;
    }

    public final int hashCode() {
        int iB = rw2.b(rw2.b(brm0.e(Long.hashCode(this.f7467a) * 31, 31, this.b), 31, this.c), 31, this.d);
        qal0 qal0Var = this.e;
        return iB + (qal0Var == null ? 0 : qal0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f7467a, "ToSimulation(gameId=", ", live=", this.b);
        kng0.A(sbR, ", sportId=", this.c, ", subSportId=");
        sbR.append(this.d);
        sbR.append(", timer=");
        sbR.append(this.e);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
