package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class q2b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr5 f27993a;
    public final boolean b;

    public q2b(kr5 kr5Var, boolean z) {
        this.f27993a = kr5Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2b)) {
            return false;
        }
        q2b q2bVar = (q2b) obj;
        return this.f27993a.equals(q2bVar.f27993a) && this.b == q2bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f27993a.hashCode() * 31);
    }

    public final String toString() {
        return "CatalogBannerModel(banner=" + this.f27993a + ", new=" + this.b + Separators.RPAREN;
    }
}
