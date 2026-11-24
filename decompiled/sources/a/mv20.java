package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mv20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xvm0 f22439a;

    public mv20(xvm0 xvm0Var) {
        this.f22439a = xvm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mv20) && Intrinsics.d(this.f22439a, ((mv20) obj).f22439a);
    }

    public final int hashCode() {
        xvm0 xvm0Var = this.f22439a;
        if (xvm0Var == null) {
            return 0;
        }
        return xvm0Var.hashCode();
    }

    public final String toString() {
        return "MarketGroupsDelegateStateModel(currentSubGame=" + this.f22439a + Separators.RPAREN;
    }
}
