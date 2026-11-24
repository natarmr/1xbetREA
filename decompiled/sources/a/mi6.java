package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mi6 implements qi6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xgl0 f21828a;

    public mi6(xgl0 xgl0Var) {
        xgl0Var.getClass();
        this.f21828a = xgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mi6) && Intrinsics.d(this.f21828a, ((mi6) obj).f21828a);
    }

    public final int hashCode() {
        return this.f21828a.hashCode();
    }

    public final String toString() {
        return "EventClick(params=" + this.f21828a + Separators.RPAREN;
    }
}
