package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class txl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34706a;
    public final boolean b;
    public final xvl0 c;
    public final Map d;

    public txl0(boolean z, boolean z2, xvl0 xvl0Var, Map map) {
        this.f34706a = z;
        this.b = z2;
        this.c = xvl0Var;
        this.d = map;
    }

    public static txl0 a(txl0 txl0Var, boolean z, boolean z2, xvl0 xvl0Var, LinkedHashMap linkedHashMap, int i) {
        if ((i & 1) != 0) {
            z = txl0Var.f34706a;
        }
        if ((i & 2) != 0) {
            z2 = txl0Var.b;
        }
        if ((i & 4) != 0) {
            xvl0Var = txl0Var.c;
        }
        Map map = linkedHashMap;
        if ((i & 8) != 0) {
            map = txl0Var.d;
        }
        txl0Var.getClass();
        return new txl0(z, z2, xvl0Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txl0)) {
            return false;
        }
        txl0 txl0Var = (txl0) obj;
        return this.f34706a == txl0Var.f34706a && this.b == txl0Var.b && Intrinsics.d(this.c, txl0Var.c) && this.d.equals(txl0Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e(Boolean.hashCode(this.f34706a) * 31, 31, this.b);
        xvl0 xvl0Var = this.c;
        return this.d.hashCode() + ((iE + (xvl0Var == null ? 0 : xvl0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("StadiumStateModel(isLoading=", ", hasError=", ", infoModel=", this.f34706a, this.b);
        sbQ.append(this.c);
        sbQ.append(", togglesCircuits=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
