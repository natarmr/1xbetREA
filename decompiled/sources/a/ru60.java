package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ru60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ewa f31111a;
    public final kg b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final Map g;
    public final qwa h;
    public final mza i;
    public final List j;
    public final dza k;
    public final Throwable l;
    public final long m;

    public ru60(ewa ewaVar, kg kgVar, boolean z, boolean z2, boolean z3, long j, Map map, qwa qwaVar, mza mzaVar, List list, dza dzaVar, Throwable th, long j2) {
        kgVar.getClass();
        list.getClass();
        this.f31111a = ewaVar;
        this.b = kgVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = j;
        this.g = map;
        this.h = qwaVar;
        this.i = mzaVar;
        this.j = list;
        this.k = dzaVar;
        this.l = th;
        this.m = j2;
    }

    public static ru60 a(ru60 ru60Var, ewa ewaVar, boolean z, boolean z2, boolean z3, long j, Map map, qwa qwaVar, mza mzaVar, List list, dza dzaVar, Throwable th, long j2, int i) {
        ewa ewaVar2 = (i & 1) != 0 ? ru60Var.f31111a : ewaVar;
        kg kgVar = ru60Var.b;
        boolean z4 = (i & 4) != 0 ? ru60Var.c : z;
        boolean z5 = (i & 8) != 0 ? ru60Var.d : z2;
        boolean z6 = (i & 16) != 0 ? ru60Var.e : z3;
        long j3 = (i & 32) != 0 ? ru60Var.f : j;
        Map map2 = (i & 64) != 0 ? ru60Var.g : map;
        qwa qwaVar2 = (i & 128) != 0 ? ru60Var.h : qwaVar;
        mza mzaVar2 = (i & 256) != 0 ? ru60Var.i : mzaVar;
        List list2 = (i & 512) != 0 ? ru60Var.j : list;
        dza dzaVar2 = (i & 1024) != 0 ? ru60Var.k : dzaVar;
        Throwable th2 = (i & 2048) != 0 ? ru60Var.l : th;
        ewa ewaVar3 = ewaVar2;
        long j4 = (i & 4096) != 0 ? ru60Var.m : j2;
        ru60Var.getClass();
        kgVar.getClass();
        map2.getClass();
        list2.getClass();
        return new ru60(ewaVar3, kgVar, z4, z5, z6, j3, map2, qwaVar2, mzaVar2, list2, dzaVar2, th2, j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru60)) {
            return false;
        }
        ru60 ru60Var = (ru60) obj;
        return this.f31111a.equals(ru60Var.f31111a) && this.b == ru60Var.b && this.c == ru60Var.c && this.d == ru60Var.d && this.e == ru60Var.e && this.f == ru60Var.f && this.g.equals(ru60Var.g) && Intrinsics.d(this.h, ru60Var.h) && Intrinsics.d(this.i, ru60Var.i) && Intrinsics.d(this.j, ru60Var.j) && Intrinsics.d(this.k, ru60Var.k) && Intrinsics.d(this.l, ru60Var.l) && this.m == ru60Var.m;
    }

    public final int hashCode() {
        int iF = ohs0.f(this.g, rw2.b(brm0.e(brm0.e(brm0.e((this.b.hashCode() + (this.f31111a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
        qwa qwaVar = this.h;
        int iHashCode = (iF + (qwaVar == null ? 0 : qwaVar.hashCode())) * 31;
        mza mzaVar = this.i;
        int iA = dw9.a((iHashCode + (mzaVar == null ? 0 : mzaVar.hashCode())) * 31, 31, this.j);
        dza dzaVar = this.k;
        int iHashCode2 = (iA + (dzaVar == null ? 0 : dzaVar.hashCode())) * 31;
        Throwable th = this.l;
        return Long.hashCode(this.m) + ((iHashCode2 + (th != null ? th.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesCashBackState(balanceState=");
        sb.append(this.f31111a);
        sb.append(", accountSelectionStyle=");
        sb.append(this.b);
        sb.append(", isAuthorized=");
        ua80.u(", isConnected=", ", previousConnected=", sb, this.c, this.d);
        rw2.v(this.f, ", monthGameId=", sb, this.e);
        sb.append(", rulesParams=");
        sb.append(this.g);
        sb.append(", card=");
        sb.append(this.h);
        sb.append(", progress=");
        sb.append(this.i);
        sb.append(", playerGames=");
        sb.append(this.j);
        sb.append(", companyGame=");
        sb.append(this.k);
        sb.append(", error=");
        sb.append(this.l);
        return rw2.n(sb, this.m, ", retryTimerEndMillis=", Separators.RPAREN);
    }
}
