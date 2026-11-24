package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qmv0 implements rmv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f29004a;

    public qmv0(imm immVar) {
        this.f29004a = immVar;
    }

    @Override // a.rmv0
    public final imm a() {
        return this.f29004a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmv0) && this.f29004a.equals(((qmv0) obj).f29004a);
    }

    public final int hashCode() {
        return this.f29004a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f29004a, "Loading(navigationBarModel=", Separators.RPAREN);
    }
}
