package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ike0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14922a;
    public final boolean b;
    public final qje0 c;

    public ike0(boolean z, boolean z2, qje0 qje0Var) {
        this.f14922a = z;
        this.b = z2;
        this.c = qje0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ike0)) {
            return false;
        }
        ike0 ike0Var = (ike0) obj;
        return this.f14922a == ike0Var.f14922a && this.b == ike0Var.b && Intrinsics.d(this.c, ike0Var.c);
    }

    public final int hashCode() {
        int iE = brm0.e(Boolean.hashCode(this.f14922a) * 31, 31, this.b);
        qje0 qje0Var = this.c;
        return iE + (qje0Var == null ? 0 : qje0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("RefereeTeamsState(isLoading=", ", isError=", ", refereeTeamModel=", this.f14922a, this.b);
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
