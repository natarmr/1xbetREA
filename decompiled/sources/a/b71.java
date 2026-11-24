package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class b71 implements h71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xw90 f2081a;

    public b71(xw90 xw90Var) {
        this.f2081a = xw90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b71) && this.f2081a == ((b71) obj).f2081a;
    }

    public final int hashCode() {
        return this.f2081a.hashCode();
    }

    public final String toString() {
        return "OnResultPlayForReal(result=" + this.f2081a + Separators.RPAREN;
    }
}
