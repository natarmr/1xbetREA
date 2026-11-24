package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fpu0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9944a;
    public final vrm b;

    public fpu0(String str, vrm vrmVar) {
        this.f9944a = str;
        this.b = vrmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpu0)) {
            return false;
        }
        fpu0 fpu0Var = (fpu0) obj;
        return this.f9944a.equals(fpu0Var.f9944a) && this.b.equals(fpu0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f9944a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9944a.hashCode() * 31);
    }

    public final String toString() {
        return "VirtualGameCategoryMainChampionshipUiModel(key=" + this.f9944a + ", item=" + this.b + Separators.RPAREN;
    }
}
