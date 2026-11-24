package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ngf0 implements ogf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmy f23483a;
    public final cny b;

    public ngf0(nmy nmyVar, cny cnyVar) {
        this.f23483a = nmyVar;
        this.b = cnyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngf0)) {
            return false;
        }
        ngf0 ngf0Var = (ngf0) obj;
        return this.f23483a == ngf0Var.f23483a && this.b == ngf0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23483a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowFilterDialog(chosenFilterType=" + this.f23483a + ", chosenSortType=" + this.b + Separators.RPAREN;
    }
}
