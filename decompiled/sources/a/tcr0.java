package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class tcr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33732a;
    public final int b;
    public final ArrayList c;
    public final ArrayList d;

    public tcr0(String str, int i, ArrayList arrayList, ArrayList arrayList2) {
        this.f33732a = str;
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcr0)) {
            return false;
        }
        tcr0 tcr0Var = (tcr0) obj;
        return this.f33732a.equals(tcr0Var.f33732a) && this.b == tcr0Var.b && this.c.equals(tcr0Var.c) && this.d.equals(tcr0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.g(this.c, twn.a(this.b, this.f33732a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "TopPlayersTabModel(title=", this.f33732a, ", type=", ", columns=");
        sbP.append(this.c);
        sbP.append(", players=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
