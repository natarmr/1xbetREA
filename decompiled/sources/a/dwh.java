package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dwh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6798a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final mwh f;

    static {
        int i = mwh.c;
    }

    public dwh(boolean z, boolean z2, boolean z3, boolean z4, long j, mwh mwhVar) {
        this.f6798a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = j;
        this.f = mwhVar;
    }

    public static dwh a(dwh dwhVar, boolean z, boolean z2, boolean z3, boolean z4, long j, mwh mwhVar, int i) {
        if ((i & 1) != 0) {
            z = dwhVar.f6798a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = dwhVar.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = dwhVar.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = dwhVar.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            j = dwhVar.e;
        }
        long j2 = j;
        if ((i & 32) != 0) {
            mwhVar = dwhVar.f;
        }
        return new dwh(z5, z6, z7, z8, j2, mwhVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwh)) {
            return false;
        }
        dwh dwhVar = (dwh) obj;
        return this.f6798a == dwhVar.f6798a && this.b == dwhVar.b && this.c == dwhVar.c && this.d == dwhVar.d && this.e == dwhVar.e && this.f.equals(dwhVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rw2.b(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f6798a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("CyclingPlayerStatisticsState(headerIsLoaded=", ", isLoading=", ", isError=", this.f6798a, this.b);
        ua80.u(", isEmpty=", ", checkedChipsId=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", cyclingPlayersStatisticModel=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
