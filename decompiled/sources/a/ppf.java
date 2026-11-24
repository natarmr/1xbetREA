package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ppf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27373a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final wpf j;
    public final wpf k;
    public final wpf l;
    public final wpf m;

    public ppf(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, wpf wpfVar, wpf wpfVar2, wpf wpfVar3, wpf wpfVar4) {
        this.f27373a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = wpfVar;
        this.k = wpfVar2;
        this.l = wpfVar3;
        this.m = wpfVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppf)) {
            return false;
        }
        ppf ppfVar = (ppf) obj;
        return this.f27373a.equals(ppfVar.f27373a) && this.b == ppfVar.b && this.c == ppfVar.c && this.d == ppfVar.d && this.e == ppfVar.e && this.f == ppfVar.f && this.g == ppfVar.g && this.h == ppfVar.h && this.i == ppfVar.i && this.j == ppfVar.j && this.k == ppfVar.k && this.l == ppfVar.l && this.m == ppfVar.m;
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + twn.a(this.i, twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f27373a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "Cs2MatchInfoModel(mapName=", this.f27373a, ", mapNumber=", ", firstTeamScore=");
        axq.r(this.c, this.d, ", secondTeamScore=", ", mapWinner=", sbP);
        axq.r(this.e, this.f, ", firstTeamCountRoundTerrorist=", ", firstTeamCountRoundCt=", sbP);
        axq.r(this.g, this.h, ", secondTeamCountRoundTerrorist=", ", secondTeamCountRoundCt=", sbP);
        sbP.append(this.i);
        sbP.append(", firstTeamFirstPeriodRole=");
        sbP.append(this.j);
        sbP.append(", firstTeamSecondPeriodRole=");
        sbP.append(this.k);
        sbP.append(", secondTeamFirstPeriodRole=");
        sbP.append(this.l);
        sbP.append(", secondTeamSecondPeriodRole=");
        sbP.append(this.m);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
