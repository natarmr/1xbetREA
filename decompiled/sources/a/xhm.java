package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xhm implements yhm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40899a;
    public final boolean b;
    public final ee c;
    public final sd d;

    public xhm(String str, boolean z, ee eeVar, sd sdVar) {
        str.getClass();
        this.f40899a = str;
        this.b = z;
        this.c = eeVar;
        this.d = sdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhm)) {
            return false;
        }
        xhm xhmVar = (xhm) obj;
        return Intrinsics.d(this.f40899a, xhmVar.f40899a) && this.b == xhmVar.b && this.c.equals(xhmVar.c) && Intrinsics.d(this.d, xhmVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + brm0.e(this.f40899a.hashCode() * 31, 31, this.b)) * 31;
        sd sdVar = this.d;
        return iHashCode + (sdVar == null ? 0 : sdVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("NoTabsDashboard(title=", this.f40899a, ", filtersButtonActive=", this.b, ", accountControlStyle=");
        sbU.append(this.c);
        sbU.append(", accountControlModel=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
