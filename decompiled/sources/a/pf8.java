package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26889a;
    public final List b;
    public final nw80 c;
    public final m7m0 d;
    public final qp9 e;

    public pf8(String str, List list, nw80 nw80Var, m7m0 m7m0Var, qp9 qp9Var) {
        str.getClass();
        list.getClass();
        this.f26889a = str;
        this.b = list;
        this.c = nw80Var;
        this.d = m7m0Var;
        this.e = qp9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf8)) {
            return false;
        }
        pf8 pf8Var = (pf8) obj;
        return Intrinsics.d(this.f26889a, pf8Var.f26889a) && Intrinsics.d(this.b, pf8Var.b) && this.c == pf8Var.c && this.d == pf8Var.d && this.e.equals(pf8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + dw9.a(this.f26889a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("BonusItemsContainer(title=", this.f26889a, ", listOfItemsChips=", this.b, ", partitionType=");
        sbF.append(this.c);
        sbF.append(", stateBonus=");
        sbF.append(this.d);
        sbF.append(", callbackClickModelContainer=");
        sbF.append(this.e);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
