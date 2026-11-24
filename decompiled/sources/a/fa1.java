package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class fa1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xw90 f9183a;

    public fa1(xw90 xw90Var) {
        this.f9183a = xw90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa1) && this.f9183a == ((fa1) obj).f9183a;
    }

    public final int hashCode() {
        return this.f9183a.hashCode();
    }

    public final String toString() {
        return "SendResult(resultType=" + this.f9183a + Separators.RPAREN;
    }
}
