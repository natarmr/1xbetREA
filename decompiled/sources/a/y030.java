package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y030 implements g130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xgl0 f41786a;

    public y030(xgl0 xgl0Var) {
        xgl0Var.getClass();
        this.f41786a = xgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y030) && Intrinsics.d(this.f41786a, ((y030) obj).f41786a);
    }

    public final int hashCode() {
        return this.f41786a.hashCode();
    }

    public final String toString() {
        return "EventBetClick(coefParams=" + this.f41786a + Separators.RPAREN;
    }
}
