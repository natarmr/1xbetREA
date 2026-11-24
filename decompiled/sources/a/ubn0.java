package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ubn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35390a;
    public final boolean b;
    public final boolean c;
    public final yan0 d;

    public ubn0(String str, boolean z, boolean z2, yan0 yan0Var) {
        str.getClass();
        this.f35390a = str;
        this.b = z;
        this.c = z2;
        this.d = yan0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubn0)) {
            return false;
        }
        ubn0 ubn0Var = (ubn0) obj;
        return Intrinsics.d(this.f35390a, ubn0Var.f35390a) && this.b == ubn0Var.b && this.c == ubn0Var.c && this.d.equals(ubn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(this.f35390a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("SubscriptionsScreenUiState(headerTitle=", this.f35390a, ", isRefreshing=", this.b, ", basketButtonEnabled=");
        sbU.append(this.c);
        sbU.append(", contentUiState=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
