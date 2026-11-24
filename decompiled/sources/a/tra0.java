package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tra0 implements zra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xgl0 f34415a;

    public tra0(xgl0 xgl0Var) {
        xgl0Var.getClass();
        this.f34415a = xgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tra0) && Intrinsics.d(this.f34415a, ((tra0) obj).f34415a);
    }

    public final int hashCode() {
        return this.f34415a.hashCode();
    }

    public final String toString() {
        return "OnMarketClick(coefParams=" + this.f34415a + Separators.RPAREN;
    }
}
