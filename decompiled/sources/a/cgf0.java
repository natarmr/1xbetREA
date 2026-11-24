package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cgf0 implements hgf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmy f4310a;
    public final cny b;

    public cgf0(nmy nmyVar, cny cnyVar) {
        this.f4310a = nmyVar;
        this.b = cnyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgf0)) {
            return false;
        }
        cgf0 cgf0Var = (cgf0) obj;
        return this.f4310a == cgf0Var.f4310a && this.b == cgf0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4310a.hashCode() * 31);
    }

    public final String toString() {
        return "OnFiltersChange(filter=" + this.f4310a + ", sort=" + this.b + Separators.RPAREN;
    }
}
