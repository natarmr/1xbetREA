package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class vwr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38166a;
    public final dur b;
    public final qtr c;
    public final String d;
    public final p5h0 e;
    public final owr f;
    public final swr g;
    public final fus h;
    public final String i;

    public vwr(long j, dur durVar, qtr qtrVar, String str, p5h0 p5h0Var, owr owrVar, swr swrVar, fus fusVar, String str2) {
        this.f38166a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = str;
        this.e = p5h0Var;
        this.f = owrVar;
        this.g = swrVar;
        this.h = fusVar;
        this.i = str2;
    }

    @Override // a.b0s
    public final long a() {
        return this.f38166a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof vwr) && (p6t0Var2 instanceof vwr)) {
            vwr vwrVar = (vwr) p6t0Var;
            vwr vwrVar2 = (vwr) p6t0Var2;
            k9x.G(arrayList, new pwr(vwrVar.d), new pwr(vwrVar2.d));
            k9x.G(arrayList, new rwr(vwrVar.e), new rwr(vwrVar2.e));
            k9x.G(arrayList, vwrVar.f, vwrVar2.f);
            k9x.G(arrayList, vwrVar.g, vwrVar2.g);
            k9x.G(arrayList, new twr(vwrVar.h), new twr(vwrVar2.h));
            k9x.G(arrayList, new qwr(vwrVar.i), new qwr(vwrVar2.i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwr)) {
            return false;
        }
        vwr vwrVar = (vwr) obj;
        return this.f38166a == vwrVar.f38166a && this.b.equals(vwrVar.b) && this.c.equals(vwrVar.c) && this.d.equals(vwrVar.d) && this.e.equals(vwrVar.e) && this.f.equals(vwrVar.f) && this.g.equals(vwrVar.g) && this.h.equals(vwrVar.h) && this.i.equals(vwrVar.i);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f38166a) * 31)) * 31)) * 31, 31, this.d)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        String strL = kng0.l("GameLabel(value=", this.d, Separators.RPAREN);
        String strJ = axq.j("Score(value=", this.e, Separators.RPAREN);
        String strI = axq.i("Timer(value=", this.h, Separators.RPAREN);
        String strL2 = kng0.l("Information(value=", this.i, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("GameCardType16UiModel(gameId=");
        sb.append(this.f38166a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", footer=");
        sb.append(this.c);
        sb.append(", gameLabel=");
        sb.append(strL);
        sb.append(", score=");
        sb.append(strJ);
        sb.append(", firstTeam=");
        sb.append(this.f);
        sb.append(", secondTeam=");
        sb.append(this.g);
        sb.append(", timer=");
        sb.append(strI);
        return rw2.o(sb, ", information=", strL2, Separators.RPAREN);
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
