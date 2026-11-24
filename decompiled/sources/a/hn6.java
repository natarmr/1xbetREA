package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hn6 implements qn6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xgl0 f13336a;

    public hn6(xgl0 xgl0Var) {
        xgl0Var.getClass();
        this.f13336a = xgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hn6) && Intrinsics.d(this.f13336a, ((hn6) obj).f13336a);
    }

    public final int hashCode() {
        return this.f13336a.hashCode();
    }

    public final String toString() {
        return "OnBetClick(coefParams=" + this.f13336a + Separators.RPAREN;
    }
}
