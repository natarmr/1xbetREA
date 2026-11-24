package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ddh implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5896a;
    public final byte b;
    public final uch c;
    public final adh d;
    public final wch e;
    public final ank0 f;
    public final ank0 g;
    public final int h;
    public final xch i;
    public final String j;
    public final boolean k;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public ddh(String str, long j, uch uchVar, adh adhVar, wch wchVar, ank0 ank0Var, ank0 ank0Var2, int i, xch xchVar, String str2, boolean z) {
        str2.getClass();
        this.f5896a = str;
        this.b = (int) j;
        this.c = uchVar;
        this.d = adhVar;
        this.e = wchVar;
        this.f = ank0Var;
        this.g = ank0Var2;
        this.h = i;
        this.i = xchVar;
        this.j = str2;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddh)) {
            return false;
        }
        ddh ddhVar = (ddh) obj;
        return this.f5896a.equals(ddhVar.f5896a) && ((long) this.b) == ((long) ddhVar.b) && this.c.equals(ddhVar.c) && this.d.equals(ddhVar.d) && this.e.equals(ddhVar.e) && this.f.equals(ddhVar.f) && this.g.equals(ddhVar.g) && this.h == ddhVar.h && this.i.equals(ddhVar.i) && Intrinsics.d(this.j, ddhVar.j) && this.k == ddhVar.k;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof ddh) && (p6t0Var2 instanceof ddh) && ((long) ((ddh) p6t0Var).b) == ((long) ((ddh) p6t0Var2).b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f5896a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ua80.b((this.i.hashCode() + twn.a(this.h, dw9.a(dw9.a((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + rw2.b(this.f5896a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f.f1159a), 31, this.g.f1159a), 31)) * 31, 31, this.j);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof ddh) || !(p6t0Var2 instanceof ddh)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ddh ddhVar = (ddh) p6t0Var;
        ddh ddhVar2 = (ddh) p6t0Var2;
        k9x.G(linkedHashSet, ddhVar.c, ddhVar2.c);
        k9x.G(linkedHashSet, ddhVar.d, ddhVar2.d);
        k9x.G(linkedHashSet, ddhVar.e, ddhVar2.e);
        k9x.G(linkedHashSet, new vch(ddhVar.f), new vch(ddhVar2.f));
        k9x.G(linkedHashSet, new bdh(ddhVar.g), new bdh(ddhVar2.g));
        k9x.G(linkedHashSet, new tch(ddhVar.h), new tch(ddhVar2.h));
        k9x.G(linkedHashSet, ddhVar.i, ddhVar2.i);
        k9x.G(linkedHashSet, new ych(ddhVar.j), new ych(ddhVar2.j));
        k9x.G(linkedHashSet, new zch(ddhVar.k), new zch(ddhVar2.k));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        long j = this.b;
        String strP = w6x.p("FirstTeamScore(value=", this.f, Separators.RPAREN);
        String strP2 = w6x.p("SecondTeamScore(value=", this.g, Separators.RPAREN);
        String strE = ua80.e(this.h, "Background(value=", Separators.RPAREN);
        String strL = kng0.l("MapName(value=", this.j, Separators.RPAREN);
        String strD = defpackage.c.d("ScoreVisibility(value=", Separators.RPAREN, this.k);
        StringBuilder sbO = f140.o(j, "CyberSeriesMapsUiModel(key=", this.f5896a, ", id=");
        sbO.append(", firstTeam=");
        sbO.append(this.c);
        sbO.append(", secondTeam=");
        sbO.append(this.d);
        sbO.append(", mapBackground=");
        sbO.append(this.e);
        sbO.append(", firstTeamScore=");
        sbO.append(strP);
        f140.v(sbO, ", secondTeamScore=", strP2, ", background=", strE);
        sbO.append(", mapDescription=");
        sbO.append(this.i);
        sbO.append(", mapName=");
        sbO.append(strL);
        return rw2.o(sbO, ", scoreVisibility=", strD, Separators.RPAREN);
    }
}
