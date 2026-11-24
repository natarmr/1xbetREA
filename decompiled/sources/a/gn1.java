package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gn1 implements in1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zll f11567a;
    public final boolean b;
    public final boolean c;
    public final jjm d;
    public final j8b e;

    public gn1(zll zllVar, boolean z, boolean z2, jjm jjmVar, j8b j8bVar) {
        this.f11567a = zllVar;
        this.b = z;
        this.c = z2;
        this.d = jjmVar;
        this.e = j8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn1)) {
            return false;
        }
        gn1 gn1Var = (gn1) obj;
        return this.f11567a.equals(gn1Var.f11567a) && this.b == gn1Var.b && this.c == gn1Var.c && this.d.equals(gn1Var.d) && this.e.equals(gn1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e(this.f11567a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        return "AggregatorSearchUiModelAggregatorSearch(item=" + this.f11567a + ", allClickAlwaysEnable=" + this.b + ", hasSectionVirtual=" + this.c + ", headerModel=" + this.d + ", category=" + this.e + Separators.RPAREN;
    }
}
