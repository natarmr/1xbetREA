package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28980a;
    public final long b;
    public final boolean c;
    public final o4i0 d;
    public final long e;

    public qmf(long j, long j2, long j3, o4i0 o4i0Var, boolean z) {
        this.f28980a = j;
        this.b = j2;
        this.c = z;
        this.d = o4i0Var;
        this.e = j3;
    }

    public static qmf a(qmf qmfVar, long j, long j2, boolean z, o4i0 o4i0Var, long j3, int i) {
        if ((i & 1) != 0) {
            j = qmfVar.f28980a;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = qmfVar.b;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            z = qmfVar.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            o4i0Var = qmfVar.d;
        }
        return new qmf(j4, j5, (i & 16) != 0 ? qmfVar.e : j3, o4i0Var, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmf)) {
            return false;
        }
        qmf qmfVar = (qmf) obj;
        return this.f28980a == qmfVar.f28980a && this.b == qmfVar.b && this.c == qmfVar.c && this.d.equals(qmfVar.d) && this.e == qmfVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + brm0.e(rw2.b(Long.hashCode(this.f28980a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f28980a, "Cs2GameSelectedStateModel(statisticSelectedTabId=", ", lastMatchesSelectedTabId=");
        hne.t(this.b, ", lastMatchesFooterCollapsed=", sbQ, this.c);
        sbQ.append(", selectedPlayers=");
        sbQ.append(this.d);
        sbQ.append(", mapStatisticSelectedTabId=");
        return brm0.k(this.e, Separators.RPAREN, sbQ);
    }
}
