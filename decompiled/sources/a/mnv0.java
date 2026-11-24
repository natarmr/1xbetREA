package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mnv0 implements nnv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f22109a;

    public mnv0(imm immVar) {
        this.f22109a = immVar;
    }

    @Override // a.nnv0
    public final imm a() {
        return this.f22109a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnv0) && this.f22109a.equals(((mnv0) obj).f22109a);
    }

    public final int hashCode() {
        return this.f22109a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f22109a, "Loading(navigationBarModel=", Separators.RPAREN);
    }
}
