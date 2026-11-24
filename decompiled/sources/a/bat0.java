package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bat0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2276a;
    public final inh b;

    public bat0(String str, inh inhVar) {
        this.f2276a = str;
        this.b = inhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bat0)) {
            return false;
        }
        bat0 bat0Var = (bat0) obj;
        return this.f2276a.equals(bat0Var.f2276a) && this.b.equals(bat0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f2276a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2276a.hashCode() * 31);
    }

    public final String toString() {
        return "UniversalChampInfoUiModel(key=" + this.f2276a + ", infoModel=" + this.b + Separators.RPAREN;
    }
}
