package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class aqd extends knd {
    public final ank0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ank0 g;
    public final ank0 h;
    public final CardIdentity i;

    public aqd(ank0 ank0Var, String str, String str2, String str3, String str4, ank0 ank0Var2, ank0 ank0Var3, CardIdentity cardIdentity) {
        str.getClass();
        str2.getClass();
        this.b = ank0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = ank0Var2;
        this.h = ank0Var3;
        this.i = cardIdentity;
    }

    @Override // a.knd
    public final CardIdentity a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqd)) {
            return false;
        }
        aqd aqdVar = (aqd) obj;
        return this.b.equals(aqdVar.b) && Intrinsics.d(this.c, aqdVar.c) && Intrinsics.d(this.d, aqdVar.d) && this.e.equals(aqdVar.e) && this.f.equals(aqdVar.f) && this.g.equals(aqdVar.g) && this.h.equals(aqdVar.h) && this.i.equals(aqdVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(this.b.f1159a.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g.f1159a), 31, this.h.f1159a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedMainCricketUiModel(matchDescription=");
        sb.append(this.b);
        sb.append(", teamOneName=");
        sb.append(this.c);
        sb.append(", teamTwoName=");
        f140.v(sb, this.d, ", teamOneLogoUrl=", this.e, ", teamTwoLogoUrl=");
        sb.append(this.f);
        sb.append(", teamOneScore=");
        sb.append(this.g);
        sb.append(", teamTwoScore=");
        sb.append(this.h);
        sb.append(", cardIdentity=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
