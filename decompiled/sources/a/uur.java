package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class uur implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36315a;
    public final dur b;
    public final qtr c;
    public final pur d;
    public final qur e;
    public final rur f;
    public final our g;
    public final fus h;

    public uur(long j, dur durVar, qtr qtrVar, pur purVar, qur qurVar, rur rurVar, our ourVar, fus fusVar) {
        this.f36315a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = purVar;
        this.e = qurVar;
        this.f = rurVar;
        this.g = ourVar;
        this.h = fusVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f36315a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof uur) && (p6t0Var2 instanceof uur)) {
            uur uurVar = (uur) p6t0Var;
            uur uurVar2 = (uur) p6t0Var2;
            k9x.G(arrayList, uurVar.d, uurVar2.d);
            k9x.G(arrayList, uurVar.e, uurVar2.e);
            k9x.G(arrayList, uurVar.f, uurVar2.f);
            k9x.G(arrayList, uurVar.g, uurVar2.g);
            k9x.G(arrayList, new sur(uurVar.h), new sur(uurVar2.h));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uur)) {
            return false;
        }
        uur uurVar = (uur) obj;
        return this.f36315a == uurVar.f36315a && this.b.equals(uurVar.b) && this.c.equals(uurVar.c) && this.d.equals(uurVar.d) && this.e.equals(uurVar.e) && this.f.equals(uurVar.f) && this.g.equals(uurVar.g) && this.h.equals(uurVar.h);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.f27631a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f36315a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return "GameCardType10UiModel(gameId=" + this.f36315a + ", header=" + this.b + ", footer=" + this.c + ", score=" + this.d + ", teamFirst=" + this.e + ", teamSecond=" + this.f + ", description=" + this.g + ", timer=" + axq.i("Timer(value=", this.h, Separators.RPAREN) + Separators.RPAREN;
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
