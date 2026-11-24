package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class lhj implements p6t0 {
    public static final gil0 i = new gil0(0, null, null, new zgl0(), 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20058a;
    public final ihj b;
    public final hhj c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final jhj h;

    public lhj(long j, ihj ihjVar, hhj hhjVar, long j2, long j3, long j4, boolean z, jhj jhjVar) {
        this.f20058a = j;
        this.b = ihjVar;
        this.c = hhjVar;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = z;
        this.h = jhjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhj)) {
            return false;
        }
        lhj lhjVar = (lhj) obj;
        return this.f20058a == lhjVar.f20058a && this.b.equals(lhjVar.b) && this.c.equals(lhjVar.c) && this.d == lhjVar.d && this.e == lhjVar.e && this.f == lhjVar.f && this.g == lhjVar.g && this.h.equals(lhjVar.h);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof lhj) && (p6t0Var2 instanceof lhj)) {
            lhj lhjVar = (lhj) p6t0Var;
            lhj lhjVar2 = (lhj) p6t0Var2;
            if (lhjVar.e == lhjVar2.e && lhjVar.g == lhjVar2.g && lhjVar.f == lhjVar2.f) {
                return true;
            }
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.h.f16529a.hashCode() + brm0.e(rw2.b(rw2.b(rw2.b((this.c.hashCode() + ((this.b.f14782a.hashCode() + (Long.hashCode(this.f20058a) * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof lhj) || !(p6t0Var2 instanceof lhj)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k9x.G(linkedHashSet, ((lhj) p6t0Var).h, ((lhj) p6t0Var2).h);
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DayExpressItem(sportId=");
        sb.append(this.f20058a);
        sb.append(", scoresInfo=");
        sb.append(this.b);
        sb.append(", gameNames=");
        sb.append(this.c);
        sb.append(", mainGameId=");
        sb.append(this.d);
        kng0.A(sb, ", gameId=", this.e, ", betType=");
        hne.t(this.f, ", live=", sb, this.g);
        sb.append(", sportMarketDsModel=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
