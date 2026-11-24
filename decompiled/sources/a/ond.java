package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class ond extends knd {
    public final ank0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final zmk0 g;
    public final zmk0 h;
    public final ank0 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final CardIdentity n;
    public final boolean o;

    public ond(ank0 ank0Var, String str, String str2, String str3, String str4, zmk0 zmk0Var, zmk0 zmk0Var2, ank0 ank0Var2, boolean z, boolean z2, boolean z3, boolean z4, CardIdentity cardIdentity, boolean z5) {
        this.b = ank0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = zmk0Var;
        this.h = zmk0Var2;
        this.i = ank0Var2;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = cardIdentity;
        this.o = z5;
    }

    @Override // a.knd
    public final CardIdentity a() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ond)) {
            return false;
        }
        ond ondVar = (ond) obj;
        return this.b.equals(ondVar.b) && this.c.equals(ondVar.c) && this.d.equals(ondVar.d) && this.e.equals(ondVar.e) && this.f.equals(ondVar.f) && this.g.equals(ondVar.g) && this.h.equals(ondVar.h) && this.i.equals(ondVar.i) && this.j == ondVar.j && this.k == ondVar.k && this.l == ondVar.l && this.m == ondVar.m && this.n.equals(ondVar.n) && this.o == ondVar.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + ((this.n.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(axq.b(this.h, axq.b(this.g, ua80.b(ua80.b(ua80.b(ua80.b(this.b.f1159a.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31, this.i.f1159a), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedCardCommonUiModel(score=");
        sb.append(this.b);
        sb.append(", teamOneImageUrl=");
        sb.append(this.c);
        sb.append(", teamTwoImageUrl=");
        f140.v(sb, this.d, ", teamOneSecondPlayerImageId=", this.e, ", teamTwoSecondPlayerImageId=");
        sb.append(this.f);
        sb.append(", teamOneName=");
        sb.append(this.g);
        sb.append(", teamTwoName=");
        sb.append(this.h);
        sb.append(", matchBaseInfo=");
        sb.append(this.i);
        sb.append(", live=");
        ua80.u(", cricketGame=", ", pairTeam=", sb, this.j, this.k);
        ua80.u(", hostsVsGuests=", ", cardIdentity=", sb, this.l, this.m);
        sb.append(this.n);
        sb.append(", rtlSupport=");
        sb.append(this.o);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
