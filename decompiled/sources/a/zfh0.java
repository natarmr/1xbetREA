package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zfh0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2n f44301a;
    public final boolean b;

    public zfh0(a2n a2nVar, boolean z) {
        this.f44301a = a2nVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfh0)) {
            return false;
        }
        zfh0 zfh0Var = (zfh0) obj;
        return this.f44301a.equals(zfh0Var.f44301a) && this.b == zfh0Var.b;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f44301a.getKey();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f44301a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchGameUiItem(model=" + this.f44301a + ", multiRows=" + this.b + Separators.RPAREN;
    }
}
