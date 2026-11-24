package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ms9 implements us9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22308a;
    public final boolean b;

    public ms9(lc00 lc00Var, boolean z) {
        lc00Var.getClass();
        this.f22308a = lc00Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms9)) {
            return false;
        }
        ms9 ms9Var = (ms9) obj;
        return Intrinsics.d(this.f22308a, ms9Var.f22308a) && this.b == ms9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f22308a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(list=" + this.f22308a + ", isLoading=" + this.b + Separators.RPAREN;
    }
}
