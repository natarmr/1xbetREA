package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ul4 implements xl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu4 f35855a;
    public final ynb0 b;

    public ul4(uu4 uu4Var, ynb0 ynb0Var) {
        ynb0Var.getClass();
        this.f35855a = uu4Var;
        this.b = ynb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul4)) {
            return false;
        }
        ul4 ul4Var = (ul4) obj;
        return this.f35855a.equals(ul4Var.f35855a) && Intrinsics.d(this.b, ul4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35855a.hashCode() * 31);
    }

    public final String toString() {
        return "PerformAfterCaptcha(authorizationData=" + this.f35855a + ", powWrapper=" + this.b + Separators.RPAREN;
    }
}
