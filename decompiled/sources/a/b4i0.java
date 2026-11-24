package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b4i0 implements c4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2i0 f1960a;

    public b4i0(i2i0 i2i0Var) {
        this.f1960a = i2i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4i0) && this.f1960a.equals(((b4i0) obj).f1960a);
    }

    public final int hashCode() {
        return this.f1960a.hashCode();
    }

    public final String toString() {
        return "DismissWithResult(result=" + this.f1960a + Separators.RPAREN;
    }
}
