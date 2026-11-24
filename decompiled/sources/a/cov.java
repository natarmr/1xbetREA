package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class cov implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4720a;
    public final snv b;
    public final String c;
    public final int d;
    public final wnv e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final vnv j;
    public final int k;

    public cov(String str, snv snvVar, String str2, int i, wnv wnvVar, String str3, int i2, String str4, String str5, vnv vnvVar, int i3) {
        this.f4720a = str;
        this.b = snvVar;
        this.c = str2;
        this.d = i;
        this.e = wnvVar;
        this.f = str3;
        this.g = i2;
        this.h = str4;
        this.i = str5;
        this.j = vnvVar;
        this.k = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cov)) {
            return false;
        }
        cov covVar = (cov) obj;
        return this.f4720a.equals(covVar.f4720a) && this.b.equals(covVar.b) && this.c.equals(covVar.c) && this.d == covVar.d && this.e.equals(covVar.e) && this.f.equals(covVar.f) && this.g == covVar.g && this.h.equals(covVar.h) && this.i.equals(covVar.i) && this.j.equals(covVar.j) && this.k == covVar.k;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof cov) && (p6t0Var2 instanceof cov)) {
            return ((cov) p6t0Var).f4720a.equals(((cov) p6t0Var2).f4720a);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + ((this.j.hashCode() + ua80.b(ua80.b(twn.a(this.g, ua80.b((this.e.hashCode() + twn.a(this.d, ua80.b((this.b.hashCode() + (this.f4720a.hashCode() * 31)) * 31, 31, this.c), 31)) * 31, 31, this.f), 31), 31, this.h), 31, this.i)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof cov) || !(p6t0Var2 instanceof cov)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cov covVar = (cov) p6t0Var;
        cov covVar2 = (cov) p6t0Var2;
        k9x.G(linkedHashSet, covVar.b, covVar2.b);
        k9x.G(linkedHashSet, new tnv(covVar.c), new tnv(covVar2.c));
        k9x.G(linkedHashSet, new unv(covVar.d), new unv(covVar2.d));
        k9x.G(linkedHashSet, covVar.e, covVar2.e);
        k9x.G(linkedHashSet, new xnv(covVar.f), new xnv(covVar2.f));
        k9x.G(linkedHashSet, new ynv(covVar.g), new ynv(covVar2.g));
        k9x.G(linkedHashSet, covVar.j, covVar2.j);
        k9x.G(linkedHashSet, new aov(covVar.h), new aov(covVar2.h));
        k9x.G(linkedHashSet, new znv(covVar.i), new znv(covVar2.i));
        k9x.G(linkedHashSet, new rnv(covVar.k), new rnv(covVar2.k));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("FirstTeamWinTitle(value=", this.c, Separators.RPAREN);
        String strE = ua80.e(this.d, "FirstTeamWinTitleColor(value=", Separators.RPAREN);
        String strL2 = kng0.l("SecondTeamWinTitle(value=", this.f, Separators.RPAREN);
        String strE2 = ua80.e(this.g, "SecondTeamWinTitleColor(value=", Separators.RPAREN);
        String strL3 = kng0.l("TournamentTitle(value=", this.h, Separators.RPAREN);
        String strL4 = kng0.l("TournamentDate(value=", this.i, Separators.RPAREN);
        String strE3 = ua80.e(this.k, "Background(value=", Separators.RPAREN);
        StringBuilder sb = new StringBuilder("HeadToHeadLastMatchesGameUiModel(id=");
        sb.append(this.f4720a);
        sb.append(", firstTeamImage=");
        sb.append(this.b);
        sb.append(", firstTeamWinTitle=");
        f140.v(sb, strL, ", firstTeamTitleColorRes=", strE, ", secondTeamImage=");
        sb.append(this.e);
        sb.append(", secondTeamWinTitle=");
        sb.append(strL2);
        sb.append(", secondTeamTitleColorRes=");
        f140.v(sb, strE2, ", tournamentTitle=", strL3, ", tournamentDate=");
        sb.append(strL4);
        sb.append(", score=");
        sb.append(this.j);
        sb.append(", backgroundRes=");
        return axq.n(sb, strE3, Separators.RPAREN);
    }
}
