package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g1b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10505a;
    public final String b;
    public final String c;

    public g1b0(boolean z, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f10505a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1b0)) {
            return false;
        }
        g1b0 g1b0Var = (g1b0) obj;
        return this.f10505a == g1b0Var.f10505a && Intrinsics.d(this.b, g1b0Var.b) && Intrinsics.d(this.c, g1b0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f10505a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("PopularAuthUiModel(isAuthVisible=", ", login=", this.b, this.f10505a, ", registration="), this.c, Separators.RPAREN);
    }
}
