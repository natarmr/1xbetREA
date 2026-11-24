package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class zxr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45175a;
    public final dur b;
    public final qtr c;
    public final String d;
    public final p5h0 e;
    public final txr f;
    public final xxr g;
    public final uxr h;

    public zxr(long j, dur durVar, qtr qtrVar, String str, p5h0 p5h0Var, txr txrVar, xxr xxrVar, uxr uxrVar) {
        this.f45175a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = str;
        this.e = p5h0Var;
        this.f = txrVar;
        this.g = xxrVar;
        this.h = uxrVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f45175a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof zxr) && (p6t0Var2 instanceof zxr)) {
            zxr zxrVar = (zxr) p6t0Var;
            zxr zxrVar2 = (zxr) p6t0Var2;
            k9x.G(arrayList, new vxr(zxrVar.d), new vxr(zxrVar2.d));
            k9x.G(arrayList, new wxr(zxrVar.e), new wxr(zxrVar2.e));
            k9x.G(arrayList, zxrVar.f, zxrVar2.f);
            k9x.G(arrayList, zxrVar.g, zxrVar2.g);
            k9x.G(arrayList, zxrVar.h, zxrVar2.h);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxr)) {
            return false;
        }
        zxr zxrVar = (zxr) obj;
        return this.f45175a == zxrVar.f45175a && this.b.equals(zxrVar.b) && this.c.equals(zxrVar.c) && this.d.equals(zxrVar.d) && this.e.equals(zxrVar.e) && this.f.equals(zxrVar.f) && this.g.equals(zxrVar.g) && this.h.equals(zxrVar.h);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f45175a) * 31)) * 31)) * 31, 31, this.d)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return "GameCardType2UiModel(gameId=" + this.f45175a + ", header=" + this.b + ", footer=" + this.c + ", information=" + kng0.l("Information(value=", this.d, Separators.RPAREN) + ", score=" + axq.j("Score(value=", this.e, Separators.RPAREN) + ", firstTeam=" + this.f + ", secondTeam=" + this.g + ", gameStateInfo=" + this.h + Separators.RPAREN;
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
