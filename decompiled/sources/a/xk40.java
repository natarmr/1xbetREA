package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xk40 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41014a;
    public final o6m b;

    public xk40(String str, o6m o6mVar) {
        this.f41014a = str;
        this.b = o6mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk40)) {
            return false;
        }
        xk40 xk40Var = (xk40) obj;
        return this.f41014a.equals(xk40Var.f41014a) && this.b.equals(xk40Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f41014a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41014a.hashCode() * 31);
    }

    public final String toString() {
        return "MlbbPreviousMapUiModel(key=" + this.f41014a + ", mapModel=" + this.b + Separators.RPAREN;
    }
}
