package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ocn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25035a;
    public final boolean b;
    public final int c;
    public final i4 d;

    public ocn0(int i, i4 i4Var, String str, boolean z) {
        str.getClass();
        i4Var.getClass();
        this.f25035a = str;
        this.b = z;
        this.c = i;
        this.d = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocn0)) {
            return false;
        }
        ocn0 ocn0Var = (ocn0) obj;
        return Intrinsics.d(this.f25035a, ocn0Var.f25035a) && this.b == ocn0Var.b && this.c == ocn0Var.c && Intrinsics.d(this.d, ocn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, brm0.e(this.f25035a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("SubscriptionsTeamBetContainerUiState(navigationBarTitle=", this.f25035a, ", basketButtonEnabled=", this.b, ", selectedTab=");
        sbU.append(this.c);
        sbU.append(", tabs=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
