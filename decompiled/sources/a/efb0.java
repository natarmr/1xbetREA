package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class efb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hfe f7715a;
    public final lq5 b;
    public final boolean c;

    public efb0(hfe hfeVar, lq5 lq5Var, boolean z) {
        this.f7715a = hfeVar;
        this.b = lq5Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efb0)) {
            return false;
        }
        efb0 efb0Var = (efb0) obj;
        return this.f7715a.equals(efb0Var.f7715a) && this.b.equals(efb0Var.b) && this.c == efb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f7715a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopularOneXGamesMapperBannersState(banners=");
        sb.append(this.f7715a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", forceShowLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
