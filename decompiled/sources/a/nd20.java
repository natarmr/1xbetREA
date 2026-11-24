package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nd20 implements od20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f23321a;
    public final ke b;
    public final String c;
    public final boolean d;

    public nd20(double d, ke keVar, String str, boolean z) {
        keVar.getClass();
        str.getClass();
        this.f23321a = d;
        this.b = keVar;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd20)) {
            return false;
        }
        nd20 nd20Var = (nd20) obj;
        return Double.compare(this.f23321a, nd20Var.f23321a) == 0 && Intrinsics.d(this.b, nd20Var.b) && Intrinsics.d(this.c, nd20Var.c) && this.d == nd20Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b((this.b.hashCode() + (Double.hashCode(this.f23321a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Value(balanceMoney=");
        sb.append(this.f23321a);
        sb.append(", accountInfo=");
        sb.append(this.b);
        w6x.z(", balanceString=", this.c, ", isCanChangeBalance=", sb, this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
