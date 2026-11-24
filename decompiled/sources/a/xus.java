package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41526a;
    public final boolean b;
    public final int c;
    public final owq0 d;
    public final m9s e;

    public xus(String str, boolean z, int i, owq0 owq0Var, m9s m9sVar) {
        this.f41526a = str;
        this.b = z;
        this.c = i;
        this.d = owq0Var;
        this.e = m9sVar;
    }

    public static xus a(xus xusVar, int i, owq0 owq0Var, m9s m9sVar, int i2) {
        String str = xusVar.f41526a;
        boolean z = (i2 & 8) != 0 ? xusVar.b : false;
        if ((i2 & 16) != 0) {
            i = xusVar.c;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            owq0Var = xusVar.d;
        }
        owq0 owq0Var2 = owq0Var;
        if ((i2 & 64) != 0) {
            m9sVar = xusVar.e;
        }
        return new xus(str, z, i3, owq0Var2, m9sVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xus)) {
            return false;
        }
        xus xusVar = (xus) obj;
        return this.f41526a.equals(xusVar.f41526a) && this.b == xusVar.b && this.c == xusVar.c && this.d.equals(xusVar.d) && Intrinsics.d(this.e, xusVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + twn.a(this.c, brm0.e(brm0.e(brm0.e(this.f41526a.hashCode() * 31, 31, false), 31, false), 31, this.b), 31)) * 31;
        m9s m9sVar = this.e;
        return iHashCode + (m9sVar != null ? m9sVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("GameToolbarState(title=", this.f41526a, ", menuEnabled=false, quickBetVisible=false, quickBetEnabled=", this.b, ", globalChampId=");
        sbU.append(this.c);
        sbU.append(", statisticBlocksItemParams=");
        sbU.append(this.d);
        sbU.append(", gameDetails=");
        sbU.append(this.e);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
