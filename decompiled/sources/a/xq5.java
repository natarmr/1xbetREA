package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41299a;

    public xq5(boolean z) {
        this.f41299a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq5) && this.f41299a == ((xq5) obj).f41299a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41299a);
    }

    public final String toString() {
        return defpackage.c.d("BannerDelegateState(isNewBanners=", Separators.RPAREN, this.f41299a);
    }
}
