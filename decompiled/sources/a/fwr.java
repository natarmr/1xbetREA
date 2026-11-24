package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fwr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10272a;
    public final dur b;
    public final qtr c;
    public final String d;
    public final p5h0 e;
    public final zvr f;
    public final cwr g;
    public final List h;
    public final String i;
    public final fus j;
    public final String k;

    public fwr(long j, dur durVar, qtr qtrVar, String str, p5h0 p5h0Var, zvr zvrVar, cwr cwrVar, List list, String str2, fus fusVar, String str3) {
        this.f10272a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = str;
        this.e = p5h0Var;
        this.f = zvrVar;
        this.g = cwrVar;
        this.h = list;
        this.i = str2;
        this.j = fusVar;
        this.k = str3;
    }

    @Override // a.b0s
    public final long a() {
        return this.f10272a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof fwr) && (p6t0Var2 instanceof fwr)) {
            fwr fwrVar = (fwr) p6t0Var;
            fwr fwrVar2 = (fwr) p6t0Var2;
            k9x.G(arrayList, new awr(fwrVar.d), new awr(fwrVar2.d));
            k9x.G(arrayList, new bwr(fwrVar.e), new bwr(fwrVar2.e));
            k9x.G(arrayList, fwrVar.f, fwrVar2.f);
            k9x.G(arrayList, fwrVar.g, fwrVar2.g);
            k9x.G(arrayList, new yvr(fwrVar.h), new yvr(fwrVar2.h));
            k9x.G(arrayList, new wvr(fwrVar.i), new wvr(fwrVar2.i));
            k9x.G(arrayList, new dwr(fwrVar.j), new dwr(fwrVar2.j));
            k9x.G(arrayList, new xvr(fwrVar.k), new xvr(fwrVar2.k));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwr)) {
            return false;
        }
        fwr fwrVar = (fwr) obj;
        return this.f10272a == fwrVar.f10272a && this.b.equals(fwrVar.b) && this.c.equals(fwrVar.c) && this.d.equals(fwrVar.d) && this.e.equals(fwrVar.e) && this.f.equals(fwrVar.f) && this.g.equals(fwrVar.g) && this.h.equals(fwrVar.h) && this.i.equals(fwrVar.i) && this.j.equals(fwrVar.j) && this.k.equals(fwrVar.k);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ua80.b(dw9.a((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f10272a) * 31)) * 31)) * 31, 31, this.d)) * 31)) * 31)) * 31, 31, this.h), 31, this.i)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        String strL = kng0.l("Information(value=", this.d, Separators.RPAREN);
        String strJ = axq.j("Score(value=", this.e, Separators.RPAREN);
        String strR = twn.r(this.h, "DealearCards(value=", Separators.RPAREN);
        String strL2 = kng0.l("BottomInfo(value=", this.i, Separators.RPAREN);
        String strI = axq.i("Timer(value=", this.j, Separators.RPAREN);
        String strL3 = kng0.l("Caption(value=", this.k, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("GameCardType14UiModel(gameId=");
        sb.append(this.f10272a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", footer=");
        sb.append(this.c);
        sb.append(", information=");
        sb.append(strL);
        sb.append(", score=");
        sb.append(strJ);
        sb.append(", firstTeam=");
        sb.append(this.f);
        sb.append(", secondTeam=");
        sb.append(this.g);
        sb.append(", dealearCards=");
        sb.append(strR);
        f140.v(sb, ", bottomInfo=", strL2, ", timer=", strI);
        return rw2.o(sb, ", caption=", strL3, Separators.RPAREN);
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
