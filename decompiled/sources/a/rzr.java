package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class rzr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31377a;
    public final dur b;
    public final qtr c;
    public final nzr d;
    public final ozr e;
    public final mzr f;
    public final apg g;
    public final apg h;
    public final jzr i;
    public final fus j;

    public rzr(long j, dur durVar, qtr qtrVar, nzr nzrVar, ozr ozrVar, mzr mzrVar, apg apgVar, apg apgVar2, jzr jzrVar, fus fusVar) {
        this.f31377a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = nzrVar;
        this.e = ozrVar;
        this.f = mzrVar;
        this.g = apgVar;
        this.h = apgVar2;
        this.i = jzrVar;
        this.j = fusVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f31377a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof rzr) && (p6t0Var2 instanceof rzr)) {
            rzr rzrVar = (rzr) p6t0Var;
            rzr rzrVar2 = (rzr) p6t0Var2;
            k9x.G(arrayList, rzrVar.d, rzrVar2.d);
            k9x.G(arrayList, rzrVar.e, rzrVar2.e);
            k9x.G(arrayList, rzrVar.f, rzrVar2.f);
            k9x.G(arrayList, new kzr(rzrVar.g), new kzr(rzrVar2.g));
            k9x.G(arrayList, new lzr(rzrVar.h), new lzr(rzrVar2.h));
            k9x.G(arrayList, rzrVar.i, rzrVar2.i);
            k9x.G(arrayList, new pzr(rzrVar.j), new pzr(rzrVar2.j));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzr)) {
            return false;
        }
        rzr rzrVar = (rzr) obj;
        return this.f31377a == rzrVar.f31377a && this.b.equals(rzrVar.b) && this.c.equals(rzrVar.c) && this.d.equals(rzrVar.d) && this.e.equals(rzrVar.e) && this.f.equals(rzrVar.f) && this.g.equals(rzrVar.g) && this.h.equals(rzrVar.h) && this.i.equals(rzrVar.i) && this.j.equals(rzrVar.j);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.f22667a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f31377a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        String str = "MapsTeamFirst(value=" + this.g + Separators.RPAREN;
        String str2 = "MapsTeamSecond(value=" + this.h + Separators.RPAREN;
        String strI = axq.i("Timer(value=", this.j, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("GameCardType8UiModel(gameId=");
        sb.append(this.f31377a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", footer=");
        sb.append(this.c);
        sb.append(", teamFirst=");
        sb.append(this.d);
        sb.append(", teamSecond=");
        sb.append(this.e);
        sb.append(", score=");
        sb.append(this.f);
        f140.v(sb, ", mapsTeamFirst=", str, ", mapsTeamSecond=", str2);
        sb.append(", description=");
        sb.append(this.i);
        sb.append(", timer=");
        sb.append(strI);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
