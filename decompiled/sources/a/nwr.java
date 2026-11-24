package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class nwr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24248a;
    public final dur b;
    public final qtr c;
    public final String d;
    public final p5h0 e;
    public final hwr f;
    public final lwr g;
    public final iwr h;

    public nwr(long j, dur durVar, qtr qtrVar, String str, p5h0 p5h0Var, hwr hwrVar, lwr lwrVar, iwr iwrVar) {
        this.f24248a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = str;
        this.e = p5h0Var;
        this.f = hwrVar;
        this.g = lwrVar;
        this.h = iwrVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f24248a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof nwr) && (p6t0Var2 instanceof nwr)) {
            nwr nwrVar = (nwr) p6t0Var;
            nwr nwrVar2 = (nwr) p6t0Var2;
            k9x.G(arrayList, new jwr(nwrVar.d), new jwr(nwrVar2.d));
            k9x.G(arrayList, new kwr(nwrVar.e), new kwr(nwrVar2.e));
            k9x.G(arrayList, nwrVar.f, nwrVar2.f);
            k9x.G(arrayList, nwrVar.g, nwrVar2.g);
            k9x.G(arrayList, nwrVar.h, nwrVar2.h);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwr)) {
            return false;
        }
        nwr nwrVar = (nwr) obj;
        return this.f24248a == nwrVar.f24248a && this.b.equals(nwrVar.b) && this.c.equals(nwrVar.c) && this.d.equals(nwrVar.d) && this.e.equals(nwrVar.e) && this.f.equals(nwrVar.f) && this.g.equals(nwrVar.g) && this.h.equals(nwrVar.h);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.h.f15504a.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f24248a) * 31)) * 31)) * 31, 31, this.d)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return "GameCardType15UiModel(gameId=" + this.f24248a + ", header=" + this.b + ", footer=" + this.c + ", information=" + kng0.l("Information(value=", this.d, Separators.RPAREN) + ", score=" + axq.j("Score(value=", this.e, Separators.RPAREN) + ", firstTeam=" + this.f + ", secondTeam=" + this.g + ", gameStateInfo=" + this.h + Separators.RPAREN;
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
