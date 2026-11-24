package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19131a;
    public final boolean b;
    public final ya0 c;
    public final dbs0 d;

    public kz1(String str, boolean z, ya0 ya0Var, dbs0 dbs0Var) {
        str.getClass();
        ya0Var.getClass();
        dbs0Var.getClass();
        this.f19131a = str;
        this.b = z;
        this.c = ya0Var;
        this.d = dbs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz1)) {
            return false;
        }
        kz1 kz1Var = (kz1) obj;
        return Intrinsics.d(this.f19131a, kz1Var.f19131a) && this.b == kz1Var.b && Intrinsics.d(this.c, kz1Var.c) && Intrinsics.d(this.d, kz1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + brm0.e(this.f19131a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("AggregatorTournamentsUiState(title=", this.f19131a, ", showLoader=", this.b, ", authSectionUiState=");
        sbU.append(this.c);
        sbU.append(", tournamentsUiState=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
