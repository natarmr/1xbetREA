package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o5q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmy f24699a;
    public final cny b;

    public o5q(nmy nmyVar, cny cnyVar) {
        this.f24699a = nmyVar;
        this.b = cnyVar;
    }

    public static o5q a(o5q o5qVar, nmy nmyVar, cny cnyVar, int i) {
        if ((i & 1) != 0) {
            nmyVar = o5qVar.f24699a;
        }
        if ((i & 2) != 0) {
            cnyVar = o5qVar.b;
        }
        return new o5q(nmyVar, cnyVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5q)) {
            return false;
        }
        o5q o5qVar = (o5q) obj;
        return this.f24699a == o5qVar.f24699a && this.b == o5qVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24699a.hashCode() * 31);
    }

    public final String toString() {
        return "FiltersBSDialogState(chosenFilterType=" + this.f24699a + ", chosenSortType=" + this.b + Separators.RPAREN;
    }
}
