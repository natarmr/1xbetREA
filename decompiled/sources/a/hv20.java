package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hv20 implements lv20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xvm0 f13707a;

    public hv20(xvm0 xvm0Var) {
        xvm0Var.getClass();
        this.f13707a = xvm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv20) && Intrinsics.d(this.f13707a, ((hv20) obj).f13707a);
    }

    public final int hashCode() {
        return this.f13707a.hashCode();
    }

    public final String toString() {
        return "UpdateCurrentSubGame(subGame=" + this.f13707a + Separators.RPAREN;
    }
}
