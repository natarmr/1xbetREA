package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ki20 implements mi20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18316a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public ki20(List list, boolean z, boolean z2, boolean z3) {
        this.f18316a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki20)) {
            return false;
        }
        ki20 ki20Var = (ki20) obj;
        return this.f18316a == ki20Var.f18316a && this.b == ki20Var.b && this.c == ki20Var.c && this.d.equals(ki20Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f18316a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Authorized(promoBetEnabled=", ", autoBetEnabled=", ", tabsAreVisible=", this.f18316a, this.b);
        sbQ.append(this.c);
        sbQ.append(", pages=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
