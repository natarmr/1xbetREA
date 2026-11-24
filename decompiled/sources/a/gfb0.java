package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gfb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hfe f11201a;
    public final boolean b;

    public gfb0(hfe hfeVar, boolean z) {
        this.f11201a = hfeVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfb0)) {
            return false;
        }
        gfb0 gfb0Var = (gfb0) obj;
        return this.f11201a.equals(gfb0Var.f11201a) && this.b == gfb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f11201a.hashCode() * 31);
    }

    public final String toString() {
        return "PopularOneXGamesMapperCategoriesState(categories=" + this.f11201a + ", forceShowLoading=" + this.b + Separators.RPAREN;
    }
}
