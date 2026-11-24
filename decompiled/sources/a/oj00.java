package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class oj00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25337a;
    public final boolean b;
    public final kj00 c;

    public oj00(String str, boolean z, kj00 kj00Var) {
        str.getClass();
        kj00Var.getClass();
        this.f25337a = str;
        this.b = z;
        this.c = kj00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj00)) {
            return false;
        }
        oj00 oj00Var = (oj00) obj;
        return Intrinsics.d(this.f25337a, oj00Var.f25337a) && this.b == oj00Var.b && Intrinsics.d(this.c, oj00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f25337a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("LiveExpressesScreenUiState(headerTitle=", this.f25337a, ", isRefreshing=", this.b, ", contentUiState=");
        sbU.append(this.c);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
