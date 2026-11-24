package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class xnd extends knd {
    public final zmk0 b;
    public final zmk0 c;
    public final String d;
    public final String e;
    public final zmk0 f;
    public final zmk0 g;
    public final boolean h;
    public final List i;
    public final CardIdentity j;

    public xnd(zmk0 zmk0Var, zmk0 zmk0Var2, String str, String str2, zmk0 zmk0Var3, zmk0 zmk0Var4, boolean z, lc00 lc00Var, CardIdentity cardIdentity) {
        lc00Var.getClass();
        this.b = zmk0Var;
        this.c = zmk0Var2;
        this.d = str;
        this.e = str2;
        this.f = zmk0Var3;
        this.g = zmk0Var4;
        this.h = z;
        this.i = lc00Var;
        this.j = cardIdentity;
    }

    @Override // a.knd
    public final CardIdentity a() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnd)) {
            return false;
        }
        xnd xndVar = (xnd) obj;
        return this.b.equals(xndVar.b) && this.c.equals(xndVar.c) && this.d.equals(xndVar.d) && this.e.equals(xndVar.e) && this.f.equals(xndVar.f) && this.g.equals(xndVar.g) && this.h == xndVar.h && Intrinsics.d(this.i, xndVar.i) && this.j.equals(xndVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + dw9.a(brm0.e(axq.b(this.g, axq.b(this.f, ua80.b(ua80.b(axq.b(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedCardFootballPeriodUiModel(teamOneName=");
        sb.append(this.b);
        sb.append(", teamTwoName=");
        sb.append(this.c);
        sb.append(", teamOneImageUrl=");
        f140.v(sb, this.d, ", teamTwoImageUrl=", this.e, ", teamOneScore=");
        sb.append(this.f);
        sb.append(", teamTwoScore=");
        sb.append(this.g);
        sb.append(", hostsVsGuests=");
        vqd.y(sb, ", periodScoreUiModelList=", this.i, ", cardIdentity=", this.h);
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
