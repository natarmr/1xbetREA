package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class mvr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22470a;
    public final dur b;
    public final qtr c;
    public final ivr d;
    public final gvr e;
    public final kvr f;
    public final jvr g;
    public final hvr h;

    public mvr(long j, dur durVar, qtr qtrVar, ivr ivrVar, gvr gvrVar, kvr kvrVar, jvr jvrVar, hvr hvrVar) {
        this.f22470a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = ivrVar;
        this.e = gvrVar;
        this.f = kvrVar;
        this.g = jvrVar;
        this.h = hvrVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f22470a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof mvr) && (p6t0Var2 instanceof mvr)) {
            mvr mvrVar = (mvr) p6t0Var;
            mvr mvrVar2 = (mvr) p6t0Var2;
            k9x.G(arrayList, mvrVar.e, mvrVar2.e);
            k9x.G(arrayList, mvrVar.f, mvrVar2.f);
            k9x.G(arrayList, mvrVar.g, mvrVar2.g);
            k9x.G(arrayList, mvrVar.d, mvrVar2.d);
            k9x.G(arrayList, mvrVar.h, mvrVar2.h);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvr)) {
            return false;
        }
        mvr mvrVar = (mvr) obj;
        return this.f22470a == mvrVar.f22470a && this.b.equals(mvrVar.b) && this.c.equals(mvrVar.c) && this.d.equals(mvrVar.d) && this.e.equals(mvrVar.e) && this.f.equals(mvrVar.f) && this.g.equals(mvrVar.g) && this.h.equals(mvrVar.h);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.h.hashCode() + dw9.a((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f22470a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g.f17218a);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return "GameCardType12UiModel(gameId=" + this.f22470a + ", header=" + this.b + ", footer=" + this.c + ", infoText=" + this.d + ", firstPlayer=" + this.e + ", secondPlayer=" + this.f + ", results=" + this.g + ", gameScore=" + this.h + Separators.RPAREN;
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
