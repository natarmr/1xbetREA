package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class fyr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10374a;
    public final dur b;
    public final qtr c;
    public final byr d;
    public final cyr e;
    public final ayr f;
    public final fus g;

    public fyr(long j, dur durVar, qtr qtrVar, byr byrVar, cyr cyrVar, ayr ayrVar, fus fusVar) {
        this.f10374a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = byrVar;
        this.e = cyrVar;
        this.f = ayrVar;
        this.g = fusVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f10374a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof fyr) && (p6t0Var2 instanceof fyr)) {
            fyr fyrVar = (fyr) p6t0Var;
            fyr fyrVar2 = (fyr) p6t0Var2;
            k9x.G(arrayList, fyrVar.d, fyrVar2.d);
            k9x.G(arrayList, fyrVar.e, fyrVar2.e);
            k9x.G(arrayList, fyrVar.f, fyrVar2.f);
            k9x.G(arrayList, new dyr(fyrVar.g), new dyr(fyrVar2.g));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyr)) {
            return false;
        }
        fyr fyrVar = (fyr) obj;
        return this.f10374a == fyrVar.f10374a && this.b.equals(fyrVar.b) && this.c.equals(fyrVar.c) && this.d.equals(fyrVar.d) && this.e.equals(fyrVar.e) && this.f.equals(fyrVar.f) && this.g.equals(fyrVar.g);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f10374a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        String strI = axq.i("Timer(value=", this.g, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("GameCardType3UiModel(gameId=");
        sb.append(this.f10374a);
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
        return rw2.o(sb, ", timer=", strI, Separators.RPAREN);
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
