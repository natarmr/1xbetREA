package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ehm0 implements ivw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7815a;
    public final boolean b;
    public final int c;
    public final ufx d;

    public ehm0(boolean z, boolean z2, int i, ufx ufxVar) {
        this.f7815a = z;
        this.b = z2;
        this.c = i;
        this.d = ufxVar;
    }

    public static ehm0 a(ehm0 ehm0Var, boolean z, int i, ufx ufxVar, int i2) {
        if ((i2 & 1) != 0) {
            z = ehm0Var.f7815a;
        }
        boolean z2 = (i2 & 2) != 0 ? ehm0Var.b : true;
        if ((i2 & 4) != 0) {
            i = ehm0Var.c;
        }
        if ((i2 & 8) != 0) {
            ufxVar = ehm0Var.d;
        }
        ehm0Var.getClass();
        ufxVar.getClass();
        return new ehm0(z, z2, i, ufxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehm0)) {
            return false;
        }
        ehm0 ehm0Var = (ehm0) obj;
        return this.f7815a == ehm0Var.f7815a && this.b == ehm0Var.b && this.c == ehm0Var.c && Intrinsics.d(this.d, ehm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, brm0.e(Boolean.hashCode(this.f7815a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("StatisticUiModel(isExpanded=", ", isImplemented=", ", boxCurrentTab=", this.f7815a, this.b);
        sbQ.append(this.c);
        sbQ.append(", state=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public /* synthetic */ ehm0(boolean z) {
        this(z, false, 0, wam0.f38836a);
    }
}
