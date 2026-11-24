package a;

import android.gov.nist.core.Separators;
import java.util.List;
import org.xplatform.sportgame.subgames.impl.presentation.models.SelectedTabState;

/* JADX INFO: loaded from: classes4.dex */
public final class mwm0 implements owm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22512a;
    public final boolean b;
    public final List c;
    public final SelectedTabState d;
    public final boolean e;

    public mwm0(boolean z, boolean z2, List list, SelectedTabState selectedTabState, boolean z3) {
        this.f22512a = z;
        this.b = z2;
        this.c = list;
        this.d = selectedTabState;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwm0)) {
            return false;
        }
        mwm0 mwm0Var = (mwm0) obj;
        return this.f22512a == mwm0Var.f22512a && this.b == mwm0Var.b && this.c.equals(mwm0Var.c) && this.d.equals(mwm0Var.d) && this.e == mwm0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + dw9.a(brm0.e(Boolean.hashCode(this.f22512a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Content(filterIconVisible=", ", marketsSettingsVisible=", ", subGameItems=", this.f22512a, this.b);
        sbQ.append(this.c);
        sbQ.append(", selectedTabState=");
        sbQ.append(this.d);
        sbQ.append(", showBettingMarkets=");
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
