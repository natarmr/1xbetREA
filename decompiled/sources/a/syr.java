package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class syr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33036a;
    public final dur b;
    public final qtr c;
    public final String d;
    public final fus e;
    public final oyr f;
    public final boolean g;

    public syr(long j, dur durVar, qtr qtrVar, String str, fus fusVar, oyr oyrVar, boolean z) {
        this.f33036a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = str;
        this.e = fusVar;
        this.f = oyrVar;
        this.g = z;
    }

    @Override // a.b0s
    public final long a() {
        return this.f33036a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof syr) && (p6t0Var2 instanceof syr)) {
            syr syrVar = (syr) p6t0Var;
            syr syrVar2 = (syr) p6t0Var2;
            k9x.G(arrayList, new qyr(syrVar.d), new qyr(syrVar2.d));
            k9x.G(arrayList, new pyr(syrVar.e), new pyr(syrVar2.e));
            k9x.G(arrayList, syrVar.f, syrVar2.f);
            k9x.G(arrayList, new nyr(syrVar.g), new nyr(syrVar2.g));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syr)) {
            return false;
        }
        syr syrVar = (syr) obj;
        return this.f33036a == syrVar.f33036a && this.b.equals(syrVar.b) && this.c.equals(syrVar.c) && this.d.equals(syrVar.d) && this.e.equals(syrVar.e) && this.f.equals(syrVar.f) && this.g == syrVar.g;
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f33036a) * 31)) * 31)) * 31, 31, this.d)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        String strL = kng0.l("GameTitle(value=", this.d, Separators.RPAREN);
        String strI = axq.i("GameTimer(value=", this.e, Separators.RPAREN);
        String strD = defpackage.c.d("BetGroup(value=", Separators.RPAREN, this.g);
        StringBuilder sb = new StringBuilder("GameCardType5UiModel(gameId=");
        sb.append(this.f33036a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", footer=");
        sb.append(this.c);
        sb.append(", gameTitle=");
        sb.append(strL);
        sb.append(", gameTimer=");
        sb.append(strI);
        sb.append(", gameInfo=");
        sb.append(this.f);
        return rw2.o(sb, ", betGroup=", strD, Separators.RPAREN);
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
