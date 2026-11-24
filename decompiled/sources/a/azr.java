package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class azr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1733a;
    public final dur b;
    public final qtr c;
    public final wyr d;
    public final xyr e;
    public final uyr f;
    public final vyr g;
    public final tyr h;
    public final fus i;

    public azr(long j, dur durVar, qtr qtrVar, wyr wyrVar, xyr xyrVar, uyr uyrVar, vyr vyrVar, tyr tyrVar, fus fusVar) {
        this.f1733a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = wyrVar;
        this.e = xyrVar;
        this.f = uyrVar;
        this.g = vyrVar;
        this.h = tyrVar;
        this.i = fusVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f1733a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof azr) && (p6t0Var2 instanceof azr)) {
            azr azrVar = (azr) p6t0Var;
            azr azrVar2 = (azr) p6t0Var2;
            k9x.G(arrayList, azrVar.d, azrVar2.d);
            k9x.G(arrayList, azrVar.e, azrVar2.e);
            k9x.G(arrayList, azrVar.f, azrVar2.f);
            k9x.G(arrayList, azrVar.g, azrVar2.g);
            k9x.G(arrayList, azrVar.h, azrVar2.h);
            k9x.G(arrayList, new yyr(azrVar.i), new yyr(azrVar2.i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azr)) {
            return false;
        }
        azr azrVar = (azr) obj;
        return this.f1733a == azrVar.f1733a && this.b.equals(azrVar.b) && this.c.equals(azrVar.c) && this.d.equals(azrVar.d) && this.e.equals(azrVar.e) && this.f.equals(azrVar.f) && this.g.equals(azrVar.g) && this.h.equals(azrVar.h) && this.i.equals(azrVar.i);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e((this.g.f38262a.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f1733a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h.f34770a);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        String strI = axq.i("Timer(value=", this.i, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("GameCardType6UiModel(gameId=");
        sb.append(this.f1733a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", footer=");
        sb.append(this.c);
        sb.append(", teamFirst=");
        sb.append(this.d);
        sb.append(", teamSecond=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", score=");
        sb.append(this.g);
        sb.append(", betGroup=");
        sb.append(this.h);
        return rw2.o(sb, ", timer=", strI, Separators.RPAREN);
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
