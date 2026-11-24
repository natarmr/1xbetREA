package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g1l implements x1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ox f10518a;
    public final int b;

    public g1l(ox oxVar, int i) {
        this.f10518a = oxVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1l)) {
            return false;
        }
        g1l g1lVar = (g1l) obj;
        return this.f10518a.equals(g1lVar.f10518a) && this.b == g1lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f10518a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAdditionalInfoClick(action=" + this.f10518a + ", screenWidth=" + this.b + Separators.RPAREN;
    }
}
