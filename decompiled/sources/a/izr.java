package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class izr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15648a;
    public final dur b;
    public final qtr c;
    public final ezr d;
    public final fzr e;
    public final czr f;
    public final fus g;
    public final CharSequence h;

    public izr(long j, dur durVar, qtr qtrVar, ezr ezrVar, fzr fzrVar, czr czrVar, fus fusVar, CharSequence charSequence) {
        this.f15648a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = ezrVar;
        this.e = fzrVar;
        this.f = czrVar;
        this.g = fusVar;
        this.h = charSequence;
    }

    @Override // a.b0s
    public final long a() {
        return this.f15648a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof izr) && (p6t0Var2 instanceof izr)) {
            izr izrVar = (izr) p6t0Var;
            izr izrVar2 = (izr) p6t0Var2;
            k9x.G(arrayList, izrVar.d, izrVar2.d);
            k9x.G(arrayList, izrVar.e, izrVar2.e);
            k9x.G(arrayList, izrVar.f, izrVar2.f);
            k9x.G(arrayList, new gzr(izrVar.g), new gzr(izrVar2.g));
            k9x.G(arrayList, new dzr(izrVar.h), new dzr(izrVar2.h));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izr)) {
            return false;
        }
        izr izrVar = (izr) obj;
        return this.f15648a == izrVar.f15648a && this.b.equals(izrVar.b) && this.c.equals(izrVar.c) && this.d.equals(izrVar.d) && this.e.equals(izrVar.e) && this.f.equals(izrVar.f) && this.g.equals(izrVar.g) && this.h.equals(izrVar.h);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f15648a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        String strI = axq.i("Timer(value=", this.g, Separators.RPAREN);
        String str = "Score(value=" + ((Object) this.h) + Separators.RPAREN;
        StringBuilder sb = new StringBuilder("GameCardType7UiModel(gameId=");
        sb.append(this.f15648a);
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
        f140.v(sb, ", timer=", strI, ", score=", str);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
