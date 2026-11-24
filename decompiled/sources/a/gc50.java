package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class gc50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11043a;
    public final ic50 b;
    public final int c;
    public Function0 d;
    public final boolean e;

    public gc50(String str, ic50 ic50Var, int i, Function0 function0, int i2) {
        boolean z = (i2 & 1024) == 0;
        this.f11043a = str;
        this.b = ic50Var;
        this.c = i;
        this.d = function0;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc50)) {
            return false;
        }
        gc50 gc50Var = (gc50) obj;
        return this.f11043a.equals(gc50Var.f11043a) && this.b == gc50Var.b && this.c == gc50Var.c && this.d.equals(gc50Var.d) && this.e == gc50Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e((this.d.hashCode() + twn.a(this.c, (this.b.hashCode() + (this.f11043a.hashCode() * 31)) * 31, 31)) * 31, 31, true), 28629151, false);
    }

    public final String toString() {
        Function0 function0 = this.d;
        StringBuilder sb = new StringBuilder("NavigationBarButtonModel(iconId=");
        sb.append(this.f11043a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", iconRes=");
        sb.append(this.c);
        sb.append(", onClick=");
        sb.append(function0);
        sb.append(", isClickable=true, isDisable=false, badgeType=null, counterStyle=null, counter=null, badgeStatus=null, isSearchButton=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
