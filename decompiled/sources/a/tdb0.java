package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tdb0 implements zdb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final meb0 f33761a;

    public tdb0(meb0 meb0Var) {
        this.f33761a = meb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdb0) && this.f33761a == ((tdb0) obj).f33761a;
    }

    public final int hashCode() {
        return this.f33761a.hashCode();
    }

    public final String toString() {
        return "OnMediumBannerClick(bannerType=" + this.f33761a + Separators.RPAREN;
    }
}
