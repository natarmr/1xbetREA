package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class evr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8485a;
    public final dur b;
    public final qtr c;
    public final avr d;
    public final bvr e;
    public final cvr f;
    public final zur g;

    public evr(long j, dur durVar, qtr qtrVar, avr avrVar, bvr bvrVar, cvr cvrVar, zur zurVar) {
        this.f8485a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = avrVar;
        this.e = bvrVar;
        this.f = cvrVar;
        this.g = zurVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f8485a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof evr) && (p6t0Var2 instanceof evr)) {
            evr evrVar = (evr) p6t0Var;
            evr evrVar2 = (evr) p6t0Var2;
            k9x.G(arrayList, evrVar.d, evrVar2.d);
            k9x.G(arrayList, evrVar.e, evrVar2.e);
            k9x.G(arrayList, evrVar.f, evrVar2.f);
            k9x.G(arrayList, evrVar.g, evrVar2.g);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evr)) {
            return false;
        }
        evr evrVar = (evr) obj;
        return this.f8485a == evrVar.f8485a && this.b.equals(evrVar.b) && this.c.equals(evrVar.c) && this.d.equals(evrVar.d) && this.e.equals(evrVar.e) && this.f.equals(evrVar.f) && this.g.equals(evrVar.g);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f8485a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return "GameCardType11UiModel(gameId=" + this.f8485a + ", header=" + this.b + ", footer=" + this.c + ", subtitle=" + this.d + ", teamFirst=" + this.e + ", teamSecond=" + this.f + ", scoreTotal=" + this.g + Separators.RPAREN;
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
