package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class neb0 implements oeb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo30 f23378a;
    public final meb0 b;
    public final String c;

    public neb0(vo30 vo30Var, meb0 meb0Var) {
        String strK;
        this.f23378a = vo30Var;
        this.b = meb0Var;
        if (vo30Var instanceof to30) {
            strK = kng0.k("MediumBanner", meb0Var.name());
        } else {
            if (!(vo30Var instanceof uo30)) {
                t9f.b();
                throw null;
            }
            strK = kng0.k("MediumBannerShimmer", meb0Var.name());
        }
        this.c = strK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof neb0)) {
            return false;
        }
        neb0 neb0Var = (neb0) obj;
        return this.f23378a.equals(neb0Var.f23378a) && this.b == neb0Var.b;
    }

    @Override // a.oeb0
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23378a.hashCode() * 31);
    }

    public final String toString() {
        return "MediumBanner(uiModel=" + this.f23378a + ", bannerType=" + this.b + Separators.RPAREN;
    }
}
