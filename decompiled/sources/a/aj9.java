package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class aj9 {
    public static final aj9 b = new aj9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ol50 f963a;

    public aj9() {
        this.f963a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aj9) {
            return Intrinsics.d(this.f963a, ((aj9) obj).f963a);
        }
        return false;
    }

    public final int hashCode() {
        ol50 ol50Var = this.f963a;
        if (ol50Var != null) {
            return ol50Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.f963a + Separators.RPAREN;
    }

    public aj9(ol50 ol50Var) {
        this.f963a = ol50Var;
    }
}
