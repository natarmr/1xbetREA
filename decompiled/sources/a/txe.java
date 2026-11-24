package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class txe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34694a;
    public final int b;
    public final gao0 c;
    public final m0d d;
    public final String e;
    public final boolean f;
    public final h680 g;

    public txe(long j, int i, gao0 gao0Var, m0d m0dVar, String str, boolean z, h680 h680Var) {
        this.f34694a = j;
        this.b = i;
        this.c = gao0Var;
        this.d = m0dVar;
        this.e = str;
        this.f = z;
        this.g = h680Var;
    }

    public static txe a(txe txeVar, long j, int i, gao0 gao0Var, m0d m0dVar, String str, boolean z, h680 h680Var, int i2) {
        if ((i2 & 1) != 0) {
            j = txeVar.f34694a;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = txeVar.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            gao0Var = txeVar.c;
        }
        gao0 gao0Var2 = gao0Var;
        if ((i2 & 8) != 0) {
            m0dVar = txeVar.d;
        }
        m0d m0dVar2 = m0dVar;
        if ((i2 & 16) != 0) {
            str = txeVar.e;
        }
        String str2 = str;
        boolean z2 = (i2 & 32) != 0 ? txeVar.f : z;
        h680 h680Var2 = (i2 & 64) != 0 ? txeVar.g : h680Var;
        txeVar.getClass();
        str2.getClass();
        return new txe(j2, i3, gao0Var2, m0dVar2, str2, z2, h680Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txe)) {
            return false;
        }
        txe txeVar = (txe) obj;
        return this.f34694a == txeVar.f34694a && this.b == txeVar.b && this.c.equals(txeVar.c) && this.d.equals(txeVar.d) && this.e.equals(txeVar.e) && this.f == txeVar.f && Intrinsics.d(this.g, txeVar.g);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b((this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Long.hashCode(this.f34694a) * 31, 31)) * 31)) * 31, 31, this.e), 31, this.f);
        h680 h680Var = this.g;
        return iE + (h680Var == null ? 0 : h680Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f34694a, "CouponInfoStateModel(eventsCount=", ", blocksCount=");
        sbQ.append(", systemTypeState=");
        sbQ.append(this.c);
        sbQ.append(", coefficientStateModel=");
        sbQ.append(this.d);
        w6x.z(", coefficientChangeDesc=", this.e, ", isAutoSub=", sbQ, this.f);
        sbQ.append(", optionBetStateModel=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
