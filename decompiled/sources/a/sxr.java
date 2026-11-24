package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class sxr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32992a;
    public final dur b;
    public final qtr c;
    public final oxr d;
    public final pxr e;
    public final qxr f;
    public final nxr g;
    public final lxr h;
    public final kxr i;
    public final mxr j;

    public sxr(long j, dur durVar, qtr qtrVar, oxr oxrVar, pxr pxrVar, qxr qxrVar, nxr nxrVar, lxr lxrVar, kxr kxrVar, mxr mxrVar) {
        this.f32992a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = oxrVar;
        this.e = pxrVar;
        this.f = qxrVar;
        this.g = nxrVar;
        this.h = lxrVar;
        this.i = kxrVar;
        this.j = mxrVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f32992a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof sxr) && (p6t0Var2 instanceof sxr)) {
            sxr sxrVar = (sxr) p6t0Var;
            sxr sxrVar2 = (sxr) p6t0Var2;
            k9x.G(arrayList, sxrVar.d, sxrVar2.d);
            k9x.G(arrayList, sxrVar.e, sxrVar2.e);
            k9x.G(arrayList, sxrVar.f, sxrVar2.f);
            k9x.G(arrayList, sxrVar.g, sxrVar2.g);
            k9x.G(arrayList, sxrVar.h, sxrVar2.h);
            k9x.G(arrayList, sxrVar.i, sxrVar2.i);
            k9x.G(arrayList, sxrVar.j, sxrVar2.j);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxr)) {
            return false;
        }
        sxr sxrVar = (sxr) obj;
        return this.f32992a == sxrVar.f32992a && this.b.equals(sxrVar.b) && this.c.equals(sxrVar.c) && this.d.equals(sxrVar.d) && this.e.equals(sxrVar.e) && this.f.equals(sxrVar.f) && this.g.equals(sxrVar.g) && this.h.equals(sxrVar.h) && this.i.equals(sxrVar.i) && this.j.equals(sxrVar.j);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f32992a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return "GameCardType1UiModel(gameId=" + this.f32992a + ", header=" + this.b + ", footer=" + this.c + ", status=" + this.d + ", teamFirst=" + this.e + ", teamSecond=" + this.f + ", scoreTotal=" + this.g + ", scorePeriod=" + this.h + ", scoreGame=" + this.i + ", scoreServe=" + this.j + Separators.RPAREN;
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
