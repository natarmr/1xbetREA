package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zat0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44084a;
    public final vb90 b;

    public zat0(String str, vb90 vb90Var) {
        this.f44084a = str;
        this.b = vb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zat0)) {
            return false;
        }
        zat0 zat0Var = (zat0) obj;
        return this.f44084a.equals(zat0Var.f44084a) && this.b.equals(zat0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f44084a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44084a.hashCode() * 31);
    }

    public final String toString() {
        return "UniversalChampResultCardUiModel(key=" + this.f44084a + ", gameCardUiModel=" + this.b + Separators.RPAREN;
    }
}
