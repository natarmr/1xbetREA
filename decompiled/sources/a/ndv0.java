package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ndv0 implements pdv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f23353a;
    public final String b;

    public ndv0(n0x n0xVar, String str) {
        this.f23353a = n0xVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndv0)) {
            return false;
        }
        ndv0 ndv0Var = (ndv0) obj;
        return this.f23353a.equals(ndv0Var.f23353a) && this.b.equals(ndv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23353a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(sportIconLink=" + this.f23353a + ", label=" + this.b + Separators.RPAREN;
    }
}
