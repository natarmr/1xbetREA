package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class jxr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17322a;
    public final dur b;
    public final qtr c;
    public final String d;
    public final p5h0 e;
    public final axr f;
    public final fxr g;
    public final ywr h;
    public final ywr i;
    public final ywr j;
    public final ywr k;
    public final ywr l;

    public jxr(long j, dur durVar, qtr qtrVar, String str, p5h0 p5h0Var, axr axrVar, fxr fxrVar, ywr ywrVar, ywr ywrVar2, ywr ywrVar3, ywr ywrVar4, ywr ywrVar5) {
        this.f17322a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = str;
        this.e = p5h0Var;
        this.f = axrVar;
        this.g = fxrVar;
        this.h = ywrVar;
        this.i = ywrVar2;
        this.j = ywrVar3;
        this.k = ywrVar4;
        this.l = ywrVar5;
    }

    @Override // a.b0s
    public final long a() {
        return this.f17322a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof jxr) && (p6t0Var2 instanceof jxr)) {
            jxr jxrVar = (jxr) p6t0Var;
            jxr jxrVar2 = (jxr) p6t0Var2;
            k9x.G(arrayList, new dxr(jxrVar.d), new dxr(jxrVar2.d));
            k9x.G(arrayList, new exr(jxrVar.e), new exr(jxrVar2.e));
            k9x.G(arrayList, jxrVar.f, jxrVar2.f);
            k9x.G(arrayList, jxrVar.g, jxrVar2.g);
            k9x.G(arrayList, new bxr(jxrVar.h), new bxr(jxrVar2.h));
            k9x.G(arrayList, new gxr(jxrVar.i), new gxr(jxrVar2.i));
            k9x.G(arrayList, new hxr(jxrVar.j), new hxr(jxrVar2.j));
            k9x.G(arrayList, new cxr(jxrVar.k), new cxr(jxrVar2.k));
            k9x.G(arrayList, new zwr(jxrVar.l), new zwr(jxrVar2.l));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxr)) {
            return false;
        }
        jxr jxrVar = (jxr) obj;
        return this.f17322a == jxrVar.f17322a && this.b.equals(jxrVar.b) && this.c.equals(jxrVar.c) && this.d.equals(jxrVar.d) && this.e.equals(jxrVar.e) && this.f.equals(jxrVar.f) && this.g.equals(jxrVar.g) && this.h.equals(jxrVar.h) && this.i.equals(jxrVar.i) && this.j.equals(jxrVar.j) && this.k.equals(jxrVar.k) && this.l.equals(jxrVar.l);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f17322a) * 31)) * 31)) * 31, 31, this.d)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        String strL = kng0.l("GameLabel(value=", this.d, Separators.RPAREN);
        String strJ = axq.j("Score(value=", this.e, Separators.RPAREN);
        String str = "FirstValue(statistic=" + this.h + Separators.RPAREN;
        String str2 = "SecondValue(statistic=" + this.i + Separators.RPAREN;
        String str3 = "ThirdValue(statistic=" + this.j + Separators.RPAREN;
        String str4 = "FourthValue(statistic=" + this.k + Separators.RPAREN;
        String str5 = "FifthValue(statistic=" + this.l + Separators.RPAREN;
        StringBuilder sb = new StringBuilder("GameCardType17UiModel(gameId=");
        sb.append(this.f17322a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", footer=");
        sb.append(this.c);
        sb.append(", gameLabel=");
        sb.append(strL);
        sb.append(", score=");
        sb.append(strJ);
        sb.append(", firstTeam=");
        sb.append(this.f);
        sb.append(", secondTeam=");
        sb.append(this.g);
        sb.append(", firstValue=");
        sb.append(str);
        f140.v(sb, ", secondValue=", str2, ", thirdValue=", str3);
        f140.v(sb, ", fourthValue=", str4, ", fifthValue=", str5);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
