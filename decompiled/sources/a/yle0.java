package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yle0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42836a;
    public final boolean b;
    public final boolean c;
    public final rle0 d;

    public yle0(boolean z, boolean z2, boolean z3, rle0 rle0Var) {
        this.f42836a = z;
        this.b = z2;
        this.c = z3;
        this.d = rle0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yle0)) {
            return false;
        }
        yle0 yle0Var = (yle0) obj;
        return this.f42836a == yle0Var.f42836a && this.b == yle0Var.b && this.c == yle0Var.c && Intrinsics.d(this.d, yle0Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(Boolean.hashCode(this.f42836a) * 31, 31, this.b), 31, this.c);
        rle0 rle0Var = this.d;
        return iE + (rle0Var == null ? 0 : rle0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("RefereeTourState(isLoading=", ", isError=", ", isEmpty=", this.f42836a, this.b);
        sbQ.append(this.c);
        sbQ.append(", tourModel=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
