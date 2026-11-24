package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z030 implements g130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xgl0 f43545a;

    public z030(xgl0 xgl0Var) {
        xgl0Var.getClass();
        this.f43545a = xgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z030) && Intrinsics.d(this.f43545a, ((z030) obj).f43545a);
    }

    public final int hashCode() {
        return this.f43545a.hashCode();
    }

    public final String toString() {
        return "EventBetLongClick(coefParams=" + this.f43545a + Separators.RPAREN;
    }
}
