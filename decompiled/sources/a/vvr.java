package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class vvr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38115a;
    public final dur b;
    public final qtr c;
    public final String d;
    public final svr e;
    public final qvr f;
    public final rvr g;
    public final tvr h;

    public vvr(long j, dur durVar, qtr qtrVar, String str, svr svrVar, qvr qvrVar, rvr rvrVar, tvr tvrVar) {
        this.f38115a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = str;
        this.e = svrVar;
        this.f = qvrVar;
        this.g = rvrVar;
        this.h = tvrVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f38115a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof vvr) && (p6t0Var2 instanceof vvr)) {
            vvr vvrVar = (vvr) p6t0Var;
            vvr vvrVar2 = (vvr) p6t0Var2;
            k9x.G(arrayList, new pvr(vvrVar.d), new pvr(vvrVar2.d));
            k9x.G(arrayList, vvrVar.e, vvrVar2.e);
            k9x.G(arrayList, vvrVar.f, vvrVar2.f);
            k9x.G(arrayList, vvrVar.g, vvrVar2.g);
            k9x.G(arrayList, vvrVar.h, vvrVar2.h);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvr)) {
            return false;
        }
        vvr vvrVar = (vvr) obj;
        return this.f38115a == vvrVar.f38115a && this.b.equals(vvrVar.b) && this.c.equals(vvrVar.c) && this.d.equals(vvrVar.d) && this.e.equals(vvrVar.e) && this.f.equals(vvrVar.f) && this.g.equals(vvrVar.g) && this.h.equals(vvrVar.h);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.f32882a.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f38115a) * 31)) * 31)) * 31, 31, this.d)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return "GameCardType13UiModel(gameId=" + this.f38115a + ", header=" + this.b + ", footer=" + this.c + ", information=" + kng0.l("Information(value=", this.d, Separators.RPAREN) + ", score=" + this.e + ", firstPlayer=" + this.f + ", secondPlayer=" + this.g + ", subtitle=" + this.h + Separators.RPAREN;
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
