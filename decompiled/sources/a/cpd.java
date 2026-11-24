package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class cpd extends knd {
    public final zmk0 b;
    public final zmk0 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final zmk0 h;
    public final zmk0 i;
    public final zmk0 j;
    public final ArrayList k;
    public final zmk0 l;
    public final zmk0 m;
    public final zmk0 n;
    public final zmk0 o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final bex s;
    public final CardIdentity t;

    public cpd(zmk0 zmk0Var, zmk0 zmk0Var2, String str, String str2, String str3, String str4, zmk0 zmk0Var3, zmk0 zmk0Var4, zmk0 zmk0Var5, ArrayList arrayList, zmk0 zmk0Var6, zmk0 zmk0Var7, zmk0 zmk0Var8, zmk0 zmk0Var9, boolean z, boolean z2, boolean z3, bex bexVar, CardIdentity cardIdentity) {
        this.b = zmk0Var;
        this.c = zmk0Var2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = zmk0Var3;
        this.i = zmk0Var4;
        this.j = zmk0Var5;
        this.k = arrayList;
        this.l = zmk0Var6;
        this.m = zmk0Var7;
        this.n = zmk0Var8;
        this.o = zmk0Var9;
        this.p = z;
        this.q = z2;
        this.r = z3;
        this.s = bexVar;
        this.t = cardIdentity;
    }

    @Override // a.knd
    public final CardIdentity a() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpd)) {
            return false;
        }
        cpd cpdVar = (cpd) obj;
        return this.b.equals(cpdVar.b) && this.c.equals(cpdVar.c) && this.d.equals(cpdVar.d) && this.e.equals(cpdVar.e) && this.f.equals(cpdVar.f) && this.g.equals(cpdVar.g) && this.h.equals(cpdVar.h) && this.i.equals(cpdVar.i) && this.j.equals(cpdVar.j) && this.k.equals(cpdVar.k) && this.l.equals(cpdVar.l) && this.m.equals(cpdVar.m) && this.n.equals(cpdVar.n) && this.o.equals(cpdVar.o) && this.p == cpdVar.p && this.q == cpdVar.q && this.r == cpdVar.r && this.s == cpdVar.s && this.t.equals(cpdVar.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + ((this.s.hashCode() + brm0.e(brm0.e(brm0.e(axq.b(this.o, axq.b(this.n, axq.b(this.m, axq.b(this.l, twn.g(this.k, axq.b(this.j, axq.b(this.i, axq.b(this.h, ua80.b(ua80.b(ua80.b(ua80.b(axq.b(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.p), 31, this.q), 31, this.r)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedCardPeriodUiModel(teamOneName=");
        sb.append(this.b);
        sb.append(", teamTwoName=");
        sb.append(this.c);
        sb.append(", teamOneFirstPlayerImageUrl=");
        f140.v(sb, this.d, ", teamOneSecondPlayerImageUrl=", this.e, ", teamTwoFirstPlayerImageUrl=");
        f140.v(sb, this.f, ", teamTwoSecondPlayerImageUrl=", this.g, ", teamOneTotalScore=");
        sb.append(this.h);
        sb.append(", teamTwoTotalScore=");
        sb.append(this.i);
        sb.append(", timePeriodName=");
        sb.append(this.j);
        sb.append(", compressedPeriodInfoUiModelList=");
        sb.append(this.k);
        sb.append(", teamOneTennisGameScore=");
        sb.append(this.l);
        sb.append(", teamTwoTennisGameScore=");
        sb.append(this.m);
        sb.append(", teamOnePointsScore=");
        sb.append(this.n);
        sb.append(", teamTwoPointsScore=");
        sb.append(this.o);
        sb.append(", isPointEnable=");
        ua80.u(", hostsVsGuests=", ", pairTeam=", sb, this.p, this.q);
        sb.append(this.r);
        sb.append(", inningState=");
        sb.append(this.s);
        sb.append(", cardIdentity=");
        sb.append(this.t);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
