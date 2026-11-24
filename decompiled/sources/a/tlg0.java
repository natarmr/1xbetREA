package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.rules.api.presentation.models.RuleData;

/* JADX INFO: loaded from: classes5.dex */
public final class tlg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RuleData f34143a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final Integer e;

    public tlg0(RuleData ruleData, boolean z, int i, boolean z2, Integer num) {
        this.f34143a = ruleData;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tlg0) {
            tlg0 tlg0Var = (tlg0) obj;
            if (this.f34143a == tlg0Var.f34143a && this.b == tlg0Var.b && this.c == tlg0Var.c && this.d == tlg0Var.d && Intrinsics.d(this.e, tlg0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = brm0.e(twn.a(this.c, brm0.e(this.f34143a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        Integer num = this.e;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RulesContainer(ruleData=");
        sb.append(this.f34143a);
        sb.append(", fromGames=");
        sb.append(this.b);
        sb.append(", rulesTitleResId=");
        brm0.w(this.c, ", showToolBar=", ", promoId=", sb, this.d);
        return dw9.q(sb, this.e, Separators.RPAREN);
    }
}
