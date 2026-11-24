package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class apd extends knd {
    public final ank0 b;
    public final zmk0 c;
    public final zmk0 d;
    public final ank0 e;
    public final boolean f;
    public final boolean g;
    public final CardIdentity h;
    public final boolean i;

    public apd(ank0 ank0Var, zmk0 zmk0Var, zmk0 zmk0Var2, ank0 ank0Var2, boolean z, boolean z2, CardIdentity cardIdentity, boolean z3) {
        this.b = ank0Var;
        this.c = zmk0Var;
        this.d = zmk0Var2;
        this.e = ank0Var2;
        this.f = z;
        this.g = z2;
        this.h = cardIdentity;
        this.i = z3;
    }

    @Override // a.knd
    public final CardIdentity a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apd)) {
            return false;
        }
        apd apdVar = (apd) obj;
        return this.b.equals(apdVar.b) && this.c.equals(apdVar.c) && this.d.equals(apdVar.d) && this.e.equals(apdVar.e) && this.f == apdVar.f && this.g == apdVar.g && this.h.equals(apdVar.h) && this.i == apdVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + brm0.e(brm0.e(dw9.a(axq.b(this.d, axq.b(this.c, this.b.f1159a.hashCode() * 31, 31), 31), 31, this.e.f1159a), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedCardMultiTeamsUiModel(score=");
        sb.append(this.b);
        sb.append(", teamOneName=");
        sb.append(this.c);
        sb.append(", teamTwoName=");
        sb.append(this.d);
        sb.append(", matchBaseInfo=");
        sb.append(this.e);
        sb.append(", live=");
        ua80.u(", cricketGame=", ", cardIdentity=", sb, this.f, this.g);
        sb.append(this.h);
        sb.append(", rtlSupport=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
