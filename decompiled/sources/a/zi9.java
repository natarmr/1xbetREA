package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zi9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ol50 f44431a;

    public zi9(ol50 ol50Var) {
        this.f44431a = ol50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi9) && Intrinsics.d(this.f44431a, ((zi9) obj).f44431a);
    }

    public final int hashCode() {
        ol50 ol50Var = this.f44431a;
        if (ol50Var != null) {
            return ol50Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.f44431a + Separators.RPAREN;
    }
}
