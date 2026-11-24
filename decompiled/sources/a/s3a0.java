package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s3a0 implements t3a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f31547a;

    public s3a0(imm immVar) {
        this.f31547a = immVar;
    }

    @Override // a.t3a0
    public final imm a() {
        return this.f31547a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3a0) && this.f31547a.equals(((s3a0) obj).f31547a);
    }

    public final int hashCode() {
        return this.f31547a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f31547a, "Loading(dsNavigationBarUiModel=", Separators.RPAREN);
    }
}
