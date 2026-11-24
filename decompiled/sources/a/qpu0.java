package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qpu0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29138a;
    public final jjm b;

    public qpu0(String str, jjm jjmVar) {
        this.f29138a = str;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpu0)) {
            return false;
        }
        qpu0 qpu0Var = (qpu0) obj;
        return this.f29138a.equals(qpu0Var.f29138a) && this.b.equals(qpu0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f29138a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29138a.hashCode() * 31);
    }

    public final String toString() {
        return "VirtualGameCategoryMainHeaderUiModel(key=" + this.f29138a + ", dsModel=" + this.b + Separators.RPAREN;
    }
}
