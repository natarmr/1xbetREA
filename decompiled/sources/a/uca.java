package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class uca extends ofs {
    public final String b;
    public final ohm0 c;
    public final ank0 d;
    public final String e;
    public final boolean f;
    public final hg30 g;
    public final boolean h;
    public final CardIdentity i;
    public final boolean j;

    public uca(String str, ohm0 ohm0Var, ank0 ank0Var, String str2, boolean z, hg30 hg30Var, boolean z2, CardIdentity cardIdentity, boolean z3) {
        str2.getClass();
        this.b = str;
        this.c = ohm0Var;
        this.d = ank0Var;
        this.e = str2;
        this.f = z;
        this.g = hg30Var;
        this.h = z2;
        this.i = cardIdentity;
        this.j = z3;
    }

    @Override // a.ofs
    public final CardIdentity a() {
        return this.i;
    }

    @Override // a.ofs
    public final ofs b(CardIdentity cardIdentity) {
        String str = this.e;
        str.getClass();
        return new uca(this.b, this.c, this.d, str, this.f, this.g, this.h, cardIdentity, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uca)) {
            return false;
        }
        uca ucaVar = (uca) obj;
        return this.b.equals(ucaVar.b) && this.c.equals(ucaVar.c) && this.d.equals(ucaVar.d) && Intrinsics.d(this.e, ucaVar.e) && this.f == ucaVar.f && this.g.equals(ucaVar.g) && this.h == ucaVar.h && this.i.equals(ucaVar.i) && this.j == ucaVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + brm0.e((this.g.hashCode() + brm0.e(ua80.b(dw9.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d.f1159a), 31, this.e), 31, this.f)) * 31, 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardCommonLineUiModel(score=");
        sb.append(this.b);
        sb.append(", teamsInfoUiModel=");
        sb.append(this.c);
        sb.append(", matchDescription=");
        sb.append(this.d);
        sb.append(", matchPeriodInfo=");
        sb.append(this.e);
        sb.append(", hostsVsGuests=");
        sb.append(this.f);
        sb.append(", matchTimerUiModel=");
        sb.append(this.g);
        sb.append(", bettingDisabled=");
        sb.append(this.h);
        sb.append(", cardIdentity=");
        sb.append(this.i);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.j, Separators.RPAREN);
    }
}
