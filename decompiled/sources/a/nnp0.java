package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nnp0 implements onp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f23834a;

    public nnp0(imm immVar) {
        this.f23834a = immVar;
    }

    @Override // a.onp0
    public final imm a() {
        return this.f23834a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnp0) && this.f23834a.equals(((nnp0) obj).f23834a);
    }

    public final int hashCode() {
        return this.f23834a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f23834a, "Loading(navigationBarUiModel=", Separators.RPAREN);
    }
}
