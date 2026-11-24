package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class euv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6k f8442a;
    public final long b;
    public final int c;
    public final int d;
    public final vne e;

    public euv0(w6k w6kVar, long j, int i, int i2, vne vneVar) {
        w6kVar.getClass();
        this.f8442a = w6kVar;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = vneVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euv0)) {
            return false;
        }
        euv0 euv0Var = (euv0) obj;
        return Intrinsics.d(this.f8442a, euv0Var.f8442a) && qkx.a(this.b, euv0Var.b) && this.c == euv0Var.c && this.d == euv0Var.d && Intrinsics.d(this.e, euv0Var.e);
    }

    public final int hashCode() {
        int iA = twn.a(this.d, twn.a(this.c, rw2.b(this.f8442a.hashCode() * 31, 31, this.b), 31), 31);
        vne vneVar = this.e;
        return iA + (vneVar == null ? 0 : vneVar.hashCode());
    }

    public final String toString() {
        String strB = qkx.b(this.b);
        StringBuilder sb = new StringBuilder("XBottomSheetEnvironmentValues(density=");
        sb.append(this.f8442a);
        sb.append(", containerSize=");
        sb.append(strB);
        sb.append(", navigationBarPaddingPx=");
        axq.r(this.c, this.d, ", statusBarPaddingPx=", ", dismissScope=", sb);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
